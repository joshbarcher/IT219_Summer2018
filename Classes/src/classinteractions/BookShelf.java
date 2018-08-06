package classinteractions;

import formaldocumentation.Book;

/**
 * This class represents a book shelf. The user can
 * declare how many books fit in a book shelf when
 * they create the object.
 * 
 * @author Josh Archer
 * @version 1.0
 */
public class BookShelf 
{
	private static final int DEFAULT_SIZE = 40;
	private Book[] books;
	
	/**
	 * Creates a new book shelf. If given a non-positive number
	 * of books, the book shelf will default to holding 40 books.
	 * 
	 * @param maxBooks the number of books on the shelf
	 */
	public BookShelf(int maxBooks)
	{
		if (maxBooks <= 0)
		{
			//pick a default if given a bad value
			maxBooks = DEFAULT_SIZE;
		}
		
		//make room for the requested number of books
		books = new Book[maxBooks];
	}
	
	public void addBook(Book newBook)
	{
		//loop over our available spots in the shelf
		for (int i = 0; i < books.length; i++)
		{
			//is this space open?
			if (books[i] == null)
			{
				books[i] = newBook;
				return; //exits a method with a void return type
			}
		}
		
		//we didn't find room for the book
		throw new RuntimeException("There is no more room in the shelf");
	}
	
	public void printBookShelf()
	{
		for (int i = 0; i < books.length; i++)
		{
			if (books[i] != null)
			{
				System.out.println(books[i].getTitle() + " by " + 
	                       books[i].getAuthor());
			}
		}
	}
}












