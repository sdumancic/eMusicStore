package com.emusicstore.controller.admin;

import com.emusicstore.model.Customer;
import com.emusicstore.model.Product;
import com.emusicstore.service.CustomerService;
import com.emusicstore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Sanjin on 3.8.2017..
 */

@Controller
@RequestMapping("/admin")
public class AdminHome {

    @Autowired
    private ProductService productService;

    @Autowired
    private CustomerService customerService;

    @RequestMapping
    public String adminPage(){
        return "admin";
    }

    @RequestMapping("/productInventory")
    public String productInventory(Model model){
        List<Product> products = productService.getProductList();
        model.addAttribute("products",products);

        return "productInventory";
    }

    @RequestMapping("/productInventoryPaged")
    public String productInventoryPaged(Model model){
        List<Product> products = productService.getProductList();
        model.addAttribute("products",products);

        return "productInventoryPaged";
    }

    @RequestMapping("/customer")
    public String customerManagement(Model model){
        List<Customer> customerList = customerService.getAllCustomers();
        model.addAttribute("customerList",customerList);

        return "customerManagement";
    }



}
