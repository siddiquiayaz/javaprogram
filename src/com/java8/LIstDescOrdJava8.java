package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LIstDescOrdJava8 {
	public static void main(String[] args) {
		            List<Employee1> emp = new ArrayList<>();
		   emp.addAll(
				   Arrays.asList(
					new Employee1(1010, "ayaz"),
					new Employee1(1012, "tufail"),
					new Employee1(1212, "abuzar")
					
						));
		  
		           System.out.println(emp);
		           
		          
		           
		           
		           Collections.sort(emp,
		        		              (Employee1 e3 ,Employee1 e4) -> e3.getName().compareTo(e4.getName())
		        		                   );
		                   
		            System.out.println(emp);
					
					  Comparator<Employee1> cmp =new Comparator<>() { public int compare(Employee1
					  e1,Employee1 e2) { return e1.getName().compareTo(e2.getName());
					  
					  
					  }
					  
					  };
					 
                 Collections.sort(emp , new Comparator<Employee1>() {
                	 
                	public int compare(Employee1 e1 ,Employee1 e2) {
                		 return e1.getName().compareTo(e2.getName());
    		    		
                	}
				}); 
		           
		           
		          System.out.println(emp); 
		   
		          
	                /// use class name :: method name
		            Collections.sort(emp , Comparator.comparing(Employee1 :: getName));
		               System.out.println(emp);
		             
		             
       
	}

}
