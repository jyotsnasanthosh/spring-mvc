package com.spring.mvc.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.mvc.model.Customer;

/**
 * Class to map the resultset from the database row wise RowMapper can be used to map rows
 * in a resultset on per row basis
 * @author jyotsna
 */
public class CustomerRowMapper implements RowMapper<Customer> {

	public Customer mapRow(ResultSet resultSet, int value) throws SQLException {

		CustomerExtractor customerExtractor = new CustomerExtractor();
		return customerExtractor.extractData(resultSet);
	}
}
