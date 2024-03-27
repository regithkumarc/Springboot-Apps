package com.example.springboothazelcast.model;

import org.springframework.data.elasticsearch.annotations.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(indexName = "elasticsearchproduct")
public class ElasticSearchProduct {
	
	private int id;
	
	private String name;
	
	private String description;
	
	private int qty;
	
	private double price;

}
