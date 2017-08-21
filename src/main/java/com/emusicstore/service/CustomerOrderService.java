package com.emusicstore.service;

import com.emusicstore.model.CustomerOrder;

/**
 * Created by Sanjin on 16.8.2017..
 */
public interface CustomerOrderService {

    void addCustomerOrder(CustomerOrder customerOrder);

    double getCustomerOrderGrandTotal(int cartId);
}
