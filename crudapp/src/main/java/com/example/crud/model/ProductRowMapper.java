package com.example.crud.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ProductRowMapper implements RowMapper<Product> {
	   @Override
	   public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
	       return new Product(rs.getString("name"),rs.getString("price"));
	   }
	}
