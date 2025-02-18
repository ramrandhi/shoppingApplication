package com.order.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.entity.Cart;
import com.order.external.entity.CartAndProductDto;
import com.order.service.CartService;

@RestController
@RequestMapping(value="/api/v1/order/cart")
@CrossOrigin(origins = "http://localhost:4200")
public class CartController {
	
	@Autowired
	private CartService cartService;
	
	@PostMapping("/save")
	public Cart saveCartDetails(@RequestBody Cart cart) {
		if(cart.getOrderNumber() == null || cart.getOrderNumber().trim().isBlank()) {
			cart.setOrderNumber(UUID.randomUUID().toString()); 
		}
		return cartService.saveCartDetails(cart);
	}
	
	@GetMapping("/cartWithProductDetails")
	public List<CartAndProductDto> getCartAndproductDetails(){
		return cartService.getCartAndproductDetails();
	}
}
