package payexample;

import java.text.DecimalFormat;

import consoleio.Console;

public class Order 
{
	public static void main(String[] args)
	{
		String productName = Console.getString("Enter product");
		int quantity = Console.getInt("Quantity?");
		double price = Console.getDouble("Price?");
		double taxRate = Console.getDouble(
				"Your tax rate (as a percentage)?");
		
		//convert my taxRate from percentage to decimal
		taxRate = taxRate / 100;
		
		//calculate our subtotal (with possible discount)
		double subtotal = quantity * price;
		if (subtotal > 200.0)
		{
			subtotal = subtotal * .9;
			System.out.println("You got a 10% discount!");
		}
		else if (subtotal > 100.0)
		{
			subtotal = subtotal * .95;
			System.out.println("You got a 5% discount!");
		}
		
		//get our total
		double tax = subtotal * taxRate;
		double total = subtotal + tax;
		
		//round our result as a currency value
		DecimalFormat formatter = new DecimalFormat("#.##");
		String formattedTotal = formatter.format(total);
		
		//print our results
		System.out.println("Thanks for ordering " + quantity + 
				" " + productName + "(s)");
		System.out.println("Your total is: $" + formattedTotal);
	}
}








