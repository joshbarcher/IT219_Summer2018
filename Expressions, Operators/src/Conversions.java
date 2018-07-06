
public class Conversions 
{
	//field (like a global variable)
	private static int number = 1000;
	
	public static void main(String[] args)
	{
		//widening conversion (always accurate)
		byte numByte = 100; // ~ -128 -- 127
		int numInt = numByte; // ~ -2b -- 2b
		
		//narrowing conversion (you might lose data)
		//this requires a "cast", (short)variable
		numInt = 100000;
		short numShort = (short)numInt; // ~ -32k -- 32k
		System.out.println(numShort);
		
		number = 100;
	}
	
	public static void foo()
	{
		number = 100000;
	}
}
