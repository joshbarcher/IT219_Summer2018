package fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import exceptions.Console;

public class WritingToFiles 
{
	public static void main(String[] args)
	{
		writeCSVData();
	}
	
	public static void writeCSVData()
	{
		try 
		{
			//open file questionaire.csv and append to it (the boolean value)
			PrintWriter writer = new PrintWriter(
					new FileOutputStream("files/questionaire.csv", true));
			
			String name = Console.getString("Name?");
			String movie = Console.getString("Last movie you saw?");
			boolean pet = Console.getBoolean("Do you own a pet?");
			
			writer.println(name + "," + movie + "," + pet);
			
			writer.close();
		}
		catch (FileNotFoundException ex)
		{
			System.out.println("Something went wrong: " + ex.getMessage());
		}
	}
	
	public static void writingBasicText()
	{
		try 
		{
			PrintWriter writer = new PrintWriter(new FileOutputStream("practice.txt"));
			
			//write a few basic values to the file
			writer.println("hello world, everyone!");
			writer.print(10);
			writer.print(true);
			writer.println('c');
			
			writer.close();
		}
		catch (FileNotFoundException ex)
		{
			//send a message to the user
			System.out.println("Something went wrong: " + ex.getMessage());
		}
	}
}
