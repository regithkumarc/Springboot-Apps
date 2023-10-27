package com.example.crud.service;

import java.util.List;
import java.util.Optional;

import com.example.crud.model.Product;

public interface ProductService {
	
	List<Product> getAllProducts();
	List<Product> findByLastUpdate(String date);
	List<Product> findByNameAndPrice(String name,String price);
	Optional<Product> getProduct(long id);
	Product addManyProduct(List<Product> product);
	Product addProduct(Product product);
	Product updateProduct(Product product);
	Optional<Product> deleteProduct(long id);
}
