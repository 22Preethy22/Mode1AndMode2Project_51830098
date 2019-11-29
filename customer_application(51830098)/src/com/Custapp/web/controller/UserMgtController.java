package com.Custapp.web.controller;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Custapp.model.persistence.User;
import com.Custapp.model.persistence.UserNotFoundException;
import com.Custapp.model.service.UserService;

@Controller
public class UserMgtController {
	@Autowired
	private UserService userService;

	// @PostConstruct
	public void init() {
		userService.addUser(new User("pree", "preethy@gmail.com", "pree123",
		 "admin", true));
		userService.addUser(new User("aarthi", "aar@gmail.com", "aar123", "Manager", true));
		userService.addUser(new User("presy", "presy@gmail.com", "presy123", "employee", true));
	}

	@RequestMapping(value = "login")
	public String loginGet(HttpServletRequest req, ModelMap map) {
		map.addAttribute("userbean", new UserFormBean());
		map.addAttribute("error", req.getParameter("error"));
		return "login";
	}

	@RequestMapping(value = "logout")
	public String logout(ModelMap map) {
		map.addAttribute("userbean", new UserFormBean());
		map.addAttribute("error", "you are successfully logged out!");
		return "login";
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String loginPost(HttpServletRequest req, @Valid UserFormBean userbean, BindingResult bindingResult) {
		User user = null;

		if (bindingResult.hasErrors()) {
			return "login";
		} else {
			try {
				user = userService.getUser(userbean.getEmail(), userbean.getPassword());
			} catch (UserNotFoundException e) {
				return "redirect:login?error=login failed";
			}
		}
		HttpSession httpSession = req.getSession();
		httpSession.setAttribute("user", user);

		return "redirect:allcustomers";
	}
}
