package com.example.java6;

public class CovariantReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a = new A();
		a.get().print();
		
		B b = new B();
		b.get().print();
		
		C c = new C();
		c.get().print();
	}

}

class A {
	
	A get() {
		return this;
	}
	
	void print() {
		System.out.println("print A");
	}
}

class B {
	
	B get() {
		return this;
	}
	
	void print() {
		System.out.println("print B");
	}
}

class C {
	
	C get() {
		return this;
	}
	
	void print() {
		System.out.println("print C");
	}
}
