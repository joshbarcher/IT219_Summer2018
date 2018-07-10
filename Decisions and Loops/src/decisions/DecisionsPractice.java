package decisions;

public class DecisionsPractice 
{
	public static void main(String[] args)
	{
		printName("Josh", 'B', "Archer", true, "Mr", false);
		printName("Ibby", 'E', "Archer", false, "Mrs", false);
		
		rateMyPet("Pug");
		printMe("Josh", 73);
	}
	
	//#1: conditional execution
	public static void definePosNeg(int number)
	{
		//expressions as a condition
		if (number < 0)
		{
			System.out.println(number + " is negative!");
		}
		
		//boolean variable as a condition
		boolean condition = number > 0;
		if (condition)
		{
			System.out.println(number + " is positive!");
		}
		
		//variable assignment as a condition
		if (condition = number == 0) //don't do this!
		{
			System.out.println(number + " is zero!");
		}
	}
	
	public static void defineEvenOdd(int number)
	{
		//this is the "good" way
		if (number % 2 == 0)
		{
			System.out.println(number + " is even");
		}
		else
		{
			System.out.println(number + " is odd");
		}
		
		//this is the "bad" way (asking too many questions)
		if (number % 2 == 0)
		{
			System.out.println(number + " is even");
		}
		
		if (number % 2 != 0)
		{
			System.out.println(number + " is odd");
		}
	}

	//#2: using mutual exclusion
	
	public static void evaluate(String source) 
	{
		int sourceLength = source.length();
		if (sourceLength == 0)
		{
			System.out.println("Empty string");
		}
		else if (sourceLength < 3)
		{
			System.out.println("Short string");
		}
		else if (sourceLength < 10)
		{
			System.out.println("Normal string length...");
		}
		else 
		{
			System.out.println("This is a very large string");
		}
	}
	
	//#3: nested if-statements
	
	public static void printName(String first, char middleInit,
			                     String last, boolean longFormat,
			                     String surname, boolean showSurname)
	{
		if (longFormat)
		{
			String fullName = first + " " + middleInit + ". " + last;
			if (showSurname)
			{
				System.out.println(surname + " " + fullName);
			}
			else
			{
				System.out.println(fullName);
			}
		}
		else
		{
			System.out.println(first);
		}
	}
	
	//#4: switch statements
	
	public static void determineAge()
	{
		int age = Console.getInt("What is your age?");
		
		switch(age)
		{
			case 1:
				System.out.println("You are a toddler!");
			case 5:
				System.out.println("You are a child");
			case 15:
				System.out.println("You are a teenager");
						
		}
	}
	
	public static void monthsByWeather()
	{
		String month = Console.getString("Enter the month");
		
		switch(month)
		{
			case "January":
			case "February":
			case "March":
			case "September":
			case "October":
			case "November":
			case "December":
				System.out.println("Rainy season!");
				break;
			case "April":
			case "May":
				System.out.println("Overcast!");
				break;
			case "June":
			case "July":
			case "August":
				System.out.println("Sunny!");
				break;
			default:
				System.out.println("Unknown month");
				break;
		}
	}
	
	//#5: curly braces can be optional
	
	public static void rateMyPet(String petType)
	{
		/*if (petType.equals("Siberian Husky"))
			System.out.println("Lovely pet!");
		else if (petType.equals("Pug"))
			System.out.println("Short and stout!");*/
		
		if (petType.equals("Siberian Husky")) System.out.println("Lovely pet!");
		else System.out.println("That dog smells");
	}
	
	//#6: ternary statement
	
	public static void printMe(String name, double inchesTall)
	{
		//short notation
		String isTall = (inchesTall > 72) ? "tall" : "not tall";
		System.out.println(isTall);
		
		//long notation
		if (inchesTall > 72)
		{
			isTall = "tall";
		}
		else
		{
			isTall = "not tall";
		}
	}
}









