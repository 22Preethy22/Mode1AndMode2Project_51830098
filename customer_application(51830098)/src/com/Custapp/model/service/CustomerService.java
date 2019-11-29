package com.Custapp.model.service;

import java.util.List;

import com.Custapp.model.persistence.Customer;

public interface CustomerService {

	public List<Customer> getAllCustomers();

	public Customer getCustomerById(int id);

	public Customer addCustomer(Customer customer);

	public Customer updateCustomer(Customer customer);

	public Customer removeCustomer(int id);

}
