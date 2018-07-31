package definingclasses;

import io.Console;

public class MyCheeseProgram 
{
	public static void main(String[] args) 
	{
		//we can now create Cheese objects using the class (blueprint)
		Cheese swiss = new Cheese();
		
		//assign my fields using dot notation
		swiss.type = "swiss";
		swiss.age = 3;
		swiss.lactose = true;
		
		//retrieve my fields using the same notation
		System.out.println("You created a " + swiss.type + 
				           " cheese object!");
		
		//create a second object
		Cheese cheddar = new Cheese();
		cheddar.type = "cheddar";
		cheddar.age = 1;
		cheddar.lactose = true;
		
		System.out.println("You created a " + cheddar.type + 
		           " cheese object!");
		
		//create a user defined cheese
		Cheese userCheese = getUserDefinedCheese();
		
		System.out.println("You created a " + userCheese.type + 
		           " cheese object!");
	}
	
	public static Cheese getUserDefinedCheese()
	{
		System.out.println("Please enter values for a new cheese.");
		
		//ask the user for values for their new cheese
		Cheese userCheese = new Cheese();
		userCheese.type = Console.getString("Type?");
		userCheese.age = Console.getInt("Age?");
		userCheese.lactose = Console.getBoolean("Lactose?");
		
		return userCheese;
	}
}











