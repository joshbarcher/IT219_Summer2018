
public class Preparation 
{
	//fields are visible to all functions (methods) in a class
	private static String name;
	
	//create named constants to remove magic numbers
	private static final int NAME_TOO_LONG = 10;
	
	public static void main(String[] args)
	{
		getInputs();
		printOutput();
	}
	
	public static void getInputs()
	{
		//ask the user for their name
		name = Console.getString("Enter your name");
	}
	
	public static void printOutput()
	{
		System.out.println("Your name is " + name);
		
		if (name.length() > NAME_TOO_LONG)
		{
			System.out.println("Your name is very long!");
		}
	}
}
