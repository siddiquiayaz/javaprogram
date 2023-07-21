package com.java8;

 class LamdaEx {
	 
	 
	 
	 void name() {
		 System.out.println("siddiqui ayaz");
	 }
	
public static void main(String args[]) {
	
	Emp lamda =()->	{
		System.out.println("lamda expration");
		
	};
	lamda.name();
}
}
 @FunctionalInterface
  interface Emp{
	 
	void name();
 }