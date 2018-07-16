package strings;

public class StringsPractice 
{
	public static void main(String[] args) 
	{
		String story = "It all began with a ...";
		String catStory = new String("The cat walked over to the fence...");
		
		//strings are immutable
		//************************************************
		story.replace("a", "aaa");
		System.out.println(story); //no change to story
		
		//workaround #1 - new variable
		String sillyStory = story.replace("a", "aaa");
		System.out.println(sillyStory);
		
		//workaround #2 - expression
		System.out.println(story.replace("a", "aaa"));
		
		//workaround #3 - reassign the variable
		//story = story.replace("a", "aaa");
		System.out.println(story);
		
		//length()
		System.out.println("characters in story: " + story.length());
		
		//look at individual characters with charAt()
		for (int i = 0; i < sillyStory.length(); i++)
		{
			char character = sillyStory.charAt(i);
			
			if (Character.isAlphabetic(character))
			{
				System.out.println(character + " is alphabetic");
			}
		}
		
		//look for the position of a substring using indexOf()
		int index = story.indexOf(" ");
		System.out.println("Found a space at " + index);
		
		int lastIndex = story.lastIndexOf(" ");
		System.out.println("Found a space at " + lastIndex);
		
		if (story.indexOf("aaa") != -1)
		{
			System.out.println("I found it!");
		}
		else
		{
			System.out.println("Not found!");
		}
		
		//determine if a substring exists with contains()
		if (sillyStory.contains("aaa"))
		{
			System.out.println("I found it!");
		}
		else
		{
			System.out.println("Not found!");
		}
		
		//we can pull strings apart using substring()
		String word = story.substring(7, 12);
		System.out.println("word: " + word);
		
		String part = story.substring(7);
		System.out.println("part: " + part);
		
		//check for string equality
		if (word == "began") //not reliable
		{
			
		}
		
		if (word.equals("began")) //reliable
		{
			
		}
		
		if (word.equalsIgnoreCase("BEGAN")) //ignoring case sensitivity
		{
			
		}
		
		//how do we identify tokens?
		String[] words = story.split("a");
		
		//loop over indices
		for (int i = 0; i < words.length; i++)
		{
			String element = words[i]; //access the element at the current index
			System.out.println("Token: " + element);
		}
	}
}









