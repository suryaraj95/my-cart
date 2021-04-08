package com.mycart.productsearch.service;

import java.util.List;

import com.mycart.productsearch.domain.Product;

public interface ProductService {

	public List<Product> getProducts();
	
	public boolean updateProducts(List<Product> products);

}
