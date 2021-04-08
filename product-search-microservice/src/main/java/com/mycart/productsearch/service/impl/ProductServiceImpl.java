package com.mycart.productsearch.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycart.productsearch.domain.Product;
import com.mycart.productsearch.repository.ProductsRepository;
import com.mycart.productsearch.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductsRepository repository;
	

	@Override
	public List<Product> getProducts() {
		List<Product> products = repository.findAll();
		return products;
	}


	@Override
	public boolean updateProducts(List<Product> products) {	
		repository.saveAll(products);
		return false;
	}
	

}
