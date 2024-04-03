package com.ram.service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ram.service.entity.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	@Query(value = "SELECT DISTINCT company FROM product where category = :company", nativeQuery = true)
    public List<String> getAllUniqueBrands(@Param(value = "company") String company);

}
