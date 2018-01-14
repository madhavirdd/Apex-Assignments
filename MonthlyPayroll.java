package com.apex.assignment;

import java.util.Scanner;

public class MonthlyPayroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter no of Hours Worked");
		double hoursWorked = s.nextDouble();
	
		System.out.println("Enter rate per hour");
		double payPerHour = s.nextDouble();
		
		System.out.println("Enter no of hours works: " +hoursWorked);
		System.out.println("Enter rate per hour: " +payPerHour);
		
		double monthlySalary = hoursWorked * payPerHour * 30;
		
		System.out.println("Monthly Salary of Employee: " +monthlySalary);

	}

}
