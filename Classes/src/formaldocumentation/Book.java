package formaldocumentation;

/**
 * This class represents a book that can be an E-Book or a regular book.
 * 
 * @author Josh Archer
 * @version 1.0
 */
public class Book 
{
	private String author;
	private String title;
	private boolean eBook;
	private double price;
	
	/**
	 * This creates a new book with all details that can be tracked
	 * for a book.
	 * 
	 * @param newAuthor an author for the book
	 * @param newTitle the title of the book
	 * @param newEBook is this book an E-Book?
	 * @param newPrice the price of the book
	 */
	public Book(String newAuthor, String newTitle, boolean newEBook, 
			    double newPrice) 
	{
		author = newAuthor;
		title = newTitle;
		eBook = newEBook;
		price = newPrice;
	}
	
	/**
	 * This creates a default book "The Hunger Games" by Suzanne Collins
	 */
	public Book()
	{
		author = "Suzanne Collins";
		title = "The Hunger Games";
		eBook = true;
		price = 9.99;
	}

	/**
	 * This gives you the author of the book. 
	 * 
	 * @return the author as a string
	 */
	public String getAuthor() 
	{
		return author;
	}

	/**
	 * This changes the author of the book.
	 * 
	 * @param newAuthor the new books author
	 */
	public void setAuthor(String newAuthor) 
	{
		author = newAuthor;
	}

	/**
	 * Returns the title of the book.
	 * @return the book title as a string
	 */
	public String getTitle() 
	{
		return title;
	}

	/**
	 * Changes the title of the book.
	 * 
	 * @param newTitle the new book title
	 */
	public void setTitle(String newTitle) 
	{
		title = newTitle;
	}

	/**
	 * Reports whether this book is an E-book or not.
	 * @return true if this book is an E-book, or false otherwise
	 */
	public boolean iseBook() 
	{
		return eBook;
	}

	/**
	 * Changes the book to a new format.
	 * 
	 * @param newEBook true if this book is an E-book, or false otherwise
	 */
	public void seteBook(boolean newEBook) 
	{
		eBook = newEBook;
	}

	/**
	 * Returns the price of the book.
	 * 
	 * @return the price as a double
	 */
	public double getPrice() 
	{
		return price;
	}

	/**
	 * Sets a new price for the book.
	 * 
	 * @param newPrice the new price
	 */
	public void setPrice(double newPrice) 
	{
		price = newPrice;
	}

	/**
	 * Returns all book details as a string.
	 * 
	 * @return a string representation of the Book
	 */
	public String toString() 
	{
		return "Book [author=" + author + ", title=" + title + 
				", eBook=" + eBook + ", price=" + price + "]";
	}
}








