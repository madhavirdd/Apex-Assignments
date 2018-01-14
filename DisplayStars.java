package com.apex.assignment;

import java.util.Scanner;

public class DisplayStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int countstar= 5;
		int n = 5;
		for (int i=1; i<=n; i++) {
			System.out.println();
		for(int j=1; j<=countstar; j++)
		{
			System.out.print("*");
			
		}
		countstar--;
		}
	}

}
