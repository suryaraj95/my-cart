package com.mycart.productsearch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycart.productsearch.domain.Product;
import com.mycart.productsearch.service.ProductService;

@RestController
@RequestMapping("products")
public class ProductController {

	@Autowired
	ProductService productService;

	@GetMapping(path = "/getall", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Product>> getAllProducts() {
		List<Product> products = productService.getProducts();
		return ResponseEntity.ok(products);
	}

	@PostMapping(path = "/update", consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> updateProducts(@RequestBody List<Product> products) {
		productService.updateProducts(products);
		return ResponseEntity.ok("Successfully  updated the products");
	}

}
