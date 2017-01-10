/*
* File:  CMIS141HW2AnthonyScheelGreen.java
* Author: Anthony Scheel
* Date: July 7, 2016
* Purpose: This program will pick 3 random lottery numbers
*/

// Import each required Java class
import java.io.IOException;
import java.util.Scanner;
import java.util.Random;

/**
* Homework 2
 */
 
 class Lottery
 {
	 private int lotteryNumbers[]; // Lottery Numbers arrary
	  //int gamesCount = 0;
	 
	 Scanner input = new Scanner(System.in); // Creates scanner to get input from user
	 
    public Lottery() 
	{
		System.out.print("Do you wish to make a lottery game selections? \nPlease enter (y) for yes or (n) for no: ");
			
		String playYorN = input.next(); // String for if the user selects yes or no to playing the game
				
		
								
			if(playYorN.equalsIgnoreCase("y")) 
			{				
				System.out.print("Which lottery game do you want to play (Enter 3 for pick-3, 4 for pick-4 or 5 for pick-5?) or if you want to exit enter (0): ");
						
				int numbersNeeded = input.nextInt(); // User selects which game to play
				
				// Holds how many games the user wants to play
				if (numbersNeeded == 3) 
				{
					lotteryNumbers = new int[3];
				}
				else if (numbersNeeded == 4)
				{
					lotteryNumbers = new int[4];
				}
				else if (numbersNeeded== 5)
				{
					lotteryNumbers = new int[5];
				}
				else if (numbersNeeded < 3 || numbersNeeded > 5)
				{
					System.out.print("Error! You must choose 3, 4 or 5: ");
				}
				else if(numbersNeeded == 0)
				{
					System.out.print("Thank you for playing!");
					System.exit(0);
				}
				
				
				//System.out.print("How many games would you like to play? ");
			    //gamesCount  = input.nextInt();	// How many times the user wants to play the game			
												
				Random rand = new Random(System.currentTimeMillis()); // Creates random numbers		
		
				for (int i = 0; i < lotteryNumbers.length; i++) 
				{
					lotteryNumbers[i] = rand.nextInt(10); // Array that will hold 5 random numbers ranging 0-9
				}
			}
			else if(playYorN.equalsIgnoreCase("n")) 
			{
					
				System.out.print("Try again anytime!");				
					
				//gamesCount = 0;
				
				System.exit(0);
			}
    }
	
	//public int getGamesCount()
	//{
	//	return gamesCount;
	//}
	
	public int compareNumbers(int[] usersNumbers) 
	{ 
		int match = 0; // Records the number of matching numbers
	
		if (usersNumbers.length == lotteryNumbers.length) 
		{	
			for (int i = 0; i < lotteryNumbers.length; i++)  // Gets the numbers the user entered
			{	
				for(int j = 0; j < lotteryNumbers.length; j++)  // Gets the random numbers for the lotter
				{
					if (usersNumbers[i] == lotteryNumbers[j]) 
					{
						match++;
	
						break;
					} 
				}  
			}  
		}	
		return match;
	}

	
    //  returns the lotteryNumbers array
    public int[] getLotteryNumbers() 
	{    
        return lotteryNumbers;   
    }
 }
 
 

public class CMIS141HW2AnthonyScheelGreen 
{		
    public static void main(String[] args) 
	{
		//do{
		Lottery lottery = new Lottery();
		
		int lotteryNumbersCount = lottery.getLotteryNumbers().length;
				
		//int gamesPlayed = 0;
		//int gamesToPlay = lottery.getGamesCount(); // Number of games played
		
		System.out.println("Lottery\n");
		
		System.out.println("There are " + lotteryNumbersCount
		
				+ " numbers in range of 0 through 9. "
		
				+ "Try to guess them!\n");
				
		
		// Asks the user to enter how ever many numbers they chose		
		Scanner userInput = new Scanner(System.in);
		
		int numbers[] = new int[lotteryNumbersCount];
				
		
		for (int i = 0; i < numbers.length; i++) 
		{		
			System.out.print(String.format("Enter Number %d: ", i + 1));		
			numbers[i] = userInput.nextInt();		
		}							
				
		int match = lottery.compareNumbers(numbers); // Shows the number of matching numbers
		//gamesPlayed++;
						
		if (match == lotteryNumbersCount) 
		{						
			// If the all user input equals the random numbers show this message
			System.out.println("\nCONGRATULATIONS! YOU HAVE WON!");						
		} 
		else 
		{	
			// If the user does not guess all correctly, show them how many they did get correct
			System.out.println("\nSorry! You only guessed " + match + " number(s) correctly.");		
		}
		//} while (gamesPlayed < gamesToPlay);		
	}
}