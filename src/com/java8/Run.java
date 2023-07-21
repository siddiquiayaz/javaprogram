package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Run {
	
	public static void main(String[] args) {
		List<Car> carList=Arrays.asList(
				new Car("ajff","iqrq",410012)
				);
		
		  System.out.println(carList); Predicate<Car> p = n -> n.getPrice() < 500000;
		  for(Car car : carList) { if(p.test(car)) System.out.println(car.getName()); }
		 
		     List <Car> carList2 =  carList.stream().filter(x -> x.getPrice() < 500000).collect(Collectors.toList());
		     System.out.println(carList2);
		}
	}
	
	


