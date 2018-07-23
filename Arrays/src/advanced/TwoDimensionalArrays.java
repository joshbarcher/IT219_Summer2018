package advanced;

public class TwoDimensionalArrays 
{
	public static void main(String[] args) 
	{
		workingIn2D();
		
		int[][] table = multTable(100, 100);
		printTable(table);
	}
	
	public static void workingIn2D()
	{
		//store name, phone, and email for a contact
		String[][] contact = new String[3][];
		
		//name
		contact[0] = new String[3];
		contact[0][0] = "Josh";
		contact[0][1] = "B";
		contact[0][2] = "Archer";
		
		//phone
		contact[1] = new String[1];
		contact[1][0] = "999-888-5555";
		
		//email
		contact[2] = new String[2];
		contact[2][0] = "e@e.com";
		contact[2][1] = "me@gmail.com";
		
		//what if I want to add another phone #?
		//contact[1][1] = "333-444-5555";
	}
	
	public static int[][] multTable(int width, int height)
	{
		//detect bad inputs
		if (width <= 0 || height <= 0)
		{
			return null;
		}
		
		int[][] results = new int[width][height];
		
		//assemble the table and return it!
		for (int i = 1; i <= width; i++)
		{
			for (int j = 1; j <= height; j++)
			{
				results[i - 1][j - 1] = i * j;
			}
		}
		
		return results;
	}
	
	//this function prints out a 2D array
	public static void printTable(int[][] table)
	{
		//first dimension (row)
		for (int i = 0; i < table.length; i++) 
		{
			//second dimension (col)
			for (int j = 0; j < table[i].length; j++)
			{
				System.out.print(table[i][j] + " ");
			}
			System.out.println();
		}
	}
}













