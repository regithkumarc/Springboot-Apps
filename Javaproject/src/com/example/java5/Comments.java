package com.example.java5;

import java.io.IOException;

/**
 * 
 * @author Dell
 *@version 1.0
 *@since 2021-07-06
 *
 */
public class Comments {

	private void display() {
		System.out.println("Displayed");
	}
	
	/**
	 * 
	 *This method calculate of two integers
	 *@param a This is the first parameter to sum() method
	 *@param b This is the second parameter to sum() method
	 *@return int This return the addition of a and b
	 *
	 */
	private int sum(int a, int b) {
		return a+b;
	}
	
	/**
	 * 
	 * @param args Unused
	 * @see IOException
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Comments comments = new Comments();
		int sum = comments.sum(5,5);
		System.out.println("Addition of Numbers : " + sum);
	}

}
