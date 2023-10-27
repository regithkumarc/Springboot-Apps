package com.example.java5;

public class StaticExample {
	
	static {
		System.out.println("Static block is getting called");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Static key word usage - Variable,method,Block,Nested Class
		 * Static variable
		 */
		
		Student student = new Student(1,"regith");
		Student student1 = new Student(2,"kumar");
		student.display();
		student1.display();
		
		/**
		 * Static key word usage - Variable,method,Block,Nested Class
		 * Static methods
		 */
		Student student2 = new Student(1,"regith");
		Student student22 = new Student(2,"kumar");
		student2.changeCollege();
		student2.display();
		student22.display();
		
	}

}

class Student {
	int rollNo;
	String name;
	static String college = "TTS";
	
	Student(int rollNo,String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	
	void changeCollege() {
		college = "FFS";
	}
	
	public void display() {
		System.out.println(rollNo + " : " + name + " : " + college);
	}
}
