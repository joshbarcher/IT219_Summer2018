package basics;

public class PairProgramming 
{
	/*
	 * Problem #1
	 * Write a function that prompts the user for their contact details
	 * 
	 * - first, last, middle name
	 * - email
	 * - phone number
	 * 
	 * and then returns the result as an array. 
	 * 
	 * Test your function by calling it and retrieving the resulting array.
	 * Print out the contact details to verify that they are in the array.
	 */
	
	/*
	 * Problem #2:
	 * Write a function called daysInMonth(String month) that accepts a month
	 * and returns the number of days in the month. The function should store
	 * an array of month values (a string array) and and an array of days of
	 * the month (an int array). For example:
	 * 
	 * months - ["january", "february", "march", ... ]
	 * days - [31, 28, 31, ...]
	 * 
	 * Notice how the the number of days for the month stored at months[i] is
	 * days[i]. 
	 * 
	 * Use both arrays to return the days of the month for the input string.
	 */
	
	/*
	 * Problem #3:
	 * Write a function called firstPrimes(int n). This creates and returns an array
	 * of size n, containing the first n prime numbers. You may use the isPrime()
	 * method below to help write your function.
	 * 
	 * Test your function by calling it and using Arrays.toString() to print the return
	 * value.
	 */
	
	public static boolean isPrime(int n)
	{
		if (n <= 1)
		{
			return false;
		}
		else if (n == 2)
		{
			return true;
		}
		
		int max = (int)Math.ceil(Math.sqrt(n));
		for (int i = 2; i <= max; i++)
		{
			if (n % i == 0)
			{
				return false;
			}
		}
		return true;
	}
}
