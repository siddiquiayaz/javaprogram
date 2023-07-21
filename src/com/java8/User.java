package com.java8;

public class User {
	public static void main(String []b) {
		
	 Pass lamda1=(a,c)->{ return (a+c);};
		
	System.out.println(lamda1.pass(10,20));
	}
}
 interface Pass{
	 
	 int  pass(int a ,int c);
 }