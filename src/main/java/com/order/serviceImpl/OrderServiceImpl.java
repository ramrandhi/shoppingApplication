package com.order.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.entity.Cart;
import com.order.repository.CartRepository;
import com.order.service.OrderService;
import com.order.vo.CartitemVo;
@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private CartRepository cartRepository;

	@Override
	public Cart addToCart(Cart order) {
		// TODO Auto-generated method stub
		return cartRepository.save(order);
	}

	@Override
	public List<CartitemVo> getCartDetails() {
		// TODO Auto-generated method stub
		return null;
	}

}
