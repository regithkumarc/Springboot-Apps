package com.example.interviewQuesAns;

public class SwapNumbers {
	
	public void getSwapNumbers() {
		int a = 10;
		int b = 20;
		
		System.out.println("Before Swaping a = " + a);
		System.out.println("Before Swaping b = " + b);
		System.out.println("---------------");
		
		a = a + b; // 10 + 20 = 30
		b = a - b; // 30 - 20 = 10
		a = a - b; //30 - 10 = 20
		
		System.out.println("After Swaping a = " + a);
		System.out.println("After Swaping b = " + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SwapNumbers sn = new SwapNumbers();		
		sn.getSwapNumbers();
	}

}
