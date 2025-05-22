package com.thiskeyword;

public class Employee {

	String name;
	double salary;
	
	public Employee(String name,double salary) {
		
		this.name=name;
		this.salary=salary;
	}
	
	public void setSalary(String name,double salary) {
		this.name=name;
		this.salary=salary;
	}
	
	public String toString(){
		return name + " " + salary + " ";
	}
	
	public static void main(String[] args) {
		
		Employee emp=new Employee("Bhargavi",60000.0);
		System.out.println(emp);
		emp.setSalary("Thanmai", 70000.0);
		System.out.println(emp);
		
	}
	
	
	
	
	
}
