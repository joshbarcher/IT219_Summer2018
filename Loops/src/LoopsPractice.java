
public class LoopsPractice 
{
	public static void main(String[] args) 
	{
		//forLoops();
		//printingWithForLoops();
		printBox(7, 4);
	}
	
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
}








