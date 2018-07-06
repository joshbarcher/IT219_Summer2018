package shapes;

public class DrawShapes 
{
	public static void main(String[] args)
	{
		//draw a few lines
		drawLine(7);
		drawLine(13);
		drawLine(22);
		
		System.out.println();
		
		//draw a few boxes
		box(4, 4);
		System.out.println();
		box(8, 3);
		System.out.println();
		box(10, 10);
		System.out.println();
	}
	
	public static void drawLine(int numChars)
	{
		repeat("*", numChars);
		System.out.println(); //a new line
	}
	
	public static void box(int width, int height)
	{
		//draw the top of the box
		drawLine(width);
		
		//draw the middle
		int middleLines = height - 2;
		for (int i = 1; i <= middleLines; i++)
		{
			System.out.print("*");
			repeat(" ", width - 2);
			System.out.println("*");	
		}
		
		//draw the bottom
		drawLine(width);
	}
	
	public static void repeat(String character, int times)
	{
		for (int i = 1; i <= times; i++)
		{
			System.out.print(character);
		}
	}
}








