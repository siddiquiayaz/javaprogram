package com.javaprogram;

public class StaticVa {  
	public int id =1;
	public static int id1=1;
	
	public static void main(String[] args) {
		StaticVa s=new StaticVa();
		for(int i=0;i<2;i++) {
			s.id += i;
			s.id1 += i; 
		}
		
		System.out.println(s.id +" "+s.id1);
		
		StaticVa s1 = new StaticVa();
		
		for(int i = 0; i < 2; i++) {
			s1.id += i;
			s1.id1 += i;
		}
		
		System.out.println(s1.id +" "+s1.id1);
			
		
	}

}
