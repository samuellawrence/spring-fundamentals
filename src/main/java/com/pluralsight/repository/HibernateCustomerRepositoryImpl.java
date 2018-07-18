package com.pluralsight.repository;

import java.util.List;
import java.util.ArrayList;

import com.pluralsight.model.Customer;

public class HibernateCustomerRepositoryImpl implements  CustomerRepository {

	public List<Customer> findAll(){
		List<Customer> customers = new ArrayList<Customer>();
		Customer customer = new Customer();
		customer.setFirstname("Samuel");
		customer.setLastname("kumar");

		customers.add(customer);
		return customers;
	}
}
