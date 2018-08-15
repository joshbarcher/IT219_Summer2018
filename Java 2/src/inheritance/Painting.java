package inheritance;

import java.util.Arrays;

public class Painting extends PieceOfArt //Painting is a child class of PieceOfArt
{
	private String[] styles;
	private String canvasType;
	
	public Painting()
	{
		//calling the default constructor in the parent class
		super();
		
		styles = new String[] {"watercolor"};
		canvasType = "standard";
	}
	
	public Painting(String artistName, double value, String[] styles, String canvasType) 
	{
		//call the parameterized constructor in the parent class
		super(artistName, value);
		
		this.styles = styles;
		this.canvasType = canvasType;
	}

	public String[] getStyles() 
	{
		return styles;
	}

	public String getCanvasType() 
	{
		return canvasType;
	}

	@Override
	public String toString() 
	{
		return "Painting [styles=" + Arrays.toString(styles) + 
				", canvasType=" + canvasType + "]";
	}
}
