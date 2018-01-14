package com.apex.assignment;

import java.util.Scanner;

public class CalAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter sub1 sub2 sub3 sub4 sub5 sub6 marks");
		float sub1 = s.nextFloat();
		float sub2 = s.nextFloat();
		float sub3 = s.nextFloat();
		float sub4 = s.nextFloat();
		float sub5 = s.nextFloat();
		float sub6 = s.nextFloat();
		
		float totalMarks = sub1 + sub2 + sub3 + sub4 + sub5 + sub6;
		float avgMarks = totalMarks/6;
		
		System.out.println("Total Marks of Student:" +totalMarks);
		System.out.println("Average of Student: " +avgMarks);
		
	}

}
