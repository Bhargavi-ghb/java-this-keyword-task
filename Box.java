package com.thiskeyword;

public class Box {

	int length;
	
	public Box(int length) {
		this.length=length;
	}
	
	public Box setLength(int length) {
		this.length=length;
		return this;
	}
	public void display() {
		System.out.println("Length :" +length);
	}
	public static void main(String[] args) {
	
		Box box=new Box(2);
		box.setLength(10).display();
		
	}

}
