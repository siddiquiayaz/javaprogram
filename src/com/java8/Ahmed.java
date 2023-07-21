package com.java8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

class Ahmed
{
 
static int primeSum(int arr[], int n)
{
    // Find maximum value in the array
    int max_val = Arrays.stream(arr).max().getAsInt(); 
 
    // USE SIEVE TO FIND ALL PRIME NUMBERS LESS
    // THAN OR EQUAL TO max_val
    // Create a boolean array "prime[0..n]". A 
    // value in prime[i] will finally be false
    // if i is Not a prime, else true.
    List<Boolean> prime = new ArrayList<>(max_val + 1);
    for(int i = 0; i < max_val + 1; i++)
        prime.add(i,Boolean.TRUE);
 
    // Remaining part of SIEVE
    prime.add(0,Boolean.FALSE);
    prime.add(1,Boolean.FALSE);
    for (int p = 2; p * p <= max_val; p++)
    {
 
        if (prime.get(p) == true)
        {
 
            for (int i = p * 2; i <= max_val; i += p)
                prime.add(i,Boolean.FALSE);
        }
    }
 
    int sum = 0;
    for (int i = 0; i < n; i++)
        if (prime.get(arr[i]))
            sum += arr[i];
 
    return sum;
}
 

public static void main(String[] args)
{
	int [] arr= {1,1,1,1,1,2,2,2,2,3,4,4,5,6,6};
    int n = arr.length;
    System.out.print(primeSum(arr, n));
}
}