package com.apex.assignment;

import java.util.Scanner;

public class DiscountProgram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		double cake = 0.03;
		double cookie = 0.05;
		
		System.out.println("Enter no of Cakes");
		double noOfCakes = s.nextDouble();
		double totalPriceForCakes = noOfCakes * cake;
		System.out.println("Enter no of Cookies");
		double noOfCookies = s.nextDouble();
		double totalPriceForCookies =  noOfCookies * cookie;
		
		double total = totalPriceForCakes + totalPriceForCookies;
		
		if(total >= 10)
		{		
		
		double discount = total * 0.05;
		double totalPrice = total - discount;
		System.out.println("Price of item after discount: " +totalPrice);
		}
		else
		{
		System.out.println("Price of item without discount: " +total);
		}

	}

}
