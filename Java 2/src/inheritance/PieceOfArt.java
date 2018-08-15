package inheritance;

public class PieceOfArt 
{
	private String artistFullName;
	private double value;
	
	public PieceOfArt()
	{
		super();
		
		artistFullName = "Susie Smith";
		value = 199.99;
	}
	
	public PieceOfArt(String artistFullName, double value) 
	{
		this.artistFullName = artistFullName;
		this.value = value;
	}

	public String getArtistFullName() 
	{
		return artistFullName;
	}

	public double getValue() 
	{
		return value;
	}

	@Override
	public String toString() 
	{
		return "PieceOfArt [artistFullName=" + artistFullName + 
				", value=" + value + "]";
	}
}
