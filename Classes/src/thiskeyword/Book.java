package thiskeyword;

public class Book 
{
	String author;
	String title;
	boolean eBook;
	double price;
	
	public Book(String author, String title, boolean eBook, 
			    double price) 
	{
		//the "this" keyword represents the object this method
		//was called upon...
		this.author = author;
		this.title = title;
		this.eBook = eBook;
		this.price = price;
	}
	
	public Book()
	{
		author = "Suzanne Collins";
		title = "The Hunger Games";
		eBook = true;
		price = 9.99;
	}

	String getAuthor() 
	{
		return author;
	}

	public void setAuthor(String author) 
	{
		this.author = author;
	}

	public String getTitle() 
	{
		return title;
	}

	public void setTitle(String title) 
	{
		this.title = title;
	}

	public boolean iseBook() 
	{
		return eBook;
	}

	public void seteBook(boolean eBook) 
	{
		this.eBook = eBook;
	}

	public double getPrice() 
	{
		return price;
	}

	public void setPrice(double price) 
	{
		this.price = price;
	}

	public String toString() 
	{
		return "Book [author=" + author + ", title=" + title + 
				", eBook=" + eBook + ", price=" + price + "]";
	}
}








