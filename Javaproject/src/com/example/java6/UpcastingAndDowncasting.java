package com.example.java6;

public class UpcastingAndDowncasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent p = new Child();
		p.printData();
		
		Child c = (Child)p;
		c.printData();
	}

}

class Parent{
	void printData() {
		System.out.println("parent");
	}
}

class Child extends Parent {
	void printData() {
		System.out.println("child");
	}
}
