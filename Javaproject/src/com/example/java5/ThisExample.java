package com.example.java5;

public class ThisExample {

	ThisExample() {
		System.out.println("Constructor is invoking");
	}
	
	private void a() {
		System.out.println("a");
	}
	
	private void b() {
		a();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1 = new Student1(1, "t1", "T");
		Student1 s2 = new Student1(1, "t2", "TT",2f); 
		
		s1.display();
		s2.display();
		
		ThisExample t1 = new ThisExample();
		t1.b();
	}

}

class Student1 {
	int rollNo;
	String name,course;
	float fee;
	
	Student1(int rollNo,String name,String course) {
		this.rollNo = rollNo;
		this.name = name;
		this.course = course;
	}
	
	Student1(int rollNo,String name,String course,float fee) {
		this(rollNo,name,course);
		this.fee = fee;		
	}
	
	void display() {
		System.out.println(rollNo + " : " + name + " : " + course + " : " + fee);
	}
}
