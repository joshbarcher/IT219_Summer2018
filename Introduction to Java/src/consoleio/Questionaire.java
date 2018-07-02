
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
	}
}
