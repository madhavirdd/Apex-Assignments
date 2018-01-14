package com.apex.assignment;

import java.util.Scanner;

public class CalWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int i=0; i<3; i++)
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter Left side weight: ");
			int leftSideWeight = s.nextInt();
			System.out.println("Enter Right side weight: ");
			int rightSideWeight = s.nextInt();
			if (leftSideWeight == rightSideWeight) {
				System.out.println("Both are same weights");
				break;
			}
			else if(leftSideWeight != rightSideWeight)
			{
				System.out.println("Both are not same weights");
			}
			else
			{
				
				System.out.println("Both are same weights");
			}
		}
			
		
	}
	

}
