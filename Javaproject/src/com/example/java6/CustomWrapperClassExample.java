package com.example.java6;

public class CustomWrapperClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			CustomClass c = new CustomClass(10);
			System.out.println(c.toString());
	}

}

class CustomClass {
	private int i;
	
	public CustomClass() {
		// TODO Auto-generated constructor stub
	}
	
	public CustomClass(int i) {
		this.i = i;
	}
	
	public Integer getValue() {
		return this.i;
	}
	
	public void setValue(int i) {
		this.i = i;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Integer.toString(i);
	}
}
