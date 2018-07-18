package com.pluralsight.service;

import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HibernateCustomerRepositoryImpl;
import com.pluralsight.model.Customer;
import java.util.List;

public class CustomerServiceImpl implements CustomerService{

	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();


	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
}
