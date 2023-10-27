package com.example.java8;

public class InterfaceExample implements A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceExample i = new InterfaceExample();
		i.add();
		i.print();
		A.multiply();
	}
	
	@Override
	public void print() {
		System.out.println("print");
	}

}


interface A {
	void print();
	default void add() {
		System.out.println("added default");
	}
	
	static void multiply() {
		System.out.println("multiply static");
	}
	
	private void display() {
		System.out.println("display private");
	}
}