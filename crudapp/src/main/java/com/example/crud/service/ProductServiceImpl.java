package com.example.crud.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.crud.model.Product;
import com.example.crud.model.ProductRowMapper;
import com.example.crud.repository.Constant;
import com.example.crud.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	EntityManager entityManager;
	
	 private final JdbcTemplate jdbcTemplate;

	 @Autowired
	 public ProductServiceImpl(JdbcTemplate jdbcTemplate) {
	     this.jdbcTemplate = jdbcTemplate;
	 }

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		List<Product> productList = productRepository.findAll();
		return productList;
	}

	@Override
	public Optional<Product> getProduct(long id) {
		// TODO Auto-generated method stub
		return productRepository.findById(id);
	}
	
	@Override
	public List<Product> findByLastUpdate(String date) {
		// TODO Auto-generated method stub
		List<Product> productList = productRepository.findByLastUpdate(date);
		return productList;
	}
	
	@Override
	public List<Product> findByNameAndPrice(String name, String price) {
		
		List<Product> productList1 = productRepository.findAll();
		System.out.println(productRepository.findAll().size());
		
		List<Product> productList = productRepository.findByName(name);
		System.out.println(productList.size());
		
		List<Product> filterBasedOnList = null;
		filterBasedOnList = productList.stream().filter(m -> m.getName().equals(name)).collect(Collectors.toList());
		if(!price.isEmpty()) {
			filterBasedOnList = filterBasedOnList.stream().filter(p -> p.getPrice().equals(price)).collect(Collectors.toList());
			System.out.println("filterBasedOnList1 : " + filterBasedOnList);
		} else {
			System.out.println("filterBasedOnList2 : " + filterBasedOnList);
			return filterBasedOnList;
		}
		return filterBasedOnList;
	}
	
	
	
	
	
	
	public final String doWithEntityManager(String name,String price) {

        StringBuilder builder = new StringBuilder();
        // SELECT
        builder.append("SELECT * from product");
        builder.append(" WHERE name =:" + name);
        builder.append(" and price =:" + price);
        builder.append(";");
        
        String nativeQuery = builder.toString();
        //System.out.println(nativeQuery);
       // Query query = (Query) entityManager.createNativeQuery(nativeQuery, "Product");
        
        System.out.println("Query String : " + nativeQuery);
        
        return nativeQuery;
	}

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}
	
	@Override
	public Product addManyProduct(List<Product> product) {
		// TODO Auto-generated method stub
		return (Product) productRepository.saveAll(product);
	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	@Override
	public Optional<Product> deleteProduct(long id) {
		// TODO Auto-generated method stub
		 productRepository.deleteById(id);
		return productRepository.findById(id);
	}
}
