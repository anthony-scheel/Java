/*
* File:  CMIS141HW1AnthonyScheelPurple.java
* Author: Anthony Scheel
* Date: July 3, 2016
* Purpose: This program will draw a rocket using for loops.
*/

public class DrawRocket {
	
	// Determines size of the rocket
	// The higher the number the bigger the rocket 
	// The lower the number the smaller the rocket 
	public static final int SIZE = 4;
	
	public static void main(String[] args) 
	{
		// 
		//drawCone(); // Nose
		//drawDivider(); // Divider
		//drawTopHalf(); // Top half of body
		//drawBottomHalf(); // Bottom half of body
		//drawDivider(); // Divider
		//drawBottomHalf(); // Bottom half of body
		//drawTopHalf(); // Top half of body
		//drawDivider(); // Divider
		//drawTopHalf(); // Top half of body
		//drawBottomHalf(); // Bottom half of body
		//drawDivider(); // Divider
		//drawCone(); // Thruster
		
		int x = 9;
		int y = 8;
		int z = 7;    
		
		if (x > 9) {
		if (y > 8){
			System.out.println("x > 9 and y > 8");
		}
		else if (z >= 7){
			System.out.println("x <= 9 and z >= 7");
		}
		else {
			System.out.println("x <= 9 and z < 7");
		}
		}
	}
	
	// Draw the cone of the Rocket. This will also be used for the thruster)
	public static void drawCone() 
	{
		for (int line = 1; line <= (SIZE * 2 - 1); line++) 
		{
			System.out.print(" ");
			
			// Create white space to create the layout of the rocket nose
			for (int spaces = 1; spaces <= (SIZE * 2 - 1) - line; spaces++)
			{
				System.out.print(" ");
			}
			
			// Create the slashes to form the left side of the nose of the rocket
			for (int slashes = 1; slashes <= line; slashes++) 
			{
				System.out.print("/");
			}
			System.out.print("::"); // Center of the nose of the rocket
			
			// Create the slashes to form the right side of the nose of the rocket
			for (int slashes = 1; slashes <= line; slashes++) 
			{
				System.out.print("\\");
			}
			System.out.println(" ");
		}
	}
	
	// Draw the divider that segments the rocket
	public static void drawDivider() 
	{
		// Outter left side of the divider
		System.out.print("#");
		
		// Inside of the divider
		for (int i = 1; i <= SIZE * 2; i++) 
		{
			System.out.print("^^");
		}
		
		// Outter right side of the divider
		System.out.println("#");
	}
	
	// Draw the top half of the body of the rocket
	public static void drawTopHalf() 
	{
		for (int line = 1; line <= SIZE; line++) 
		{
			System.out.print("|"); // Outter left side of the rocket body
			for (int repeat = 1; repeat <= 2; repeat++) 
			{
				// Creates the dots that will help to compose the body of the rocket
				for (int dots = 1; dots <= SIZE - line; dots++) 
				{
					System.out.print(".");
				}
				
				// Creates the X that will help to compose the body of the rocket
				for (int points = 1; points <= line; points++) 
				{
					System.out.print("XX");
				}
				
				// Creates the rest of the dots that will help to compose the body of the rocket
				for (int dots = 1; dots <= SIZE - line; dots++) 
				{
					System.out.print(".");
				}
			}
			System.out.println("|"); // Outter right side of the rocket body
		}
	}
	
	// Draw the bottom half of the body of the rocket
	public static void drawBottomHalf() 
	{
		for (int line = SIZE; line >= 1; line--) 
		{
			System.out.print("|"); // Outter left side of the rocket body
			for (int repeat = 1; repeat <= 2; repeat++) 
			{
				// Creates the dots that will help to compose the body of the rocket
				for (int dots = 1; dots <= SIZE - line; dots++) 
				{
					System.out.print(".");
				}
				
				// Creates the X that will help to compose the body of the rocket
				for (int points = 1; points <= line; points++) 
				{
					System.out.print("XX");
				}
				
				// Creates the rest of the dots that will help to compose the body of the rocket
				for (int dots = 1; dots <= SIZE - line; dots++) 
				{
					System.out.print(".");
				}
			}
			System.out.println("|"); // Outter right side of the rocket body
		}
	}
}