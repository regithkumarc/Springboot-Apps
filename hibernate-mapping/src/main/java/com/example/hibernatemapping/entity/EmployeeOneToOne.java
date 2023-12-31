package com.example.hibernatemapping.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "EMPLOYEE_ONETOONE")
public class EmployeeOneToOne {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "name")
	private String name;
	
	private Integer salery;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id",referencedColumnName = "id")
	private EmployeeContactOneToOne employeeContactOneToOne;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalery() {
		return salery;
	}

	public void setSalery(Integer salery) {
		this.salery = salery;
	}

	public EmployeeContactOneToOne getEmployeeContactOneToOne() {
		return employeeContactOneToOne;
	}

	public void setEmployeeContactOneToOne(EmployeeContactOneToOne employeeContactOneToOne) {
		this.employeeContactOneToOne = employeeContactOneToOne;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salery=" + salery + "]";
	} 
}
