package com.mycart.productsearch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycart.productsearch.domain.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer> {

}
