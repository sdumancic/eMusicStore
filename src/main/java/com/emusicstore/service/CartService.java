package com.emusicstore.service;

import com.emusicstore.model.Cart;

/**
 * Created by Sanjin on 4.8.2017..
 */
public interface CartService {

    Cart getCartById(int cartId);
    void update(Cart cart);
}
