package com.practise.drools.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practise.drools.model.Product;
import com.practise.drools.service.ProductService;

@RestController("/product")
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@PostMapping("/discount")
	public Product getProductDiscout(@RequestBody Product product) {
		return service.getProductDiscount(product);
	}

}
