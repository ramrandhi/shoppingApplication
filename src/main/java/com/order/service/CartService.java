package com.order.service;

import java.util.List;

import com.order.entity.Cart;
import com.order.external.entity.CartAndProductDto;

public interface CartService {

	Cart saveCartDetails(Cart cart);

	List<CartAndProductDto> getCartAndproductDetails();

}
