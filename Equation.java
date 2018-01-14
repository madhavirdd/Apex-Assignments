package com.apex.assignment;

import java.util.Scanner;

public class Equation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter value for X");
		int X = s.nextInt();
		
		int Result = 3*X^2 - 8*X + 4;
		
		System.out.println("Result :" +Result);
		

	}

}
