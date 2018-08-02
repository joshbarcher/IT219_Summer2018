package pp;

public class Book 
{
	private String author;
	private String title;
	private boolean eBook;
	private double price;
	
	public Book(String newAuthor, String newTitle, boolean newEBook, 
			    double newPrice) 
	{
		author = newAuthor;
		title = newTitle;
		eBook = newEBook;
		price = newPrice;
	}
	
	public Book()
	{
		author = "Suzanne Collins";
		title = "The Hunger Games";
		eBook = true;
		price = 9.99;
	}

	public String getAuthor() 
	{
		return author;
	}

	public void setAuthor(String newAuthor) 
	{
		author = newAuthor;
	}

	public String getTitle() 
	{
		return title;
	}

	public void setTitle(String newTitle) 
	{
		title = newTitle;
	}

	public boolean iseBook() 
	{
		return eBook;
	}

	public void seteBook(boolean newEBook) 
	{
		eBook = newEBook;
	}

	public double getPrice() 
	{
		return price;
	}

	public void setPrice(double newPrice) 
	{
		price = newPrice;
	}

	@Override
	public String toString() 
	{
		return "Book [author=" + author + ", title=" + title + 
				", eBook=" + eBook + ", price=" + price + "]";
	}
}
