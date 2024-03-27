package com.example.springboothazelcast.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboothazelcast.model.ElasticSearchProduct;
import com.example.springboothazelcast.service.ElasticSearchProductService;

@RestController
@RequestMapping("/api/elasticSearch/ElasticSearchProductController")
public class ElasticSearchProductController {
	
	@Autowired
	public ElasticSearchProductService elasticSearchProductService;

	@GetMapping("/getAllProducts")
	public Iterable<ElasticSearchProduct> getAllProducts() {
		return elasticSearchProductService.getAllProducts();
	}
	
	@PostMapping("/addProduct")
	public ElasticSearchProduct addProduct(@RequestBody ElasticSearchProduct product) {
		return elasticSearchProductService.addProduct(product);
	}
}
