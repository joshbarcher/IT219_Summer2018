package fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFromFiles 
{
	public static void main(String[] args) 
	{
		readingFiles();
		//System.out.println("Lines: "  + linesInFile("files/war and peace.txt"));
		//System.out.println("Characters: "  + charactersInFile("files/war and peace.txt"));
	}
	
	public static int charactersInFile(String fileName)
	{
		try 
		{
			Scanner reader = new Scanner(new FileInputStream(fileName));
			
			int count = 0;
			while (reader.hasNextLine()) 
			{
				String line = reader.nextLine();
				
				//add to count the number of characters in "line"
				count += line.length();
			}
			
			reader.close();
			return count;
		}
		catch (FileNotFoundException ex)
		{
			System.out.println("File was not found: " + ex.getMessage());
			return -1;
		}
	}
	
	public static int linesInFile(String fileName)
	{
		try 
		{
			Scanner reader = new Scanner(new FileInputStream(fileName));
			
			int count = 0;
			while (reader.hasNextLine()) //do we have another line
			{
				//move to the next line of the file
				reader.nextLine();
				count++;
			}
			
			//relinquish control of the file
			reader.close();
			
			return count + 1; //+1 to catch the last line of the file
		}
		catch (FileNotFoundException ex)
		{
			System.out.println("File was not found: " + ex.getMessage());
			return -1;
		}
	}
	
	public static void readingFiles()
	{
		try 
		{
			FileInputStream reader = new FileInputStream("files/war and peace.txt");
			Scanner fileReader = new Scanner(reader);
			
			//read a line from the file and print it out
			String line = fileReader.nextLine();
			System.out.println(line);
			
			//read all lines from the file
			while (fileReader.hasNextLine())
			{
				String currentLine = fileReader.nextLine();
				System.out.println(currentLine);
			}
			
			fileReader.close();
		} 
		catch (FileNotFoundException ex) 
		{
			//prints the stack trace
			//ex.printStackTrace();
			System.out.println("File was not found: " + ex.getMessage());
		}
	}
}





