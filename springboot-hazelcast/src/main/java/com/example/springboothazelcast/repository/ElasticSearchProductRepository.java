package com.example.springboothazelcast.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.example.springboothazelcast.model.ElasticSearchProduct;

public interface ElasticSearchProductRepository extends ElasticsearchRepository<ElasticSearchProduct, Integer> {

}
