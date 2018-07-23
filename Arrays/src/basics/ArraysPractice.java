package basics;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Random;

public class ArraysPractice 
{
	//we only ever want to use one Random object
	private static Random random = new Random();
	
	public static void main(String[] args) 
	{
		creatingArrays();
		loopingOverArrays();
		shortHandNotation();
		usingObjectsInArrays();
		
		int[] randomArray = getRandomArray(3, 13, 100);
		System.out.println(Arrays.toString(randomArray));
		double average = getAverage(randomArray);
		System.out.println(average);
		System.out.println();
		
		System.out.println(getAverage(getRandomArray(1, 10, 10)));
		System.out.println(getAverage(getRandomArray(1, 10, 100)));
		System.out.println(getAverage(getRandomArray(1, 10, 1000)));
		System.out.println(getAverage(getRandomArray(1, 10, 10000)));
		System.out.println(getAverage(getRandomArray(1, 10, 100000)));
		System.out.println(getAverage(getRandomArray(1, 10, 1000000)));
		System.out.println(getAverage(getRandomArray(1, 10, 10000000)));
		System.out.println(getAverage(getRandomArray(1, 10, 100000000)));
	
		return;
	}
	
	public static void creatingArrays()
	{
		//step #1 - allocate memory for the array
		int[] numbers = new int[10];
		
		//step #2 - assign elements to the positions of the array
		numbers[0] = 42;
		numbers[1] = 10;
		numbers[2] = 30;
		
		//step #3 - retrieve elements by position
		System.out.println(numbers[1]);
		
		//make sure you give a valid index!
		//System.out.println(numbers[10]);
	}
	
	public static void loopingOverArrays()
	{
		//store a set of flags that determine how a user
		//can interact with a program
		//0 - create account, 1 - delete account, 2 - alter account
		boolean[] permissions = new boolean[3];
		
		permissions[0] = true;
		permissions[2] = true;
		
		//loop over the permissions
		for (int i = 0; i < permissions.length; i++)
		{
			//access the element at the current index
			boolean current = permissions[i];
			System.out.println("[" + i + "] " + current);
		}
	}
	
	public static void shortHandNotation()
	{
		double[] itemPrices = {0.99, 6.99, 8.05, 10.99};
		
		double sum = 0.0;
		for (int i = 0; i < itemPrices.length; i++)
		{
			double price = itemPrices[i];
			
			sum += price;
		}
		
		System.out.println("The sum of your item is $" + sum);
	}
	
	public static void usingObjectsInArrays()
	{
		LocalDateTime[] dates = new LocalDateTime[24];
		
		//generate our array values
		for (int i = 0; i < dates.length; i++)
		{
			int hoursToAdd = i + 1;
			
			//create a datetime object a certain number of hours
			//ahead of now
			LocalDateTime now = LocalDateTime.now();
			LocalDateTime adjustedDate = now.plusHours(hoursToAdd);
			
			//assign the element to my array
			dates[i] = adjustedDate;
		}
		
		//loop over our array values
		for (int i = 0; i < dates.length; i++)
		{
			System.out.println(dates[i]);
		}
	}
	
	public static double getAverage(int[] array)
	{
		double sum = 0;
		
		for (int i = 0; i < array.length; i++)
		{
			sum += array[i];
		}
		
		return sum / array.length;
	}
	
	public static int[] getRandomArray(int low, int high,
			                           int arraySize)
	{
		//create an array of the requested size
		int[] results = new int[arraySize];
		
		//fill the array with random numbers
		for (int i = 0; i < results.length; i++)
		{
			int number = randomNumber(low, high);
			results[i] = number;
		}
		
		return results;
	}
	
	public static int randomNumber(int low, int high)
	{
		int possibleValues = high - low + 1;
		int number = random.nextInt(possibleValues);
		
		return number + low;
	}
}










