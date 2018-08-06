package classinteractions;

import formaldocumentation.Book;

public class BookShelfDriver 
{
	public static void main(String[] args) 
	{
		//create a book shelf of books
		BookShelf shelf = new BookShelf(3);
		
		//add a few books
		Book myBook1 = new Book("J.R.R. Tolkien", "The Fellowship of the Ring",
				               true, 19.99);
		Book myBook2 = new Book("Suzanne Collins", "The Hunger Games",
	                           false, 9.99);
		Book myBook3 = new Book("Stuart & Regis", "Building Java Programs",
	                           false, 99.99);
		Book myBook4 = new Book("???", "Java for Dummies", true, 9.99);
		
		try 
		{
			shelf.addBook(myBook1);
			shelf.addBook(myBook2);
			shelf.addBook(myBook3);
			shelf.addBook(myBook4);
		}
		catch (RuntimeException ex)
		{
			System.out.println("There is no more room in the shelf!");
		}
		
		//print the shelf
		shelf.printBookShelf();
	}
}
