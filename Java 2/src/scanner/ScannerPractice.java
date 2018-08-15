package scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerPractice 
{
	//use a Scanner for console input
	private static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		System.out.println("Enter your name");
		String name = console.nextLine();
		
		System.out.println("Enter your gender (male = true, female = false)");
		boolean gender = console.nextBoolean();
		console.nextLine(); //clear the buffer
		
		System.out.println("Enter your birthdate");
		String bDay = console.nextLine();
		
		System.out.println(name + "( was born on " + bDay);
	}
	
	public static void divideProgram()
	{
		int numerator = getNumber("Enter a numerator: ");
		int denominator = getNumber("Enter a denominator: ");
		
		int quotient = numerator / denominator;
		int remainder = numerator % denominator;
		
		System.out.println("Quotient: " + quotient);
		System.out.println("Remainder " + remainder);
		
		console.close(); //not necessary, but good practice!
	}
	
	public static int getNumber(String prompt)
	{
		int userNumber = 0;
		boolean badInput = true;
		
		while (badInput)
		{
			try 
			{
				System.out.println(prompt);
				userNumber = console.nextInt();
				badInput = false;
			}
			catch (InputMismatchException ex)
			{
				//clear out the buffer
				String bogusText = console.nextLine();
				
				System.out.println(bogusText + " is not a number!");
			}
		}
		
		return userNumber;
	}
}







