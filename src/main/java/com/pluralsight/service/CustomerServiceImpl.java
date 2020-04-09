package com.pluralsight.service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HibernameCustomerRepositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {


    private CustomerRepository customerRepository = new HibernameCustomerRepositoryImpl();

    public List<Customer> findall(){

        return customerRepository.findall();

    }

}
