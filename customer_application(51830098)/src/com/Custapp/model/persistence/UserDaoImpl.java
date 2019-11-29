package com.Custapp.model.persistence;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	private SessionFactory factory;

	private Session getSession() {
		return factory.getCurrentSession();
	}

	@Override
	public User getUser(String email, String password) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<User> users = getSession()
				.createQuery("select u from User u where u.email=:email and u.password=:password")
				.setString("email", email).setString("password", password).list();
		if (users.size() > 0) {
			return users.get(0);
		} else {
			throw new UserNotFoundException("user with email" + email + "not found");
		}

	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		getSession().save(user);

	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return getSession().createQuery("from User").list();
	}

}
