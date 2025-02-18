package com.order.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.order.external.entity.CartAndProductDto;

@FeignClient(name = "PRODUCT-SERVICE")
public interface ProductClient {
	
	@GetMapping("/api/v1/product/id/{id}")
	CartAndProductDto getProductById(@PathVariable("id") Integer id);

}
