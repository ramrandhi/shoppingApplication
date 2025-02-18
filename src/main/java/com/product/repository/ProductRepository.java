package com.product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.product.entity.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	@Query(value = "SELECT DISTINCT BRAND FROM product", nativeQuery = true)
    public List<String> getAllUniqueBrands();

}
