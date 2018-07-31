package definingclasses;

public class Dog 
{
	//fields
	private String breed;
	private boolean domesticated;
	private double weight;
	
	//constructors
	public Dog(String newBreed, boolean isDomesticated, 
			   double newWeight)
	{
		breed = newBreed;
		domesticated = isDomesticated;
		weight = newWeight;
	}
	
	public Dog()
	{
		//pick some sensible defaults
		breed = "lab";
		domesticated = true;
		weight = 20.0;
	}
	
	//getters & setters
	public String getBreed()
	{
		return breed;
	}
	
	public boolean isDomesticated()
	{
		return domesticated;
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	public void setBreed(String newBreed)
	{
		breed = newBreed;
	}
	
	public void setDomesticated(boolean isDomesticated)
	{
		domesticated = isDomesticated;
	}
	
	public void setWeight(double newWeight)
	{
		weight = newWeight;
	}
	
	//general methods (actions) on the class
	public void bark()
	{
		System.out.println("rufffff");
	}
	
	public void feed(String food)
	{
		System.out.println("You fed the " + breed + " " + food + "!");
	}
	
	//toString() - return a string representation of your object
	public String toString()
	{
		String yesNo = domesticated ? "yes" : "no";
		return "Breed: " + breed + ", domesticated: " + yesNo;
	}
}










