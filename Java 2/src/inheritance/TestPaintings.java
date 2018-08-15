package inheritance;

public class TestPaintings 
{
	public static void main(String[] args) 
	{
		//create a default painting
		Painting workOfArt = new Painting();
		
		Painting anotherPieceOfArt = new Painting("William Smith", 19.99, 
				                                  new String[] {"acrylic"}, "premium");
		
		//print out the details of our art
		System.out.println("Artist: " + anotherPieceOfArt.getArtistFullName());
		System.out.println("Canvas type: " + anotherPieceOfArt.getCanvasType());
	}
}
