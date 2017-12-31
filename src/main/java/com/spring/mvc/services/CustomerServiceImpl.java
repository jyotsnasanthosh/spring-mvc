package com.spring.mvc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.mvc.dao.CustomerDao;
import com.spring.mvc.model.Customer;

/**
 * Service implementation of CustomerService interface
 * @author jyotsna
 *
 */
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDao customerDao;
	
	public List<Customer> getCustomerList() {
		return customerDao.getCustomerList();
	}

	public Customer getCustomerById(String id) {
		return customerDao.getCustomerById(id);
	}

	public void addCustomer(Customer customer) {
		customerDao.addCustomer(customer);
	}

	public void updateCustomerDetails(Customer customer) {
		customerDao.updateCustomerDetails(customer);
	}

	public void deleteCustomer(String id) {
		customerDao.deleteCustomer(id);
	}

}
