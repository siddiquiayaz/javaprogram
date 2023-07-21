package com.java8;

public class Employee1 {
	private int id;
	private String name;

	Employee1(int id, String name) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;

	}

	public int getId() {
		return id;
	}
	
	  public String toString() { return "Employee1 [name = "+name+ "" +" id="
	  +id+"]"; }
	 

}
