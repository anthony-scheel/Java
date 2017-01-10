/*
* File:  SortArray.java
* Author: Anthony Scheel
* Date: July 14, 2016
* Purpose: This program takes user input and puts it into an array
* then the array will sort the numbers from least to greatest or reverse order
*/

// Import each required Java class
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

/**
* Week 5: Array Discussion
 */
 
 public class SortArray 
 {	 
	 public static void main(String[] args) 
	 {
		Scanner userInput = new Scanner(System.in); // Gets the input from the user.		
		
		System.out.println("How many numbers would you like to sort?"); // Ask how many numbers the user wants to enter
		
		int numbers = userInput.nextInt(); // Gets the input from the user		 
		
        int userArray[] = new int[numbers]; // Creates the array with the amount of numbers the user wants to enter
		
        System.out.println("Enter the " + numbers + " numbers now."); // Ask the user to enter the amount of numbers they wanted for the array
		
		// For loop that will take the user's input and put it into the array
		for (int i = 0 ; i < userArray.length; i++ ) 
		{
           userArray[i] = userInput.nextInt();
        }
		
		System.out.println("How would you like to sort the array? Enter 1 for least to greatest or 2 for greatest to least");
		System.out.println("Enter 1 for least to greatest");
		System.out.println("Or 2 for greatest to least");
		
		int sortStyle = userInput.nextInt(); // gets the user input for how they want to sort the array
		  
		if (sortStyle == 1) // Sort the array using the sort method this will sort the numbers from least to greatest
		{
			Arrays.sort(userArray); 
			
			System.out.println("~~~~~~~~~~~~~~~Sorted Array in Descending Order~~~~~~~~~~~~~~~");
			// Print the sorted array
			for (int i = 0; i < userArray.length; i++) 
			{
				System.out.println(userArray[i]);         
			}
			System.out.println("~~~~~~~~~~~~~~~Your array is " + userArray.length + " numbers long~~~~~~~~~~~~~~~");
		}
		else if (sortStyle == 2) // Sort the array using the reverseorder method this will sort the numbers from greatest to least
		{
			Arrays.sort(userArray);
			
			System.out.println("~~~~~~~~~~~~~~~Sorted Array in Ascending Order~~~~~~~~~~~~~~~"); // Tell the user the length of their array
			
			for(int i = userArray.length -1; i >= 0; i--)
			{
					System.out.println(userArray[i]);					
			}
			System.out.println("~~~~~~~~~~~~~~~Your array is " + userArray.length + " numbers long~~~~~~~~~~~~~~~"); // Tell the user the length of their array
		}
		else // Tell the user to enter only 1 or 2
		{
			System.out.println("Please only enter either 1 or 2");
		}		 
    }
 }