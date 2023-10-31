package com.example.interviewQuesAns;

public class ReverseString {
	
	public String reverseString(String value) {
		
		StringBuilder sb = new StringBuilder();
		char[] c = value.toCharArray();
		System.out.println("length = " + c.length);
		for(int i = c.length-1; i>=0; i--) {
			System.out.println("i = " +i);
			sb.append(c[i]);
		}
		
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString ict = new ReverseString();
		System.out.println(ict.reverseString("regith"));
	}

}
