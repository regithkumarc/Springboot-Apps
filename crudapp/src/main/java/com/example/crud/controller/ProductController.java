package com.example.crud.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.exception.ItemNotFoundException;
import com.example.crud.model.Product;
import com.example.crud.service.ProductServiceImpl;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	public ProductServiceImpl productServiceImpl;

	@CrossOrigin
	@GetMapping("/getProduct")
	public String getProduct() {
		return "Product";
	}

	@CrossOrigin
	@GetMapping("/getAllProducts")
	ResponseEntity<List<Product>> getAllProduts() {
		List<Product> productList = productServiceImpl.getAllProducts();
		return new ResponseEntity<List<Product>>(productList, HttpStatus.OK);
	}

	@CrossOrigin
	@GetMapping("/getProductById/{id}")
	ResponseEntity<Optional<Product>> getProductById(@PathVariable long id) {
		Optional<Product> optional = productServiceImpl.getProduct(id);
		if (optional.isPresent())
			return new ResponseEntity<Optional<Product>>(optional, HttpStatus.OK);
		else
			throw new ItemNotFoundException("Invalid Product Id : " + id);
	}
	
	@CrossOrigin
	@GetMapping("/findByLastUpdate/{date}")
	ResponseEntity<List<Product>> getAllProdutsBasedOnDate(@PathVariable String date) {
		List<Product> productList = productServiceImpl.findByLastUpdate(date);
		return new ResponseEntity<List<Product>>(productList, HttpStatus.OK);
	}
	
	@CrossOrigin
	@GetMapping("/findByNameAndPrice")
	ResponseEntity<List<Product>> findByNameAndPrice(@RequestParam String name,@RequestParam String price) {
//		List<Product> productList = productServiceImpl.findByNameAndPrice(name,price);
//		return new ResponseEntity<List<Product>>(productList, HttpStatus.OK);
		
		List<Product> productList = productServiceImpl.findByNameAndPrice(name,price);
		return new ResponseEntity<List<Product>>(productList, HttpStatus.OK);
	}
	
	@CrossOrigin
	@PostMapping("/storeproduct")
	ResponseEntity<List<Product>> storeproduct() {
		List<Product> list = new ArrayList<>();
		
		Product p = new Product();
		p.setName("test 1");
		p.setPrice("1000");
		p.setDesc("test 1");
		p.setLastUpdate(getCurrentDate());
		
		Product p1 = new Product();
		p1.setName("test 2");
		p1.setPrice("2000");
		p1.setDesc("test 2");
		
		Product p2 = new Product();
		p2.setName("test 3");
		p2.setPrice("3000");
		p2.setDesc("test 3");
		
		list.add(p);
		list.add(p1);
		list.add(p2);
		
		productServiceImpl.addManyProduct(list);
		return new ResponseEntity<List<Product>>(list, HttpStatus.CREATED);
	}
	
	private String getCurrentDate() {
		String pattern = "dd-MM-yyyy hh:mm:ss";
		String currentDate =new SimpleDateFormat(pattern).format(new Date());
		return currentDate;
	}

	@CrossOrigin
	@PostMapping("/addProduct")
	ResponseEntity<Product> addproduct(@RequestBody Product product) {
		productServiceImpl.addProduct(product);
		return new ResponseEntity<Product>(product, HttpStatus.CREATED);
	}

	@CrossOrigin
	@PutMapping("/updateProduct")
	ResponseEntity<Product> updateProduct(@RequestBody Product product) {
		Optional<Product> optional = productServiceImpl.getProduct(product.getId());
		if (optional.isPresent()) {
			productServiceImpl.updateProduct(product);
			return new ResponseEntity<Product>(product, HttpStatus.OK);
		} else {
			productServiceImpl.addProduct(product);
			return new ResponseEntity<Product>(product, HttpStatus.CREATED);
		}
	}

	@CrossOrigin
	@DeleteMapping("/deleteProduct/{id}")
	ResponseEntity<Optional<Product>> deleteItemById(@PathVariable long id) {
		Optional<Product> optional = productServiceImpl.getProduct(id);
		if (optional.isPresent())
			productServiceImpl.deleteProduct(id);
		else
			throw new ItemNotFoundException("Invalid Product Id : " + id);

		return new ResponseEntity<Optional<Product>>(HttpStatus.ACCEPTED);
	}
}
