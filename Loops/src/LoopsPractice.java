
public class LoopsPractice 
{
	public static void main(String[] args) 
	{
		//forLoops();
		//printingWithForLoops();
		//printBox(7, 4);
		//printStair(3);
		//multTable();
		//sum();
		//average();
		//foo();
		breakAndContinue();
	}
	
	//for loops
	//*************************************************
	
	public static void forLoops()
	{
		for (int i = 1; i <= 4; i++)
		{
			System.out.print("Hello ");
		}
		System.out.println();
		
		for (int i = 1; i <= 4; i++)
		{
			System.out.print(i + " ");
		}
		System.out.println();
		
		for (int i = 1; i <= 2; i++)
		{
			for (int j = 1; j <= 2; j++)
			{
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
	
	public static void printingWithForLoops()
	{
		//15, 16, 17, 18, 19, 20
		for (int i = 15; i <= 20; i++)
		{
			System.out.print(i + " ");
		}
		System.out.println();
		
		//18, 21, 24, 27, ... , 99
		for (int i = 18; i < 100; i += 3)
		{
			System.out.print(i + " ");
		}
		System.out.println();
		
		//4, 8, 16, 32, 64, ... , 1024
		for (int i = 4; i <= 1024; i *= 2)
		{
			System.out.print(i + " ");
		}
		System.out.println();
		
		//10 9 8 7 6 5 4 3 2 1 Blast off!
		for (int i = 10; i >= 1; i--)
		{
			System.out.print(i + " ");
		}
		System.out.println("Blast off!");
	}
	
	public static void printBox(int rows, int cols)
	{
		for (int i = 1; i <= rows; i++)
		{
			//draw all the cols for this row
			for (int j = 1; j <= cols; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void printStair(int rows)
	{
		for (int i = 1; i <= rows; i++)
		{
			//draw all the cols for this row
			for (int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void multTable()
	{
		for (int i = 1; i <= 10; i++)
		{
			for (int j = 1; j <= 10; j++)
			{
				//get our value
				int value = i * j;
				
				//make sure this is two spaces wide
				String displayValue = String.valueOf(value);
				if (displayValue.length() == 1)
				{
					displayValue += " ";
				}
				
				//show it
				System.out.print(displayValue + " ");
			}
			System.out.println();
		}
	}

	//while loops
	//*************************************************
	
	public static void whileLoops()
	{
		//general form
		boolean condition = true;
		while (condition)
		{
			//make sure to approach your stopping condition
			condition = false;
		}
	}
	
	public static void sum()
	{
		//ask the user for positive numbers until they enter
		//a negative number, afterwards I'll print the sum
		//of the entered numbers (without the negative)
		
		int input = 0;
		int sum = 0;
		while (input >= 0)
		{
			//get a number from the user
			input = Console.getInt("Number?");
			
			//increment my sum, but only if non-negative
			if (input >= 0)
			{
				sum += input;
			}
		}
		
		System.out.println("Sum: " + sum);
	}
	
	public static void average()
	{
		//sum the numbers from 1 to 20 and print their average
		
		//for-loop version
		final int MAX = 22;
		double sum = 0;
		for (int i = 1; i <= MAX; i++)
		{
			sum += i;
		}
		double average = sum / MAX;
		System.out.println("Avg: " + average);
		
		//while loop
		int i = 1;
		while (i <= MAX)
		{
			sum += i;
			
			i++;
		}
		average = sum / MAX;
		System.out.println("Avg: " + average);
	}

	//do-while loops
	//*************************************************
	
	public static void doWhileLoops()
	{
		boolean condition = true;
		do
		{
			//make sure you approach a stopping condition
			condition = true;
		} while (condition);
		
		String favShow;
		boolean areYouSure = false;
		do
		{
			favShow = Console.getString("Favorite show on Netflix?");
			areYouSure = Console.getBoolean("Are you sure?");
		} while (!areYouSure);
	}
	
	//break & continue
	//*************************************************
	
	public static void breakAndContinue()
	{
		int num = 1;
		while (true)
		{
			//update num
			if (num % 2 != 0)
			{
				num++;
				continue;
			}
			System.out.println(num++);
			
			if (num > 10)
			{
				break; //exit the loop!
			}
		}
	}
}