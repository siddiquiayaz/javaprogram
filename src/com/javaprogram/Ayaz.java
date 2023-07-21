package com.javaprogram;

import java.lang.reflect.Array;
import java.util.function.Predicate;

class StaicOver {
 
	
	  //void ayaz(Object o) { System.out.println("hello bro"); }
	 
		/*
		 * void ayaz(Integer a) { System.out.println("hello world");
		 * 
		 * }
		 */
	/*
	 * void ayaz(String name) { System.out.println("byeeee");
	 * 
	 * }
	 */

	void  ayaz(Array a) {
		System.out.println("gyaaa");

	}
}

public class Ayaz {

	public static void main(String[] args) {

		StaicOver d = new StaicOver();
		d.ayaz(null);

	}

}
