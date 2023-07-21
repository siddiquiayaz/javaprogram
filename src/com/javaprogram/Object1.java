package com.javaprogram;
import java.util.Scanner;


class Emp{
	   void ayaz() {
		  System.out.println("ayaz");
		  
	  }
	/*
	 * private int id; private String name; private String surNameString; public int
	 * getId() { return id; } public void setId(int id) { this.id = id; } public
	 * String getName() { return name; } public void setName(String name) {
	 * this.name = name; } public String getSurNameString() { return surNameString;
	 * } public void setSurNameString(String surNameString) { this.surNameString =
	 * surNameString; }
	 * 
	 * public void getDetails(){ System.out.println(id+" "+name+" "+surNameString);
	 * }
	 */
	
}


public class Object1  extends Emp{
    
	public static final Scanner scanner = new Scanner(System.in);
	   void ayaz() {
		System.out.println("hey");
	}
	
	public static void main(String[] args) {
		Object1 o=new Object1();
		   
		/*
		 * Emp[] emp = new Emp[3];
		 * 
		 * for(int i=0; i<emp.length;i++) {
		 * 
		 * emp[i] = new Emp();
		 * 
		 * System.out.println("Enter Emp "+i+" id"); emp[i].setId(scanner.nextInt());
		 * scanner.nextLine();
		 * 
		 * System.out.println("Enter Emp "+i+" name"); emp[i].setName(scanner.next());
		 * 
		 * System.out.println("Enter Emp "+i+" surname");
		 * emp[i].setSurNameString(scanner.next()); }
		 * 
		 * System.out.println("Enter Employee id for its details");
		 * 
		 * int empid = scanner.nextInt();
		 * 
		 * for(int i=0; i<emp.length;i++) { if(empid == emp[i].getId()) {
		 * emp[i].getDetails(); break; } }
		 */
				  
		
		
		
		  for(int i=1;i<10;i++) {
			  
			   int b=++i;
			  
			  System.out.println(i++ +""+b);
			  
			
		  }}
	}