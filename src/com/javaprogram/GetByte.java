package com.javaprogram;


class N{
	void show() {
		System.out.println("hey");
	}
}
public class GetByte extends N {
	void show() {
		System.out.println("ayaz");
	}
	public static void main(String[] args) { 
		N n=new GetByte();
		n.show();
		char c[]= {'a','b','c','d','e','+','g','h'};
           String s2=new String(c);
		byte b[]=s2.getBytes();
	   for (int i = 0; i < b.length; i++) {
		   System.out.println(b[i]);
		
	}

	}

}
