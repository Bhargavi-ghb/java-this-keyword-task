package com.thiskeyword;

public class Student {
	
	int rollNo;
	String name;
	
	public Student(int rollNo,String name) {
		this.rollNo=rollNo;
		this.name=name;
	}
	
	public void updateData(String name) {
		this.name=name;
		System.out.println("\nUpdatedName :" +this.name);
		System.out.println(".......After updated......\n");
	}

	public void display() {
		System.out.println("RollNo : "+ rollNo + ", Name :" +name);
	}
	public static void main(String[] args) {

		Student std=new Student(121,"Bhargavi");
		std.display();
		std.updateData("Thanmai");
		std.display();
	}

}
