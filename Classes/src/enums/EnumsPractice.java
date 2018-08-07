package enums;

import io.Console;

public class EnumsPractice 
{
	private static final String RED = "Red";
	private static final String GREEN = "Green";
	private static final String BLUE = "Blue";
	private static final String GRAY = "Gray";
	private static final String BLACK = "Black";
	
	public static void main(String[] args)
	{
		programWithConstants();
	}
	
	public static void programWithEnums()
	{
		Color[] allColors = {Color.RED, Color.BLUE, Color.GREEN, 
				             Color.BLACK, Color.GRAY};

		//show all colors
		for (int i = 0; i < allColors.length; i++)
		{
			System.out.println(i + ": " + allColors[i]);
		}
		int index = Console.getInt("Enter");

		//print a message
		Color value = allColors[index];
		
		//using enums with if-statements
		if (value == Color.RED)
		{
			System.out.println("You are in an angry mood!");
		}
		else if (value == Color.BLUE)
		{
			System.out.println("You are in a thoughtful mood!");
		}
		else if (value == Color.GRAY)
		{
			System.out.println("You are in a somber mood!");
		}
		else
		{
			System.out.println("I'm not sure what mood you're in!");
		}
		
		//using enums with switches
		switch(value)
		{
			case RED:
				System.out.println("You are in an angry mood!");
				break;
			case BLUE:
				System.out.println("You are in a thoughtful mood!");
				break;
			case GRAY:
				System.out.println("You are in a somber mood!");
				break;
			default: 
				System.out.println("I'm not sure what mood you're in!");
				break;
		}
	}
	
	public static void programWithConstants()
	{
		String[] allColors = {RED, BLUE, GREEN, BLACK, GRAY};

		//show all colors
		for (int i = 0; i < allColors.length; i++)
		{
			System.out.println(i + ": " + allColors[i]);
		}
		int index = Console.getInt("Enter");

		//print a message
		switch(allColors[index])
		{
			case RED:
				System.out.println("You are in an angry mood!");
				break;
			case BLUE:
				System.out.println("You are in a thoughtful mood!");
				break;
			case GRAY:
				System.out.println("You are in a somber mood!");
				break;
			default: 
				System.out.println("I'm not sure what mood you're in!");
				break;
		}
	}
}
