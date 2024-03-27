package com.example.springboothazelcast.service;

import com.example.springboothazelcast.model.ElasticSearchProduct;

public interface ElasticSearchProductServiceImpl {

	public Iterable<ElasticSearchProduct> getAllProducts();
	public ElasticSearchProduct getProductById(int id);
	public ElasticSearchProduct addProduct(ElasticSearchProduct product);
	public ElasticSearchProduct updateProduct(ElasticSearchProduct product);
	public void deleteProductById(int id);
}
