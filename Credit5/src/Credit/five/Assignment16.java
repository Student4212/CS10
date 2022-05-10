/*

	Program: Assignment16.java          Date: May 10th 


	Author: Naomi Lockerbie  
	School: CHHS
	Course: Computer Science 10
	

	*/
package Credit.five;

import java.util.Scanner;

public class Assignment16 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);//creates new scanner
		int computer = 1 + (int)(Math.random()*20);
		System.out.println("Choose a number from 1-20: "); 
		int player = input.nextInt(); //Records answer as variable player
		String message = "0";
		if (player==computer)
		{
			message = "You Won!";
		}
		else 
		{
			message = "Better luck next time."; 
		}
		System.out.println("Computer’s Number is: "+computer
				+ "\r\n"
				+ "Player’s Number is: "+player
				+ "\r\n"+message);
	}

}
/*Screen Dump
Choose a number from 1-20: 
13
Computer’s Number is: 15
Player’s Number is: 13
Better luck next time.
*/