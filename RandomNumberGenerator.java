/*
 * Filename: RandomNumberGenerator.java
 * Author: Anthony Scheel
 * Date: July 31,2016
 * Purpose: Generates X amount of random numbers that are Y big
 */

import java.util.*;
import java.util.Scanner;
import java.util.InputMismatchException;

public class RandomNumberGenerator {

 public static void main(String[] args) {
		
	// Scanner used for user input
		Scanner scan = new Scanner(System.in);
		
	// Ask user how many random numbers they want to create
	 try {
	   System.out.print("How many random numbers would you like to create?: ");
	   int x = scan.nextInt();
		
		// The input must be greater than zero
        if (x <= 0) { 
		System.out.println("The number must be greater than zero, please try again.");
		}

		else {
		// Get the max value for the random numbers
		System.out.print("Please enter the maximum value that you want the random numbers to be: ");
		int y = scan.nextInt();
		
		// The input must be greater than zero
		if (y <= 0){
		System.out.println("The number must be greater than zero, please try again.");
		}	
		
		else { 
			// Random number generator
			Random rand = new Random();
			
			// Display the random numbers
			System.out.println("Your randomly generated numbers are: " );

				
			// Loop that gets the random values
			for (int i = 1; i < x + 1 ; i++){
			int randInt = rand.nextInt(y);
			System.out.println("Random Value " + i + ": " + randInt);
			}
			}
		}
		}
		
	// Catches the input if it is not an integer
	catch (InputMismatchException exception)
	{
          System.out.println("Please enter an integer and try again.");
	} 
   }
}