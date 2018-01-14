package com.apex.assignment;

import java.util.Scanner;

public class SquareValues1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		
		for(int i=a; i<=b; i++)
		{
			System.out.println(i*i);
		}

	}

}
