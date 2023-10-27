package com.example.java8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProductInfo {
	
	private int id;
	private String name;
	private String date;
	private SimpleDateFormat simpleDateFormat  = new SimpleDateFormat("yyyy-MMM-dd");
	private Date createdOn;
	private String formatedDate;
	
	public ProductInfo(int id, String name, String date,String createdDate) throws ParseException {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.createdOn = simpleDateFormat.parse(createdDate);
		this.formatedDate = simpleDateFormat.format(this.createdOn);
	}
	
	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getFormatedDate() {
		return formatedDate;
	}

	public void setFormatedDate(String formatedDate) {
		this.formatedDate = formatedDate;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", date=" + date + ", createdOn : " + formatedDate;
	}
}
