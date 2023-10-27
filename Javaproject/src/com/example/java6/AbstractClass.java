package com.example.java6;

public class AbstractClass extends Bike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractClass a = new AbstractClass();
		a.run();
		a.add();
		System.out.println("-----------------");
		
		Bike b = new AbstractClass();
		b.run();
		b.add();
		System.out.println("-------------------");
		
	}

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("run");
	}

}


abstract class Bike {
	abstract void run();
	void add() {
		System.out.println("add");
	}
}