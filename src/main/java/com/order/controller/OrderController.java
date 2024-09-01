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
import com.order.service.OrderService;
import com.order.vo.CartitemVo;


@RestController
@RequestMapping(value="/api/v1/order")
@CrossOrigin(origins = "http://localhost:4200")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@PostMapping(value="/save")
	public Cart addToCart(@RequestBody Cart order) {
		if(order.getOrderNumber() == null || order.getOrderNumber().trim().isBlank()) {
			order.setOrderNumber(UUID.randomUUID().toString()); 
		}
		return orderService.addToCart(order);
	}
	
	@GetMapping(value="/getCartItems")
	public List<CartitemVo> getCartDetails() {
		return orderService.getCartDetails();
	}

}
