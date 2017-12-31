package com.spring.mvc.dao;

import java.util.List;

import com.spring.mvc.model.Customer;

/**
 * DAO interface to perform database operations
 * @author jyotsna
 */
public interface CustomerDao {

	public List<Customer> getCustomerList();
	public Customer getCustomerById(String id);
	public void addCustomer(Customer customer);
	public void updateCustomerDetails(Customer customer);
	public void deleteCustomer(String id);

}
