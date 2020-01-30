package exercises;

import java.util.Scanner;

public class MetricConversion {

	public static void main(String[] args) 
	{
		int userInput;
		double literConversion;
		double centimeterConversion;
		MetricGetSet centimeterNumber1 = new MetricGetSet();
		MetricGetSet literNumber1 = new MetricGetSet();
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("PLEASE ENTER A WHOLE VALUE >>> ");
		userInput = input.nextInt();
		
		literConversion = convertCentimeter(userInput);
		centimeterConversion = convertLiter(userInput);
		
		centimeterNumber1.setCentimeters(centimeterConversion);
		literNumber1.setLiters(literConversion);
		
		System.out.println("Gallon to liter conversion : " + literConversion);
		System.out.println("Inch to centimeter conversion : " + centimeterConversion);
		
		System.out.println(literNumber1.getLiters() + " liters.");
		System.out.println(centimeterNumber1.getCentimeters() + " centimeters.");
		
		
	}
	public static double convertCentimeter(int okay) 
	{
		double convertCM;
		convertCM = (3.7854 * okay);
		return convertCM;
	}
	public static double convertLiter(int okay) 
	{
		double convertL;
		convertL = (2.54 * okay);
		return convertL;
	}
}
