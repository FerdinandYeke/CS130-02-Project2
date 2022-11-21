package Project2;

import java.util.Scanner;
import java.text.*;

public class Delta_Airlines_SDF extends SDF_Route {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
		Scanner scan = new Scanner(System.in);
		SDF_Route s1 = new SDF_Route();
		double ticket_price = 50.00;
		
		s1.display_route();
		System.out.println("Please enter the Following Choices to progress: "
				+ "\n1.ATL \n2.LGA \n3.DTW \n4.MSP");
		
		int choice = scan.nextInt();
		
		switch(choice)
		{
		case 1:
			{
			
				System.out.println("You've entered: ATL");
				System.out.println("Enter the amount of days to travel "
						+ "\nfor a Roundtrip: ");
				
				int days = scan.nextInt();
				
				if(days != 0 && days <= 5 && days <= 10)
				{
					System.out.println("The Prices of the ticket on "+days+" "
							+ " days are: "+fmt1.format(ticket_price));
					
						System.out.println("Do you want to book this flight?");
						System.out.println("Y for Yes; N for No: ");
						char Ans = scan.next().charAt(0);
						
						if(Ans == 'Y')
						{
							s1.Date();
							s1.FlightNum1();
							s1.FlightNum1();System.out.println("The ticket price: "+fmt1.format(ticket_price));
							System.out.println("Days for stay: "+days);
							System.out.println("Airport Destination: ATL");
						}
						else if(Ans == 'N') {
							System.out.print("Your ticket refund: "+fmt1.format(ticket_price));
						}
				}
				
				else if(days <= 10 && days <= 15)
				{
					System.out.println("The Prices of the ticket on "+days+" "
							+ " days are: "+fmt1.format(ticket_price+15));
					System.out.println("Do you want to book this flight?");
					System.out.println("Y for Yes; N for No: ");
					char Ans = scan.next().charAt(0);
					
					if(Ans == 'Y')
					{
						s1.Date();
						s1.FlightNum1();
						
						s1.FlightNum1();System.out.println("The ticket price: "+fmt1.format(ticket_price));
						System.out.println("Days for stay: "+days);
						System.out.println("Airport Destination: ATL");
					}
					else if(Ans == 'N') {
						System.out.print("Your ticket refund: "+fmt1.format(ticket_price));
					}
					
				}
				
				else if(days <= 15 && days <= 20)
				{
					System.out.println("The Prices of the ticket on "+days+" "
							+ " days are: "+fmt1.format(ticket_price+16));
					System.out.println("Do you want to book this flight?");
					System.out.println("Y for Yes; N for No: ");
					char Ans = scan.next().charAt(0);
					
					if(Ans == 'Y')
					{
						s1.Date();
						s1.FlightNum1();
						s1.FlightNum1();System.out.println("The ticket price: "+fmt1.format(ticket_price));
						System.out.println("Days for stay: "+days);
						System.out.println("Airport Destination: ATL");
					}
					else if(Ans == 'N') {
						System.out.print("Your ticket refund: "+fmt1.format(ticket_price));
					}
					
				}
				
				else if(days <= 20 && days <= 30)
				{
					System.out.println("The Prices of the ticket on "+days+" "
							+ " days are: "+fmt1.format(ticket_price+119));
					System.out.println("Do you want to book this flight?");
					System.out.println("Y for Yes; N for No: ");
					char Ans = scan.next().charAt(0);
					
					if(Ans == 'Y')
					{
						s1.Date();
						s1.FlightNum1();
						s1.FlightNum1();System.out.println("The ticket price: "+fmt1.format(ticket_price));
						System.out.println("Days for stay: "+days);
						System.out.println("Airport Destination: ATL");
					}
					else if(Ans == 'N') {
						System.out.print("Your ticket refund: "+fmt1.format(ticket_price));
					}
				}
				
				else if(days <= 62)
				{
					System.out.println("The Prices of the ticket on "+days+" "
							+ " days are: "+fmt1.format(ticket_price+190));
					System.out.println("Do you want to book this flight?");
					System.out.println("Y for Yes; N for No: ");
					char Ans = scan.next().charAt(0);
					
					if(Ans == 'Y')
					{
						s1.Date();
						s1.FlightNum1();
						s1.FlightNum1();System.out.println("The ticket price: "+fmt1.format(ticket_price));
						System.out.println("Days for stay: "+days);
						System.out.println("Airport Destination: ATL");
						
					}
					else if(Ans == 'N') {
						System.out.print("Your ticket refund: "+fmt1.format(ticket_price));
					}
				}
				
				
				else
				{
					System.out.println("Exceeded the amount of days for a "
							+ " road trip; which is 62. Please enter again");
				}	
					
			}
				break;

		case 2:
			{
				System.out.println("You've entered: LGA");
				System.out.println("Enter the amount of days to travel "
						+ "\nfor a Roundtrip: ");
				
				int days = scan.nextInt();
				
				if(days != 0 && days <= 5 && days <= 10)
				{
					System.out.println("The Prices of the ticket on "+days+" "
							+ " days are: "+fmt1.format(ticket_price));
					System.out.println("Do you want to book this flight?");
					System.out.println("Y for Yes; N for No: ");
					char Ans = scan.next().charAt(0);
					
					if(Ans == 'Y')
					{
						s1.Date();
						s1.FlightNum1();System.out.println("The ticket price: "+fmt1.format(ticket_price));
						System.out.println("Days for stay: "+days);
						System.out.println("Airport Destination: LGA");
						
					}
					else if(Ans == 'N') {
						System.out.print("Your ticket refund: "+fmt1.format(ticket_price));
					}
				}
				
				else if(days <= 10 && days <= 15)
				{
					System.out.println("The Prices of the ticket on "+days+" "
							+ " days are: "+fmt1.format(ticket_price+105));
					System.out.println("Do you want to book this flight?");
					System.out.println("Y for Yes; N for No: ");
					char Ans = scan.next().charAt(0);
					
					if(Ans == 'Y')
					{
						s1.Date();
						s1.FlightNum1();
						s1.Date();
						s1.FlightNum1();System.out.println("The ticket price: "+fmt1.format(ticket_price));
						System.out.println("Days for stay: "+days);
						System.out.println("Airport Destination: LGA");
						
					}
					else if(Ans == 'N') {
						System.out.print("Your ticket refund: "+fmt1.format(ticket_price));
					}
				}
				
				else if(days <= 15 && days <= 20)
				{
					System.out.println("The Prices of the ticket on "+days+" "
							+ " days are: "+fmt1.format(ticket_price+216));
					System.out.println("Do you want to book this flight?");
					System.out.println("Y for Yes; N for No: ");
					char Ans = scan.next().charAt(0);
					
					if(Ans == 'Y')
					{
						s1.Date();
						s1.FlightNum1();
						s1.Date();
						s1.FlightNum1();System.out.println("The ticket price: "+fmt1.format(ticket_price));
						System.out.println("Days for stay: "+days);
						System.out.println("Airport Destination: LGA");
					}
					else if(Ans == 'N') {
						System.out.print("Your ticket refund: "+fmt1.format(ticket_price));
					}
				}
				
				else if(days <= 20 && days <= 30)
				{
					System.out.println("The Prices of the ticket on "+days+" "
							+ " days are: "+fmt1.format(ticket_price+219));
					System.out.println("Do you want to book this flight?");
					System.out.println("Y for Yes; N for No: ");
					char Ans = scan.next().charAt(0);
					
					if(Ans == 'Y')
					{
						s1.Date();
						s1.FlightNum1();
						s1.Date();
						s1.FlightNum1();System.out.println("The ticket price: "+fmt1.format(ticket_price));
						System.out.println("Days for stay: "+days);
						System.out.println("Airport Destination: LGA");						
					}
					else if(Ans == 'N') {
						System.out.print("Your ticket refund: "+fmt1.format(ticket_price));
					}
				}
				
				else if( days <= 62)
				{
					System.out.println("The Prices of the ticket on "+days+" "
							+ " days are: "+fmt1.format(ticket_price+220));
					System.out.println("Do you want to book this flight?");
					System.out.println("Y for Yes; N for No: ");
					char Ans = scan.next().charAt(0);
					
					if(Ans == 'Y')
					{
						s1.Date();
						s1.FlightNum1();
						s1.Date();
						s1.FlightNum1();System.out.println("The ticket price: "+fmt1.format(ticket_price));
						System.out.println("Days for stay: "+days);
						System.out.println("Airport Destination: LGA");
						
					}
					else if(Ans == 'N') {
						System.out.print("Your ticket refund: "+fmt1.format(ticket_price));
					}
				}
				
				else
				{
					System.out.println("Exceeded the amount of days for a "
							+ " road trip; which is 62. Please enter again");
				}
				break;
			}
		
		case 3:
			{
				System.out.println("You've entered: DTW");
				System.out.println("Enter the amount of days to travel "
						+ "\nfor a Roundtrip: ");
				
				int days = scan.nextInt();
				
				if(days != 0 && days <= 5 && days <= 10)
				{
					System.out.println("The Prices of the ticket on "+days+" "
							+ " days are: "+fmt1.format(ticket_price));
					System.out.println("Do you want to book this flight?");
					System.out.println("Y for Yes; N for No: ");
					char Ans = scan.next().charAt(0);
					
					if(Ans == 'Y')
					{
						s1.Date();
						s1.FlightNum1();
						s1.Date();
						s1.FlightNum1();System.out.println("The ticket price: "+fmt1.format(ticket_price));
						System.out.println("Days for stay: "+days);
						System.out.println("Airport Destination: DTW");
						
					}
					else if(Ans == 'N') {
						System.out.print("Your ticket refund: "+fmt1.format(ticket_price));
					}
				}
				
				else if(days <= 10 && days <= 15)
				{
					System.out.println("The Prices of the ticket on "+days+" "
							+ " days are: "+fmt1.format(ticket_price+105));
					System.out.println("Do you want to book this flight?");
					System.out.println("Y for Yes; N for No: ");
					char Ans = scan.next().charAt(0);
					
					if(Ans == 'Y')
					{
						s1.Date();
						s1.FlightNum1();
						s1.FlightNum1();System.out.println("The ticket price: "+fmt1.format(ticket_price));
						System.out.println("Days for stay: "+days);
						System.out.println("Airport Destination: DTW");
						
						
					}
					else if(Ans == 'N') {
						System.out.print("Your ticket refund: "+fmt1.format(ticket_price));
					}
				}
				
				else if(days <= 15 && days <= 20)
				{
					System.out.println("The Prices of the ticket on "+days+" "
							+ " days are: "+fmt1.format(ticket_price+216));
					System.out.println("Do you want to book this flight?");
					System.out.println("Y for Yes; N for No: ");
					char Ans = scan.next().charAt(0);
					
					if(Ans == 'Y')
					{
						s1.Date();
						s1.FlightNum1();
						s1.FlightNum1();System.out.println("The ticket price: "+fmt1.format(ticket_price));
						System.out.println("Days for stay: "+days);
						System.out.println("Airport Destination: DTW");
						
					}
					else if(Ans == 'N') {
						System.out.print("Your ticket refund: "+fmt1.format(ticket_price));
					}
				}
				
				else if(days <= 20 && days <= 30)
				{
					System.out.println("The Prices of the ticket on "+days+" "
							+ " days are: "+fmt1.format(ticket_price+219));
					System.out.println("Do you want to book this flight?");
					System.out.println("Y for Yes; N for No: ");
					char Ans = scan.next().charAt(0);
					
					if(Ans == 'Y')
					{
						s1.Date();
						s1.FlightNum1();
						s1.FlightNum1();System.out.println("The ticket price: "+fmt1.format(ticket_price));
						System.out.println("Days for stay: "+days);
						System.out.println("Airport Destination: DTW");
					}
					else if(Ans == 'N') {
						System.out.print("Your ticket refund: "+fmt1.format(ticket_price));
					}
				}
				
				else if( days <= 62)
				{
					System.out.println("The Prices of the ticket on "+days+" "
							+ " days are: "+fmt1.format(ticket_price+220));
					System.out.println("Do you want to book this flight?");
					System.out.println("Y for Yes; N for No: ");
					char Ans = scan.next().charAt(0);
					
					if(Ans == 'Y')
					{
						s1.Date();
						s1.FlightNum1();
						s1.FlightNum1();System.out.println("The ticket price: "+fmt1.format(ticket_price));
						System.out.println("Days for stay: "+days);
						System.out.println("Airport Destination: DTW");
						
					}
					else if(Ans == 'N') {
						System.out.print("Your ticket refund: "+fmt1.format(ticket_price));
					}
				}
				
				else
				{
					System.out.println("Exceeded the amount of days for a "
							+ "road trip; which is 62. Please enter again");
				}
				break;
			}
			
		case 4:
			{
				System.out.println("You've entered: MSP");
				System.out.println("Enter the amount of days to travel "
						+ "\nfor a Roundtrip: ");
				
				int days = scan.nextInt();
				
				if(days != 0 && days <= 5 && days <= 10)
				{
					System.out.println("The Prices of the ticket on "+days+" "
							+ "days are:"+fmt1.format(ticket_price));
					System.out.println("Do you want to book this flight?");
					System.out.println("Y for Yes; N for No: ");
					char Ans = scan.next().charAt(0);
					
					if(Ans == 'Y')
					{
						s1.Date();
						s1.FlightNum1();
						s1.FlightNum1();System.out.println("The ticket price: "+fmt1.format(ticket_price));
						System.out.println("Days for stay: "+days);
						System.out.println("Airport Destination: MSP");
						
					}
					else if(Ans == 'N') {
						System.out.print("Your ticket refund: "+fmt1.format(ticket_price));
					}
				}
				
				else if(days <= 10 && days <= 15)
				{
					System.out.println("The Prices of the ticket on "+days+" "
							+ "days are: "+fmt1.format(ticket_price+105.02));
					System.out.println("Do you want to book this flight?");
					System.out.println("Y for Yes; N for No: ");
					char Ans = scan.next().charAt(0);
					
					if(Ans == 'Y')
					{
						s1.Date();
						s1.FlightNum1();
						s1.FlightNum1();System.out.println("The ticket price: "+fmt1.format(ticket_price));
						System.out.println("Days for stay: "+days);
						System.out.println("Airport Destination: MSP");
						
						
					}
					else if(Ans == 'N') {
						System.out.print("Your ticket refund: "+fmt1.format(ticket_price));
					}
				}
				
				else if(days <= 15 && days <= 20)
				{
					System.out.println("The Prices of the ticket on "+days+""
							+ "days are:"+fmt1.format(ticket_price+216.02));
					System.out.println("Do you want to book this flight?");
					System.out.println("Y for Yes; N for No: ");
					char Ans = scan.next().charAt(0);
					
					if(Ans == 'Y')
					{
						s1.Date();
						s1.FlightNum1();
						s1.FlightNum1();System.out.println("The ticket price: "+fmt1.format(ticket_price));
						System.out.println("Days for stay: "+days);
						System.out.println("Airport Destination: MSP");
						
					}
					else if(Ans == 'N') {
						System.out.print("Your ticket refund: "+fmt1.format(ticket_price));
					}
				}
				
				else if(days <= 20 && days <= 30)
				{
					System.out.println("The Prices of the ticket on "+days+" "
							+ "days are: "+fmt1.format(ticket_price+219.02));
					System.out.println("Do you want to book this flight?");
					System.out.println("Y for Yes; N for No: ");
					char Ans = scan.next().charAt(0);
					
					if(Ans == 'Y')
					{
						s1.Date();
						s1.FlightNum1();
						s1.FlightNum1();System.out.println("The ticket price: "+fmt1.format(ticket_price));
						System.out.println("Days for stay: "+days);
						System.out.println("Airport Destination: MSP");
						
					}
					else if(Ans == 'N') {
						System.out.print("Your ticket refund: "+fmt1.format(ticket_price));
					}
				}
				
				else if(days <= 62)
				{
					System.out.println("The Prices of the ticket on "+days+" "
							+ "days are: "+fmt1.format(ticket_price+220.02));
					System.out.println("Do you want to book this flight?");
					System.out.println("Y for Yes; N for No: ");
					char Ans = scan.next().charAt(0);
					
					if(Ans == 'Y')
					{
						s1.Date();
						s1.FlightNum1();
						s1.FlightNum1();System.out.println("The ticket price: "+fmt1.format(ticket_price));
						System.out.println("Days for stay: "+days);
						System.out.println("Airport Destination: MSP");
						
					}
					else if(Ans == 'N') {
						System.out.print("Your ticket refund: "+fmt1.format(ticket_price));
					}
				}
				
				else
				{
					System.out.println("Exceeded the amount of days for a "
							+ "road trip; which is 62. Please enter again");
				}
				
				break;
			}
		
			default:
				System.out.println("Invalid input! Please enter one of the four options.");
			break;
		}
		
		
	}

}
