package com.example.solidprinciple.SingleResponsibilityPrinciple.bad;

public class Invoice {

	public void determineTax() {
		System.out.println("determineTax");
	}
	
	public void printInvoice() {
		System.out.println("printInvoice");
	}
	
	public void emailInvoice() {
		System.out.println("emailInvoice");
	}
}
