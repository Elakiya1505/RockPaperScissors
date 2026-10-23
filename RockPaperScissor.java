package day4;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {

	public static void main(String[] args) 
	{
		System.out.println("Welcome to the Rock Paper Scissors game!");
		
		// User input
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your choice");
		System.out.println("0: Rock, 1: Paper, 2: Scissors");
		int userChoice = scanner.nextInt();
		System.out.println(userChoice);
		
		// Validate input = User's choice
		
		if(userChoice < 0 || userChoice > 2)
		{
			System.out.println("Invalid choice: Please run the game again and enter 0,1,2...");
			return;//exit program
		}
		
		//Generate Computer's random choice between 0 and 2
		
		int computerChoice = new Random().nextInt(3); // It can generate random numbers between 0-2
		System.out.println(computerChoice);
		
		//Determine Winner
		
		//Tie
		
		if(userChoice == computerChoice)
			System.out.println("Its a tie!");
		
		//User to Win
		
		else if((userChoice == 0 && computerChoice == 2) || 
				(userChoice == 1 && computerChoice == 0) || 
				(userChoice == 2 && computerChoice == 1))
		{
			System.out.println("You Win! - **Congratulations**");
		}
		
		else
		{
			System.out.println("Computer Wins!");
		}	
		scanner.close();
		
	}

}
