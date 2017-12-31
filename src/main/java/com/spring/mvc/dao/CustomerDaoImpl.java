package com.spring.mvc.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.mvc.jdbc.CustomerRowMapper;
import com.spring.mvc.model.Customer;

/**
 * DAO Implementation of CustomerDao interface
 * @author jyotsna
 */
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	DataSource dataSource;

	/**
	 * Method to get the customer list from database
	 * Returning List<Customer> customerList
	 */
	public List<Customer> getCustomerList() {

		List<Customer> customerList = new ArrayList<Customer>();
		String query = "select * from customer";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		customerList = jdbcTemplate.query(query, new CustomerRowMapper());
		return customerList;
	}

	/**
	 * Method to get the customer based on customer id passed
	 * Returning Customer
	 */
	public Customer getCustomerById(String id) {

		List<Customer> customerList = new ArrayList<Customer>();
		String query = "select * from customer where custid=?";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		customerList = jdbcTemplate.query(query, new Object[] { id },
				new CustomerRowMapper());
		return customerList.get(0);
	}

	/**
	 * Method to insert a new customer into the database
	 */
	public void addCustomer(Customer customer) {

		String query = "INSERT INTO customer(custid, name, age, gender, city) VALUES (?,?,?,?,?)";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(
				query,
				new Object[] { customer.getCustId(), customer.getName(),
						customer.getAge(), customer.getGender(), customer.getCity() });
	}

	/**
	 * Method to update the customer details
	 */
	public void updateCustomerDetails(Customer customer) {

		String query = "UPDATE customer set name = ?, age=?, gender = ?, city = ? where custid = ?";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(query, new Object[] { customer.getName(), customer.getAge(),
				customer.getGender(), customer.getCity(), customer.getCustId() });

	}

	/**
	 * Method to delete the customer based on customer id
	 */
	public void deleteCustomer(String id) {

		String query = "DELETE FROM customer WHERE custid = ?";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(query, new Object[] { id });

	}

}
