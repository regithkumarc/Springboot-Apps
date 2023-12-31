package com.example.hibernatemapping.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "EMPLOYEECONTACT_ONETOMANY")
public class EmployeeContactOneToMany {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	
	public EmployeeContactOneToMany() {}
	
	private Long phoneNo;

	public Integer getId() {
		return id;
	}

	public EmployeeContactOneToMany setId(Integer id) {
		this.id = id;
		return this;
	}

	public Long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "EmployeeContact [id=" + id + ", phoneNo=" + phoneNo + "]";
	}
}
