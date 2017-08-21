package com.emusicstore.controller.admin;

import com.emusicstore.model.Customer;
import com.emusicstore.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Sanjin on 20.8.2017..
 */

@RestController
@RequestMapping("/admin")
public class CustomerRestController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/customer/filter", method = RequestMethod.POST)
    public @ResponseBody
    List<Customer> getCustomerPage(Model model){

        List<Customer> customerList = customerService.getAllCustomers();
        return customerList;
    }

}
