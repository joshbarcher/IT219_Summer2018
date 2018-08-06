package thiskeyword;

public class TestBooks 
{
	public static void main(String[] args)
	{
		Book myBook = new Book("J.R.R. Tolkien", "The Fellowship of the Ring",
				               true, 19.99);
		
		myBook.title = "The Two Towers";
	}
}
