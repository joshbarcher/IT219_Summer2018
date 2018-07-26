package exceptions;

public class ExceptionsPractice 
{
	public static void main(String[] args) 
	{
		//examples of runtime exceptions
		double result = Math.sqrt(-10);
		System.out.println(result);
		
		//this will result in an ArithmeticException
		//int val = 20;
		//System.out.println(val / 0);
		
		testDivide();
	}
	
	public static void testDivide()
	{
		boolean done = false;
		while (!done)
		{
			try 
			{
				int num = Console.getInt("Numerator?");
				int den = Console.getInt("Denominator?");
				System.out.println(divide(num, den));
				done = true;
			}
			catch (ArithmeticException ex)
			{
				System.out.println("You cannot divide by zero");
			}
		}
	}
	
	public static int divide(int numerator, int denominator)
	{
		//detect a bad input
		if (denominator == 0)
		{
			//throw an exception to stop the program
			throw new UnsupportedOperationException("You divided by zero: " + 
			             numerator + "/" + denominator);
		}
		
		return numerator / denominator;
	}
}
