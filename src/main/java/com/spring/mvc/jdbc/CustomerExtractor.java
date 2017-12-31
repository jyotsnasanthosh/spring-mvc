package com.spring.mvc.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.spring.mvc.model.Customer;

/**
 * Class to return the list implementation of Customer object
 * 
 * ResultSetExtractor accepts a resultset as input parameter and returns list
 * implementation of extracted data from database.
 * @author jyotsna
 */
public class CustomerExtractor implements ResultSetExtractor<Customer> {

	public Customer extractData(ResultSet resultSet) throws SQLException,
			DataAccessException {

		Customer customer = new Customer();

		customer.setCustId(resultSet.getString(1));
		customer.setName(resultSet.getString(2));
		customer.setAge(resultSet.getInt(3));
		customer.setGender(resultSet.getString(4));
		customer.setCity(resultSet.getString(5));

		return customer;
	}

}
