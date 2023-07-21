package com.javaprogram;



public class Emp1  {

	void show(int a,long b) {
		System.out.println(b);
	}
	void show(long a,int b) {
		System.out.println(a+b);
	}
     
	public static void main(String[] args) {
		Emp1 mEmp1=new Emp1();
		mEmp1.show(12L, 13);
              A a=mEmp1 ::ayaz;
            	 a.ayaz();  
            	 
            	 //nigaition
            	 int h=-3;
            	 System.out.println(~h);
              
	}
	public void ayaz() {
		System.out.println("ayaz");
		
	}
	
} 
@FunctionalInterface
interface A{
	
	void ayaz();
	
	}