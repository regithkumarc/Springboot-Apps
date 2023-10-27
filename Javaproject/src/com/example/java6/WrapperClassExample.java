package com.example.java6;

public class WrapperClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Autoboxing
		int a = 10;
		
		Integer i = Integer.valueOf(a);
		System.out.println(i);
		
		Integer i1 = a;
		System.out.println(i1);
		
		//Unboxing
		Integer i3 = new Integer(3);
		int i4 = i3.intValue();
		System.out.println(i4);

		int i5 = i3;
		System.out.println(i5);
	}

}
