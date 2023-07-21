package com.javaprogram;



interface Ayaz93{
	public default void  m() {
		System.out.println("helllo");
	}
}
interface B{
	public default void m() {
		System.out.println("ayaz");
	}
}

public class InterFacess implements Ayaz93,B{
	   public void m() {
		   Ayaz93.super.m();
		   
	   }
	public static void main(String[] args) {
	    InterFacess inter=new InterFacess();
	    inter.m();
	    
		
	}

	
}
