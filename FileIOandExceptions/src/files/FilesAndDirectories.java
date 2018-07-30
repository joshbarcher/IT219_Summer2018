package files;

import java.io.File;

public class FilesAndDirectories 
{
	public static void main(String[] args) 
	{
		//representing files
		File myFile = new File("files/practice.txt");
		
		//see the permission on the file
		System.out.println("Read: " + myFile.canRead());
		System.out.println("Write: " + myFile.canWrite());
		System.out.println("Execute: " + myFile.canExecute());
		
		System.out.println("Directory? " + myFile.isDirectory());
		System.out.println("File? " + myFile.isFile());
		
		System.out.println("Length in bytes: " + myFile.length());
		
		//representing directories
		File myDirectory = new File("files/");

		System.out.println("Directory? " + myDirectory.isDirectory());
		System.out.println("File? " + myDirectory.isFile());
		
		System.out.println("Path to directory: " + myDirectory.getAbsolutePath());
		
		//directory contents as strings
		String[] files = myDirectory.list();
		
		System.out.println();
		System.out.println("Folder contents: ");
		for (int i = 0; i < files.length; i++)
		{
			//System.out.println(files[i]);
			
			//create a file object to determine the length of these files
			File directoryFile = new File(myDirectory.getAbsolutePath() + "/" + 
			                             files[i]);
			
			System.out.println(files[i] + ": length = " + directoryFile.length());
		}
		
		//directory contents as File objects
		File[] contents = myDirectory.listFiles();
		
		System.out.println();
		System.out.println("Folder contents: ");
		for (int i = 0; i < contents.length; i++)
		{
			System.out.println(contents[i].getName() + ": length = " + 
		                       contents[i].length());
		}
		
		//begin searching in a directory
		printDirectory("/"); //start with our project folder
	}
	
	public static void printDirectory(String directory)
	{
		//search through sub-files/sub-directories
		File folder = new File(directory);
		File[] contents = folder.listFiles();
		
		if (contents != null)
		{
			for (int i = 0; i < contents.length; i++)
			{
				File content = contents[i];
				
				//determine if this is a file or folder?
				if (content.isFile())
				{
					System.out.println(content.getAbsolutePath());
				}
				else
				{
					//what to do?
					printDirectory(content.getAbsolutePath());
				}
			}
		}
	}
}












