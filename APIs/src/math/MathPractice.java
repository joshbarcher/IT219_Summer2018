package math.lecture;

public class MathPractice 
{
	public static void main(String[] args)
	{
		//exponents
		//**************************************************
		
		//int result = Math.pow(2, 6); //careful of your return types
		double result = Math.pow(3,  3);
		System.out.println(result);
		
		System.out.println(Math.pow(10, -4));
		
		//logs
		//**************************************************
		
		System.out.println(Math.log10(1000)); //3
		System.out.println(Math.log(Math.E)); //1
		
		//change of base formula loga(b) = logc(b) / logc(a)
		System.out.println("log2(16) = " + Math.log(16) / Math.log(2)); //4
		
		//rounding
		//**************************************************
		
		long rounded = Math.round(12.789); //13
		System.out.println(rounded);
		rounded = Math.round(12.22); //12
		System.out.println(rounded);
		
		System.out.println(Math.floor(13.9)); //round down (13)
		System.out.println(Math.ceil(13.1)); //round up (14)
		
		//trigonometry
		//**************************************************
		
		double degrees = 90;
		double radians = Math.toRadians(degrees);
		degrees = Math.toDegrees(radians);
		
		//trig functions only use radians
		System.out.println(Math.cos(radians));
		System.out.println(Math.sin(radians));
		
		//other functions/constants
		//**************************************************
		
		result = Math.sqrt(16);
		System.out.println(result);
		
		double radius = 2;
		double area = Math.PI * Math.pow(radius, 2);
		System.out.println(area);
	}
}