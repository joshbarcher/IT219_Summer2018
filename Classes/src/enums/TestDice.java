package enums;

public class TestDice 
{
	public static void main(String[] args) 
	{
		Dice die = new Dice(DiceSides.SIX, "Red");
		System.out.println(die);
	}
}
