package com.Custapp.model.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.Custapp.model.persistence.Customer;
import com.Custapp.model.persistence.CustomerDao;
import com.Custapp.model.persistence.CustomerDaoImpl;

@Service(value = "cs")
@Transactional // behind the scene using Aop (it is kind of around advice)
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao dao;

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub

		return dao.getAllCustomers();
	}

	@Override
	public Customer getCustomerById(int id) {
		// TODO Auto-generated method stub
		Customer customer = dao.getCustomerById(id);
		if (customer == null) {
			throw new CustomerNotFoundEx("customer with id:" + id + " is not found");
		}
		return customer;

	}

	@Override
	public Customer addCustomer(Customer customer) {
		return dao.addCustomer(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return dao.updateCustomer(customer);
	}

	@Override
	public Customer removeCustomer(int id) {
		// TODO Auto-generated method stub
		return dao.removeCustomer(id);
	}

}
