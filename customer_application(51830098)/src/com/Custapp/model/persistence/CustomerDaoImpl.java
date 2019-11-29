package com.Custapp.model.persistence;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private SessionFactory factory;

	private Session getSession() {
		return factory.getCurrentSession();
	}

	@Override
	public List<Customer> getAllCustomers() {
		return getSession().createQuery("from Customer").list();
	}

	@Override
	public Customer getCustomerById(int id) {
		return (Customer) getSession().get(Customer.class, id);

	}

	@Override
	public Customer addCustomer(Customer customer) {
		getSession().save(customer);
		return customer;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		getSession().update(customer);
		return customer;

	}

	@Override
	public Customer removeCustomer(int id) {

		Customer CustToBeDeleted = getCustomerById(id);
		getSession().delete(CustToBeDeleted);

		return CustToBeDeleted;

	}

}
