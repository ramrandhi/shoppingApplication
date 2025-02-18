package com.order.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.order.clients.ProductClient;
import com.order.entity.Cart;
import com.order.external.entity.CartAndProductDto;
import com.order.repository.CartRepository;
import com.order.service.CartService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class CartServiceImpl implements CartService {

	@Autowired
	private CartRepository cartRepository;

	private final WebClient webClient;
	
	private ProductClient productClient;
	
	@Autowired
	public CartServiceImpl(WebClient.Builder webClientBuilder, ProductClient productClient) {
		this.webClient = webClientBuilder.build();
		this.productClient = productClient;
	}

	private static final String PRODUCT_SERVICE_URL = "http://PRODUCT-SERVICE:8082/api/v1/product/id/";

	@Override
	public Cart saveCartDetails(Cart cart) {
		return cartRepository.save(cart);
	}

	@Override
	@CircuitBreaker(name = "jobBreaker")
    public List<CartAndProductDto> getCartAndproductDetails() {
        List<CartAndProductDto> cartAndProductDtos = new ArrayList<>();
        List<Cart> cartDetails = cartRepository.findAll();
        // usage of web Client
//        for (Cart cart : cartDetails) {
//            String url = PRODUCT_SERVICE_URL + cart.getProductId();
//
//            CartAndProductDto productDetails = webClient.get()
//                    .uri(url)
//                    .retrieve()
//                    .bodyToMono(CartAndProductDto.class)
//                    .block();
//
//            if (productDetails != null) {
//                productDetails.setOrderNumber(cart.getOrderNumber());
//                productDetails.setProductId(cart.getProductId());
//                cartAndProductDtos.add(productDetails);
//            }
//        }
        // usage of openFeigh
        for(Cart cart: cartDetails) {
        	CartAndProductDto productDetails = productClient.getProductById(cart.getId());
        	if (productDetails != null) {
              productDetails.setOrderNumber(cart.getOrderNumber());
              productDetails.setProductId(cart.getProductId());
              cartAndProductDtos.add(productDetails);
          }
        }
        return cartAndProductDtos;
    }
}
