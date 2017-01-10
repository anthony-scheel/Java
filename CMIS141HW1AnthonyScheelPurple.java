/*
* File:  CMIS141HW1AnthonyScheelPurple.java
* Author: Anthony Scheel
* Date: June 23, 2016
* Purpose: This program demonstrates Java user-input and output capabilities
*/

// Import each required Java class
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
* Homework 1
 */
 
public class CMIS141HW1AnthonyScheelPurple
{
	public static void main(String[] args) 
	{
 
		//Use Unicode characters to display degree
         final String degree = "\u00b0";
 
		//User will enter the year their year of birth
        System.out.print("Enter your birth year (1900-2014): ");
        int birthYear = getInt();
		// Verifies correct input of years
		if ((birthYear < 1900) ||
			(birthYear > 2014))
		{
			System.out.println(birthYear + " is not a value between 1900 and 2014");
			// Exit the application for invalid Years
			System.exit(0);
		}
 
		//User will enter their month of birth
        System.out.print("Enter your birth month (1-12): ");
        int birthMonth = getInt();
		// Verifies correct input of months
		if ((birthMonth > 12) ||
			(birthMonth < 1))
		{
			System.out.println(birthMonth + " is not a value between 1 and 12");
			// Exit the application for invalid Months
			System.exit(0);
		}
 
		//User will enter their day of birth
        System.out.print("Enter the day of the month of your birth (1-31): ");
        int birthDay = getInt();
		int numDays = 0;
		
		//Give birthMonths string value of their name
		String strMonth = "";
        if(birthMonth == 1) 
		{
            strMonth = "January";
		}
		else if(birthMonth == 2) 
		{
          strMonth = "February";
		}
		else if(birthMonth == 3) 
		{
          strMonth = "March";
		}
		else if(birthMonth == 4) 
		{
          strMonth = "April";
		}
		else if(birthMonth == 5) 
		{
          strMonth = "May";
		}
		else if(birthMonth == 6) 
		{
          strMonth = "June";
		}
		else if(birthMonth == 7) 
		{
          strMonth = "July";
		}
		else if(birthMonth == 8)  
		{
          strMonth = "August";
		}
		else if(birthMonth == 9) 
		{
          strMonth = "September";
		}
		else if(birthMonth == 10) 
		{	
          strMonth = "October";
		}
		else if(birthMonth == 11) 
		{
          strMonth = "November";
		}
		else if(birthMonth == 12) 
		{
          strMonth = "December";
		}
		
		// Verify number of days per month
		if ((birthMonth == 1)  ||
            (birthMonth == 3)  ||
            (birthMonth == 5)  ||
            (birthMonth == 7)  ||
            (birthMonth == 8)  ||
            (birthMonth == 10) ||
            (birthMonth == 12)) 
		{
			numDays = 31;	
		}
		else if (birthMonth == 2) 
		{
			numDays = 28;
		}
		else if ((birthMonth == 4) ||
                 (birthMonth == 6) ||
                 (birthMonth == 9) ||
                 (birthMonth == 11)) 
		{
			numDays = 30;
		}
		
		// Verify correct input of number of days per month
		if ((birthDay > numDays) ||
			(birthDay == 0))
		{
			System.out.println("There are not that many days in " +strMonth);
			// Exit the application for invalid Days
			System.exit(0);
		}
 
		//User will enter their latitude of their home address
        System.out.print("Enter the latitude of your home address: ");
        Double latitude = getDouble();
		if ((latitude < -90.0) ||
			(latitude > 90.0))
		{
			System.out.println("That is an invalid latitude");
			// Exit the application for invalid Latitude
			System.exit(0);
		}
 
		//User will enter their longitude of their home address
        System.out.print("Enter the longitude of your home address: ");
        Double longitude = getDouble();
		if ((longitude < -180.0) ||
			(longitude > 180.0))
		{
			System.out.println("That is an invalid longitude");
			// Exit the application for invalid Longitude
			System.exit(0);
		}
 
		//User will enter their current GPA
        System.out.print("Enter your current GPA (0.0-4.0): ");
        Double gpa = getDouble();
		// Verify correct input of GPA
		if ((gpa > 4.0) || 
			(gpa < 0.0))
		{
			System.out.println(gpa + " is not a value between 0.0 and 4.0");
			// Exit the application for invalid GPA
			System.exit(0);
		}
 		
		
			
		//A prompt will appear telling them thank you for completing the survey
        System.out.println("******* Thank you for completing our survey ************************* ");
		System.out.println("You have entered the following data: Birthday: "+strMonth+" "+birthDay+", "+birthYear);
		System.out.println("Address: Latitude "+latitude+degree+", Longitude "+longitude+degree+" Current GPA: "+gpa);
	}
	
	// Method to get Strings
    public static String getString() 
	{
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
	
	// Method to get Integers
    public static int getInt() 
	{
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
	
	// Method to get Doubles
	public static double getDouble()
	{
		Scanner input = new Scanner(System.in);
		return input.nextDouble();
	}
}