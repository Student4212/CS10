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
		Scanner input = new Scanner(System.in);//creates new scanner
		int comp = 1 + (int)(Math.random()*3);
		System.out.println("Enter rock paper or scissors: "); 
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
		System.out.println("You: "+player+"\r\n"+message);
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