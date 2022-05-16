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
		int comp = 1 + (int)(Math.random()*3);
		System.out.println("\r\nEnter rock paper or scissors: "); 
		String player = input.nextLine(); 
		String message = "Error, try entering again";		
		if (player.equalsIgnoreCase("rock") && comp==1)
		{
			message = "Computer: rock \r\nIt's a Tie";
		}
		else if (player.equalsIgnoreCase("paper") && comp==2)
		{
			message = "Computer: paper \r\nIt's a Tie";
		}
		else if (player.equalsIgnoreCase("scissors") && comp==3)
		{
			message = "Computer: scissors \r\nIt's a Tie";
		}
		else if (player.equalsIgnoreCase("rock") && comp==2)
		{
			message = "Computer: paper \r\nYou lose!";
		}
		else if (player.equalsIgnoreCase("paper") && comp==3)
		{
			message = "Computer: scissors \r\nYou lose!";
		}
		else if (player.equalsIgnoreCase("scissors") && comp==1)
		{
			message = "Computer: rock \r\nYou lose!";
		}
		else if (player.equalsIgnoreCase("rock") && comp==3)
		{
			message = "Computer: scissors \r\nYou win!";
		}
		else if (player.equalsIgnoreCase("paper") && comp==1)
		{
			message = "Computer: rock \r\nYou win!";
		}
		else if (player.equalsIgnoreCase("scissors") && comp==2)
		{
			message = "Computer: paper \r\nYou win!";
			
		}
		System.out.println("You: "+player+"\r\n"+message+"\r\n\r\n"
			+ "Enter play to continue playing or anything else to exit the program.");
		one = input.nextLine();
		}
		System.out.println("\r\nYou have exited the program. Have a good day and come back soon!");
	}
}
/*Screen Dump
Choose rock paper or scissors: 
rock
You: rock Computer: scissors 
You win!

OR 

Enter rock paper or scissors: 
Paper
You: Paper
Computer: paper 
It's a Tie
*/