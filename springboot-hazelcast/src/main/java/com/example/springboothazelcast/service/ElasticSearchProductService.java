package com.example.springboothazelcast.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboothazelcast.model.ElasticSearchProduct;
import com.example.springboothazelcast.repository.ElasticSearchProductRepository;

@Service
public class ElasticSearchProductService implements ElasticSearchProductServiceImpl {
	
	@Autowired
	public ElasticSearchProductRepository elasticSearchProductRepository; 

	@Override
	public Iterable<ElasticSearchProduct> getAllProducts() {
		// TODO Auto-generated method stub
		Iterable<ElasticSearchProduct> productList = elasticSearchProductRepository.findAll();
		return productList;
	}

	@Override
	public ElasticSearchProduct getProductById(int id) {
		// TODO Auto-generated method stub
		return elasticSearchProductRepository.findById(id).get();
	}

	@Override
	public ElasticSearchProduct addProduct(ElasticSearchProduct product) {
		// TODO Auto-generated method stub
		return elasticSearchProductRepository.save(product);
	}

	@Override
	public ElasticSearchProduct updateProduct(ElasticSearchProduct product) {
		// TODO Auto-generated method stub
		return elasticSearchProductRepository.save(product);
	}

	@Override
	public void deleteProductById(int id) {
		// TODO Auto-generated method stub
		elasticSearchProductRepository.deleteById(id);
	}

}
