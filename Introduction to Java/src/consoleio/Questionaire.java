package consoleio;

public class Questionaire 
{
	public static void main(String[] args)
	{
		//get values from the user - Strings, numbers, booleans
		
		//ask the user for their name
		String firstName = Console.getString("First name?");
		String middleInitial = Console.getString("Middle Initial?");
		String lastName = Console.getString("Last name?");
		
		//print a message to the user
		System.out.println(firstName + " " + middleInitial + 
				           ". " + lastName);
		System.out.println(); //a blank space
		
		//ask them for some non-string data
		int age = Console.getInt("What is your age?");
		if (age < 50)
		{
			System.out.println("Have you ever gone surfing?");
		}
		
		boolean hungry = Console.getBoolean("Are you hungry?");
		if (hungry)
		{
			System.out.println("Go make a sandwich!");
		}
	}
}










