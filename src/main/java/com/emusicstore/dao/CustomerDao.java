package com.emusicstore.dao;

import com.emusicstore.model.Customer;

import java.util.List;

/**
 * Created by Sanjin on 4.8.2017..
 */
public interface CustomerDao {
    void addCustomer(Customer customer);

    Customer getCustomerById(int  customerId);

    List<Customer> getAllCustomers();

    Customer getCustomerByUsername(String username);

}
