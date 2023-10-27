package com.example.java5;

public class AggrecationExample {

	int id;
	String name;
	Address address;
	
	public AggrecationExample(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	void display() {
		System.out.println(id + " -> " + name + " -> " + address);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address a1 = new Address("chennai","tamilnadu","india");
		Address a2 = new Address("nagercoil","tamilnadu","india"); 
		
		a1.display();
		a2.display();
		
		AggrecationExample a3 = new AggrecationExample(1,"regith",a1);
		AggrecationExample a4 = new AggrecationExample(2,"kumar",a2);
		
		a3.display();
		a4.display();
	}

}

class Address {
	private String city,state,country;
	
	public Address(String city,String state,String country) {
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
	
	void display() {
		System.out.println("Address is -> " + city + " -> " + state + " -> " + country);
	}
	
	public String toString() {
		return city + " -> " + state + " -> " + country;
	}
}
