package com.Custapp.model.persistence;

import java.util.List;

public interface CustomerDao {

	public List<Customer> getAllCustomers();

	public Customer getCustomerById(int id);

	public Customer addCustomer(Customer customer);

	public Customer updateCustomer(Customer customer);

	public Customer removeCustomer(int id);
}
