package com.spring.mvc.services;

import java.util.List;

import com.spring.mvc.model.Customer;

/**
 * Service interface to perform CRUD operations on Customer
 * @author jyotsna
 */
public interface CustomerService {

	public List<Customer> getCustomerList();
	public Customer getCustomerById(String id);
	public void addCustomer(Customer customer);
	public void updateCustomerDetails(Customer customer);
	public void deleteCustomer(String id);

}
