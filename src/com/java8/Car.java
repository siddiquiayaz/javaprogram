package com.java8;

public class Car {
	
	 java.lang.String name;
	 java.lang.String color;
	 int price;
	
	
	public Car(java.lang.String name, java.lang.String color, int price) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
	}
	public java.lang.String getName() {
		return name;
	} 
	public java.lang.String getColor() {
		return color;
	}
	 public long getPrice(){
		 return price;
	 }
	 
		
/*
 * public String toString(){ return "Car [name =" +name+"color= "+color
 * +"price ="+price+"]";
 * 
 * }
 * 
 * }
 */
}