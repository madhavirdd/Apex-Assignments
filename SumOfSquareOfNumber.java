package com.apex.assignment;

import java.util.Scanner;

public class SumOfSquareOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter value for n: ");
		int n = s.nextInt();
		
		int result = n*(n+1)*(2*n+1)/6;
		System.out.println("Square of n values: " +result);
		
		// second approach
		int n1 = 1;
	    int sum = 0;
	    while (n1 <= 10) {
	        sum = (sum + (n1*n1)); 
	        n1++;
	    }
	    System.out.println(sum);
		
	}

}
