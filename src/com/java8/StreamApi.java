package com.java8;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.security.auth.x500.X500Principal;

public class StreamApi {

		
	
	
	
	public  static void main(String[] args) {
		// Stream api is used for functional programming 
		
	     	IntStream.range(1,10).forEach(x -> System.out.println(x));
		 
			
			  IntStream.range(1, 10).forEach(System.out ::println);
			  
			  IntStream numIntStream = IntStream.iterate(2, X -> X+1);
			  numIntStream.limit(10).forEach(System.out :: println);
			  
			 
		long c = Stream.of(15,23,40,342,25,32).filter(x -> x>20).count();
		
		
		
		
	}

}
interface A{
	private void a () {
		System.out.println("abuzar");
		
	}
}
