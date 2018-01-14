package com.apex.assignment;

import java.util.Scanner;

public class FractionPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter value for n: ");
		int n = s.nextInt();
		
		int fact=1;
		 
        for(int i=1;i<=n;i++)
  	  {

    	   fact=fact*i;
	 	  }

	        System.out.println("Factoral= "+fact);
	}

}
