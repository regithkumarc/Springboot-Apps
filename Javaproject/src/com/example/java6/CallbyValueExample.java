package com.example.java6;

public class CallbyValueExample {
	
	int data = 10;
	
	
	void change(int data) {
		data = data + 10;
	}

	void change1(CallbyValueExample c) {
		c.data = c.data + 10;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallbyValueExample c = new CallbyValueExample();
		c.change(10);
		System.out.println(c.data);
		
		c.change1(c);
		System.out.println(c.data);
	}

}
