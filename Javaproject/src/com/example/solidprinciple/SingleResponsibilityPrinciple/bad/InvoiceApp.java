package com.example.solidprinciple.SingleResponsibilityPrinciple.bad;

public class InvoiceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Invoice invoice  = new Invoice();
		invoice.determineTax();
		invoice.emailInvoice();
		invoice.printInvoice();
	}

}
