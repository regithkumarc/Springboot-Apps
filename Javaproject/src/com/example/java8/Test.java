package com.example.java8;

public class Test {

	private void returnValue(int value) {
		int i = (int) (Math.ceil(value/100.0))*100;
		System.out.println("Value : " + String.valueOf(i));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		t.returnValue(10);
		t.returnValue(70);
		t.returnValue(150);
		t.returnValue(210);
		t.returnValue(1102);
	}

}
