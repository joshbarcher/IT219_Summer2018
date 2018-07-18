package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class PracticeWithDates 
{
	public static void main(String[] args) 
	{
		componentParts();
		formattingDates();
		dateDifferences();
	}
	
	public static void creatingObjects()
	{
		//represent dates
		LocalDate today = LocalDate.now();
		LocalDate tomorrow = LocalDate.of(2018, Month.JULY, 18);
		
		//represent times
		LocalTime now = LocalTime.now();
		LocalTime laterToday = LocalTime.of(18, 30);
		
		//represent date and times
		LocalDateTime todayAtThisTime = LocalDateTime.now();
		LocalDateTime fourthOfJuly = LocalDateTime.of(2018, Month.JULY, 
				                                      4, 12, 0);
	}
	
	public static void componentParts()
	{
		LocalDateTime now = LocalDateTime.now();
		
		//date parts
		int year = now.getYear();
		int month = now.getMonthValue();
		int day = now.getDayOfMonth();
		
		System.out.println("Today is " + month + "/" + day + "/" + year);
		
		//time parts
		int hours = now.getHour();
		int minutes = now.getMinute();
		
		String ampm = "am";
		if (hours >= 12)
		{
			ampm = "pm";
		}
		
		System.out.println("It is " + hours + ":" + minutes + ampm + 
				           " right now");
	}
	
	public static void formattingDates()
	{
		LocalTime now = LocalTime.now();
		DateTimeFormatter formatter = 
				DateTimeFormatter.ofPattern("hh:mm a");
		System.out.println(formatter.format(now));
		
		LocalDate today = LocalDate.now();
		DateTimeFormatter dateFormatter = 
				DateTimeFormatter.ofPattern("EEEE 'the' d 'of' M");
		System.out.println(dateFormatter.format(today));
	}
	
	public static void dateDifferences()
	{
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		//alter the date/time to 30 minutes later
		LocalDateTime later = now.plusMinutes(30);
		System.out.println(later);
		
		LocalDateTime lastYear = now.minusYears(1);
		System.out.println(lastYear);
	}
}









