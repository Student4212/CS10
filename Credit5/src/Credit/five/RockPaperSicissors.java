/*

	Program: RockPaperSicissors.java          Date: May 13th 


	Author: Naomi Lockerbie  
	School: CHHS
	Course: Computer Science 10

*/
package Credit.five;

import java.util.Scanner;

public class RockPaperSicissors 
{

	public static void main(String[] args) 
	{
		String one = "play";
		while (one.equalsIgnoreCase("play")) 
		{
		Scanner input = new Scanner(System.in);//creates new scanner
		int comp = 1 + (int)(Math.random()*3);//genterates a random number from 1-3 and stores that number as variable comp
		System.out.println("\r\nEnter rock paper or scissors: "); //asks you to enter rock paper or scissors
		String player = input.nextLine(); //records your answer as variable player
		String message = "Error";//creates variable message and gives it a value of Error
		if (player.equalsIgnoreCase("rock") && comp==1)//says if the value of player is equal to rock (capitalization doesn't matter) and the value of comp is 1, follow the instructions inside the bracket
		{
			message = "Computer: rock \r\nIt's a Tie";//gives variable message a new value of what is in the quotes
		}
		else if (player.equalsIgnoreCase("paper") && comp==2)//says if the numbers haven't fit any of the previous criteria AND the value of player is equal to paper (capitalization doesn't matter) and the value of comp is 2, follow the instructions inside the bracket
		{
			message = "Computer: paper \r\nIt's a Tie";//gives variable message a new value of what is in the quotes
		}
		else if (player.equalsIgnoreCase("scissors") && comp==3)//says if the numbers haven't fit any of the previous criteria AND the value of player is equal to scissors (capitalization doesn't matter) and the value of comp is 3, follow the instructions inside the bracket
		{
			message = "Computer: scissors \r\nIt's a Tie";//gives variable message a new value of what is in the quotes
		}
		else if (player.equalsIgnoreCase("rock") && comp==2)//says if the numbers haven't fit any of the previous criteria AND the value of player is equal to rock (capitalization doesn't matter) and the value of comp is 2, follow the instructions inside the bracket
		{
			message = "Computer: paper \r\nYou lose!";//gives variable message a new value of what is in the quotes
		}
		else if (player.equalsIgnoreCase("paper") && comp==3)//says if the numbers haven't fit any of the previous criteria AND the value of player is equal to paper (capitalization doesn't matter) and the value of comp is 3, follow the instructions inside the bracket
		{
			message = "Computer: scissors \r\nYou lose!";//gives variable message a new value of what is in the quotes
		}
		else if (player.equalsIgnoreCase("scissors") && comp==1)//says if the numbers haven't fit any of the previous criteria AND the value of player is equal to scissors (capitalization doesn't matter) and the value of comp is 1, follow the instructions inside the bracket 
		{
			message = "Computer: rock \r\nYou lose!";//gives variable message a new value of what is in the quotes
		}
		else if (player.equalsIgnoreCase("rock") && comp==3)//says if the numbers haven't fit any of the previous criteria AND the value of player is equal to rock (capitalization doesn't matter) and the value of comp is 3, follow the instructions inside the bracket
		{
			message = "Computer: scissors \r\nYou win!";//gives variable message a new value of what is in the quotes
		}
		else if (player.equalsIgnoreCase("paper") && comp==1)//says if the numbers haven't fit any of the previous criteria AND the value of player is equal to paper (capitalization doesn't matter) and the value of comp is 1, follow the instructions inside the bracket 
		{
			message = "Computer: rock \r\nYou win!";//gives variable message a new value of what is in the quotes
		}
		else if (player.equalsIgnoreCase("scissors") && comp==2)//says if the numbers haven't fit any of the previous criteria AND the value of player is equal to scissors (capitalization doesn't matter) and the value of comp is 2, follow the instructions inside the bracket
		{
			message = "Computer: paper \r\nYou win!";//gives variable message a new value of what is in the quotes
		}
		System.out.println("You: "+player+"\r\n"+message+"\r\n\r\n"
			+ "Enter play to continue playing or anything else to exit the program.");//displays prompt
		one = input.nextLine();//stores responce to prompt as one 
		}//end of loop, start again at top and check the criteria 
		System.out.println("\r\nYou have exited the program. Have a good day and come back soon!");//displays text 
	}
}
/*Screen Dump

Enter rock paper or scissors: 
paper
You: paper
Computer: scissors 
You lose!

Enter play to continue playing or anything else to exit the program.
play

Enter rock paper or scissors: 
rock
You: rock
Computer: rock 
It's a Tie

Enter play to continue playing or anything else to exit the program.
play

Enter rock paper or scissors: 
scissors
You: scissors
Computer: rock 
You lose!

Enter play to continue playing or anything else to exit the program.
play

Enter rock paper or scissors: 
s
You: s
Error

Enter play to continue playing or anything else to exit the program.
a

You have exited the program. Have a good day and come back soon!
*/
