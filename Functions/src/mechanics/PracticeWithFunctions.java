package mechanics;

import java.awt.Point;

public class PracticeWithFunctions 
{
	public static void main(String[] args)
	{
		//passing primitives to a method will pass a copy
		int favoriteNumber = 42;
		add(favoriteNumber);
		System.out.println(favoriteNumber);
		
		//passing objects
		Point point = new Point(10, 2); //point at (10, 2)
		movePointToOrigin(point);
		System.out.println("x: " + point.x);
		System.out.println("y: " + point.y);
		
		//practice using return values with a function
		int smaller = smallest(10, 2);
		System.out.println("The smaller value is: " + smaller);
	
		double mySlope = slope(1, 1, 3, 4);
		System.out.println("Slope: " + mySlope);
		
		jump("fence");
		jump("cow");
		jump(10);
		jump(2);
		jump("cat", 3);
		jump(4, "dog");
		
		//printMe();
		//printMe("Hello");
		//printMe("Hello", "World");
		printMe("Hello", "World", "!");
	}
	
	public static void add(int input)
	{
		input += 1;
	}
	
	public static void movePointToOrigin(Point point)
	{
		//move the point to the origin
		point.x = 0;
		point.y = 0;
	}
	
	public static int smallest(int first, int second)
	{
		if (first < second)
		{
			return first;
		}
		else if (second < first)
		{
			return second;
		}
		else
		{
			//return either
			return first;
		}
	}

	public static double slope(double x1, double y1,
			                   double x2, double y2)
	{
		double rise = y1 - y2;
		double run = x1 - x2;
		
		return rise / run;
	}
	
	//here are a few "overloaded" methods
	public static void jump(String over)
	{
		System.out.println("You jump over the " + over);
	}
	
	public static void jump(int times)
	{
		System.out.println("You jump " + times + " times!");
	}
	
	public static void jump(String over, int times)
	{
		System.out.println("You jump over the " + over + 
				           " " + times + " times!");
	}
	
	public static void jump(int howHigh, String over)
	{
		System.out.println("You jump " + howHigh + 
				" feet over " + over + "!");
	}
	
	//misc. features
	
	//variable-length parameters
	public static void printMe(String... messages)
	{
		for (String message : messages)
		{
			System.out.println("Message: " + message);
		}
	}
}







