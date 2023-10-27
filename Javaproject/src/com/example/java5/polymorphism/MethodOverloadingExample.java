package com.example.java5.polymorphism;
/**
 * 
 * @author Dell
 * 
 * if class have same method name with diff parameter is called method overloading
 * 1) changing no of Arguments
 * 2) changing the argument of data type
 * 3) Why Method Overloading is not possible by changing the return type of method only
 * 4) Can we overload java main() method
 */
public class MethodOverloadingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("public static void main(String[] args)");
		Adder a = new Adder();
		
		// changing no of Arguments
		
		System.out.println(a.add(1, 2));
		System.out.println(a.add(1, 2, 3));
		
		// changing the argument of data type
		
		System.out.println(a.add(1.1d, 2.2d));
	}
	
	// Can we overload java main() method - yes but jvm  calls main() method which receive string array argument only
	public static void main(String args) {
		System.out.println("public static void main(String args)");
	}
	
	public static void main() {
		System.out.println("public static void main()");
	}

}

class Adder {
	int add(int a,int b) {
		return a+b;
	}
	
	int add(int a,int b,int c) {
		return a+b+c;
	}
	
	double add(double a,double b) {
		return a+b;
	}
	
	// Why Method Overloading is not possible by changing the return type of method only
	// ambiguity issue - duplicate method
	
//	double add(int a,int b) {
//		return a+b;
//	}
	
}
