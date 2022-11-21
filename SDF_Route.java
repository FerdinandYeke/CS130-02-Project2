package Project2;
import java.util.Scanner;


public class SDF_Route {

	private String Date;
	private String FlightTicket;

	//Displays routes from Louisville within the States
	public void display_route()
	{
		System.out.println("This is Delta Airlines. "
				+ "\nThis shows the avaliable routes from "
				+ "\nLouisville with Delta Airlines.");
		System.out.println("Airline IATA code: DL");
		
		System.out.println("ATL: Alanta, Georgia.");
		System.out.println("ATL Flight Duration: 1 hour & 28 minutes.");
		System.out.println("");
		System.out.println("LGA: New York.");
		System.out.println("LGA Flight Duration: 2 hours & 13 minutes.");
		System.out.println("");
		System.out.println("DTW: Detroit, Michigin.");
		System.out.println("DTW Flight Duration: 1 hour & 28 minutes.");
		System.out.println("");
		System.out.println("MSP: Minneapolis.");
		System.out.println("MSP Flight Duration: 2 hours & 10 minutes.");
		
	}
	
	public static boolean hasBook(boolean b)
	{
		return false;
		
	}
	
	
	public void Date()
	{
		Scanner scan = new Scanner(System.in);
		int mnth;
		int day;
		int year;
		
		System.out.println("Enter your date for booking");
		 mnth = scan.nextInt();
		 day = scan.nextInt();
		 year = scan.nextInt();
		
		
		if(mnth == 1 && mnth <= 12 
				&& day == 01 && day <= 31 
				&& year == 2022 || day <= 2023)
		{
		this.Date = Date;
		String Date = mnth +"/"+day+"/"+year;
		
			System.out.println(Date);	
		}
		
		
		else if(mnth == 1 && mnth <= 12 
				&& day == 1 && day <= 31 
				&& year == 2022 || day <= 2023
				&& year % 4 == 0)
		{
			this.Date = Date;
			String Date = mnth +"/"+day+"/"+year;
			System.out.println("Your date of booking: "+Date);
			
		}
		else
		{
			System.out.println("Invalid input! Please"
					+ " enter a valid input.");
		}
		
	}
	
	public String generateFlightNum(int length)
	{
		String FlightTicketSet = "1234567890";
		
		length = 13;
		
		char [] FlightTicket = new char [length];//an array to hold the values of the Flight ticket values
		
		for(int i = 0; i < length; i++)
		{
			int rand1 = (int) Math.random() * FlightTicketSet.length();//Generates random Password
			FlightTicket[i] = FlightTicketSet.charAt(rand1); //Gets values from randomly generated places
		}
		return new String (FlightTicket);//returns the value to a String
		
	}
	
	public void FlightNum1()
	{
		this.FlightTicket = generateFlightNum(13);
		System.out.println("Your Flight Ticket: "+this.FlightTicket);
	}
	
}
