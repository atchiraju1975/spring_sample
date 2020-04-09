package com.pluralsight.repository;

import com.pluralsight.model.Customer;

import java.util.ArrayList;
import java.util.List;


public class HibernameCustomerRepositoryImpl implements CustomerRepository {

    public List<Customer> findall (){

        ArrayList customers = new ArrayList();

        Customer customer = new Customer();

        customer.setFirstname("Srinivasa");
        customer.setLastname("Chakka");

        customers.add(customer);

        return customers;
    }
}
