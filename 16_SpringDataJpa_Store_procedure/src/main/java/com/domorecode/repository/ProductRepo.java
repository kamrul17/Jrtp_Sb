package com.domorecode.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.domorecode.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {
	
//	USING PROCEDURE
	@Query(value="call GetAllProducts()",nativeQuery = true)
public List<Product>getAllProduct();
}
