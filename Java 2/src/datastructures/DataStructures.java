package datastructures;

import java.util.ArrayList;

public class DataStructures 
{
	public static void main(String[] args) 
	{
		//the built-in data structure type in Java
		int[] nums = {1, 2, 3};
		
		//we need a data type whose length is not unchanging
		ArrayList<String> listOfWords = new ArrayList<String>();
		
		//this list will grow as needed
		listOfWords.add("elephant");
		listOfWords.add("Halloween");
		listOfWords.add("sad");
		
		//add a bunch of elements
		for (int i = 1; i <= 100000; i++)
		{
			listOfWords.add("hello");
		}
		
		//print the size of the data structure
		System.out.println("Size of list: " + listOfWords.size());
		
		for (int i = 0; i < listOfWords.size(); i++)
		{
			System.out.println(listOfWords.get(i).toUpperCase());
		}
		
		//we can use a for-each loop to look through our elements in the list
		for (String word : listOfWords)
		{
			System.out.println("Word: " + word);
		}
		
		//wipe out all elements in the list
		listOfWords.clear();
		System.out.println("Size of list: " + listOfWords.size());
	}
}







