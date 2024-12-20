package com.domorecode.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.domorecode.entity.Product;
//DEV ENV -USING  --ashok_it_sprind_data_jpa_store_procedure.product
public interface ProductRepo extends JpaRepository<Product, Integer> {
	
//	USING PROCEDURE
	@Query(value="call GetAllProducts()",nativeQuery = true)
public List<Product>getAllProduct();
}
