package com.example.java5.polymorphism;

public class MethodOverridingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B b = new B();
		b.add();
	}

}

class A {
	void add() {
		System.out.println("A");
	}
}

class B extends A{
	void add() {
		System.out.println("B");
	}
}
