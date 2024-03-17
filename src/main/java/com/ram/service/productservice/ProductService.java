package com.ram.service.productservice;

import java.util.List;

import com.ram.service.entity.Product;

public interface ProductService {

	public List<Product> getAllProducts();

	public Product getProductById(Integer id);

	public Product saveProduct(Product product);

	public Product updateProduct(Product product) throws Exception;

	public void deleteProductById(Integer id) throws Exception ;

	public Boolean delete(List<Integer> ids);

}
