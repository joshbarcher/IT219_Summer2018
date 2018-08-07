package enums;

public class Dice 
{
	private DiceSides sides; //use your enum to store the sides
	private String color;
	
	public Dice(DiceSides sides, String color)
	{
		this.sides = sides;
		this.color = color;
	}
	
	public String toString()
	{
		return "This is a " + sides + " sided die";
	}
}
