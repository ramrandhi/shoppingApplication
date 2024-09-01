package com.order.service;

import java.util.List;

import com.order.entity.Cart;
import com.order.vo.CartitemVo;

public interface OrderService {

	public Cart addToCart(Cart order);

	public List<CartitemVo> getCartDetails();

}
