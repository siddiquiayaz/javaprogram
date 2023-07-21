package com.javaprogram;

import java.util.Scanner;

public class PrimeNumberr {

	public static void main(String[] args) {
		 System.out.println("enter the any number");
	 Scanner sc=new Scanner(System.in);
    int num = sc.nextInt();
    boolean f = false;
    for (int i = 2; i <= num / 2; ++i) {
    
      if (num % i == 0) {
        f = true;
        break;
      }
    }

    if (!f)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
  }
}


