package com.apex.assignment;

import java.util.Scanner;

public class DiscountProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Price of Item");
		double price = s.nextDouble();
		System.out.println("Price of Item: " +price);
		
		double discount = price * 0.05;
		
		double totalPrice = price - discount;
		
		System.out.println("Price of item after discount: " +totalPrice);
			

	}

}
