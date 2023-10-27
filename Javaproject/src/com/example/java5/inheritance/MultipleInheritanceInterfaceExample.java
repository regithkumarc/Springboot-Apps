package com.example.java5.inheritance;

public class MultipleInheritanceInterfaceExample implements Interface1,Interface2 {
	
	private void show() {
		Interface1.super.fetch();
		Interface2.super.fetch();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheritanceInterfaceExample m = new MultipleInheritanceInterfaceExample();
		m.fetch();
		m.show();
	}

	@Override
	public void fetch() {
		// TODO Auto-generated method stub
		Interface1.super.fetch();
		Interface2.super.fetch();
	}

}
