package com.emusicstore.dao;

import com.emusicstore.model.Cart;

import java.io.IOException;

/**
 * Created by Sanjin on 1.8.2017..
 */
public interface CartDao {

    Cart getCartById(int cartId);
    void update(Cart cart);
    Cart validate(int cartId) throws IOException;
}
