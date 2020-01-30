package main;

import java.util.Scanner;

//Author : Noah Giles
//Date : 1/23/2020
public class ParadiseInfo {

	public static void main(String[] args) 
	{
		double price;
		double discount;
		double savings;
		Scanner input = new Scanner(System.in);
		System.out.print("ENTER CUTOFF PRICE FOR DISCOUNT >>> ");
		price = input.nextDouble();
		
		System.out.print("ENTER DISCOUNT RATE AS A WHOLE NUMBER >>> ");
		discount = input.nextDouble();
		
		displayInfo();	
		
		savings = computeDiscountInfo(price, discount);
		
		System.out.println("Special this week on any service over " + price);
		System.out.println("That's a savings of at least $" + savings);
			
		System.out.print("DISCOUNT OF " + discount + " PERCENT");
		System.out.print("");
	}
	public static void displayInfo()
	{
		
		System.out.print("PARADISE DAY SPA WANTS TO PAMPER YOU. ");
		System.out.print("WE WILL MAKE YOU LOOK GOOD.");
	}
	public static double computeDiscountInfo(double pr, double dscnt)
	{
		double savings;
		savings = pr * dscnt / 100;
		return savings;
	}
}
