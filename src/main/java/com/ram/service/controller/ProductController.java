package com.ram.service.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ram.service.entity.Product;
import com.ram.service.productservice.ProductService;
@RestController
@RequestMapping("/v1/product")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/all")
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}


	@GetMapping("/id/{id}")
	public Product getProductById(@PathVariable("id") Integer id) throws Exception {
		Product product = productService.getProductById(id);
		if (product == null) {
			throw new Exception("Indent id : " + id + " not found");
		}
		return productService.getProductById(id);
	}

	@PostMapping("/save")
	public Product saveProduct(@RequestBody Product product) {
		product.setCreatedAt(LocalDateTime.now());
		product.setUpdatedAt(LocalDateTime.now());

		return productService.saveProduct(product);
	}

	@PutMapping("/update")
	public Product updateIndent(@RequestBody Product product) throws Exception {
		product.setUpdatedAt(LocalDateTime.now());
		return productService.updateProduct(product);
	}

	@DeleteMapping("/id/{id}")
	public void deleteIndent(@PathVariable("id") Integer id) throws Exception {
		productService.deleteProductById(id);
	}

	@DeleteMapping("/delete")
	public Boolean deleteOrders(@RequestParam(name = "ids") List<Integer> ids) {
		return productService.delete(ids);
	}

}
