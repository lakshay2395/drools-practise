package com.practise.drools.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.practise.drools.model.Product;

@Component
public class ProductService {
	
	@Autowired
	KieContainer container;

	public Product getProductDiscount(Product product) {
		KieSession kSession = container.newKieSession();
		kSession.insert(product);
		kSession.fireAllRules();
		return product;
	}
}
