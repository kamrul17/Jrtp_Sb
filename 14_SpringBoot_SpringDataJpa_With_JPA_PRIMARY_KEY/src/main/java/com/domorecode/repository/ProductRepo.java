package com.domorecode.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.domorecode.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
