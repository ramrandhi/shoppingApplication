package com.ram.service.productservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ram.service.entity.Product;
import com.ram.service.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	@Override
	public Product getProductById(Integer id) {
		return productRepository.findById(id).get();
	}

	@Override
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Product updateProduct(Product product) throws Exception {
		Optional<Product> existingProduct = productRepository.findById(product.getId());
		if(existingProduct.isEmpty() && !existingProduct.isPresent()) {
			throw new Exception("Product with id "+existingProduct+" is not present");
		}
		return productRepository.save(product);
	}

	@Override
	public void deleteProductById(Integer id) throws Exception {
		Optional<Product> existingProduct = productRepository.findById(id);
		if(existingProduct.isEmpty() && !existingProduct.isPresent()) {
			throw new Exception("Product with id "+existingProduct+" is not present");
		}
		productRepository.deleteById(id);
	}

	@Override
	public Boolean delete(List<Integer> ids) {
		for(Integer id: ids) {
			productRepository.deleteById(id);
		}
		return true;
	}

}
