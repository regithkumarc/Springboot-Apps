package com.example.hibernatemapping.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "EMPLOYEE_ONETOMANY")
public class EmployeeOneToMany {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "name")
	private String name;
	
	private Integer salery;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "empId")
	private Set<EmployeeContactOneToMany> employeeContactOneToManySet;
	
	private EmployeeOneToMany() {}

	public Integer getId() {
		return id;
	}

	public EmployeeOneToMany setId(Integer id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public EmployeeOneToMany setName(String name) {
		this.name = name;
		return this;
	}

	public Integer getSalery() {
		return salery;
	}

	public EmployeeOneToMany setSalery(Integer salery) {
		this.salery = salery;
		return this;
	}

	public Set<EmployeeContactOneToMany> getEmployeeContactOneToManySet() {
		return employeeContactOneToManySet;
	}

	public void setEmployeeContactOneToManySet(Set<EmployeeContactOneToMany> employeeContactOneToManySet) {
		this.employeeContactOneToManySet = employeeContactOneToManySet;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salery=" + salery + "Employee Contacts : " + employeeContactOneToManySet + "]";
	} 
}
