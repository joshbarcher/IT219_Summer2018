
public class Decomposition 
{
	public static void main(String[] args)
	{
		//build each shape
		egg();
        System.out.println();
        
		cup();
        System.out.println();
        
		stopSign();
        System.out.println();
        
		hat();
	}
	
	public static void egg()
	{
		eggTop();
		eggBottom();
	}
	
	public static void eggTop()
	{
		System.out.println("  ______");
        System.out.println(" /      \\");
        System.out.println("/        \\");
	}
	
	public static void eggBottom()
	{
		System.out.println("\\        /");
        System.out.println(" \\______/");
	}
	
	public static void cup()
	{
		eggBottom();
        System.out.println("+--------+");
	}
	
	public static void stopSign()
	{
		eggTop();
        System.out.println("|  STOP  |");
        eggBottom();
	}
	
	public static void hat() 
	{
		eggTop();
        System.out.println("+--------+");
	}
	
	public static void before()
	{
		System.out.println("  ______");
        System.out.println(" /      \\");
        System.out.println("/        \\");
        System.out.println("\\        /");
        System.out.println(" \\______/");
        System.out.println();
        System.out.println("\\        /");
        System.out.println(" \\______/");
        System.out.println("+--------+");
        System.out.println();
        System.out.println("  ______");
        System.out.println(" /      \\");
        System.out.println("/        \\");
        System.out.println("|  STOP  |");
        System.out.println("\\        /");
        System.out.println(" \\______/");
        System.out.println();
        System.out.println("  ______");
        System.out.println(" /      \\");
        System.out.println("/        \\");
        System.out.println("+--------+");
	}
}