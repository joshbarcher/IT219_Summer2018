package definingclasses;

public class MyPetProgram 
{
	public static void main(String[] args) 
	{
		Dog winter = new Dog("Syberian Husky", true, 60.0);
		Dog buddy = new Dog();
		
		//printed out a private field value using a getter
		System.out.println("Winter is a " + winter.getBreed());
		System.out.println("Buddy is a " + buddy.getBreed());
		
		//print out all the details of a dog
		System.out.println(winter.getBreed() + ", " + winter.isDomesticated() + ", " + 
		                   winter.getWeight());
		
		//oops, my dog gained some weight
		//winter = new Dog("Syberian Husky", true, 65.0); //avoid constructors
		
		//change my field using a setter
		winter.setWeight(65.0);
		
		//retrieve the change using a getter
		System.out.println("Winter's new weight: " + winter.getWeight());
		
		//alter the weight field of a dog relatively
		winter.setWeight(winter.getWeight() - 3);
		
		//use our toString() method
		System.out.println(buddy.toString());
		System.out.println(buddy);
		System.out.println(winter.toString());
		
		//feed both dogs
		winter.feed("dog food");
		buddy.feed("human food");
	}
}