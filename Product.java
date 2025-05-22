package com.thiskeyword;

public class Product {
	
	int id;
	double price;
	
	public Product(int id,double price) {
		this.id=id;
		this.price=price;
	}
	
	public boolean isSame(Product p) {
		return this.id==p.id;
	}
	
	public void displayData() {
		System.out.println("id : " + id + ", price" +price); 
	}
	
	
	public static void main(String[] args) {
		
		Product product = new Product(101,2000.0);
		Product product1= new Product(105,3000.0);
		product.displayData();;
		product1.displayData();
		if(product.isSame(product1)) {
			System.out.println("Same");
		}
		else {
			System.out.println("not same");
		}
		
	}
}
