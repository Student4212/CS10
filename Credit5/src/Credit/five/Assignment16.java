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
	{//1
		Scanner input = new Scanner(System.in);//creates new scanner
		int computer = 1 + (int)(Math.random()*20);//generates a random number from 1-20 and assigns it variable computer 
		System.out.println("Choose a number from 1-20: "); //requests you choose a number between 1 and 20 
		int player = input.nextInt(); //Records answer as variable player 
		String message = "0";//creates variable message and assigns it a value of 0 
		if (player==computer)//says that if the value of the variable player is equal to the value of the variable computer, follow the instructions inside the curly bracket 
		{
			message = "You Won!";//assign variable message value "You Won!"
		}
		else  //if none of the previous criteria has been meet, follow the instructions in the curly bracket
		{
			message = "Better luck next time."; //assign variable message value "Better luck next time!"
		}
		System.out.println("Computer’s Number is: "+computer
				+ "\r\n"
				+ "Player’s Number is: "+player
				+ "\r\n"+message);//displays computers value and explanation, then displays players value and explanation, then displays value 
	}

}
/*Screen Dump
Choose a number from 1-20: 
13
Computer’s Number is: 15
Player’s Number is: 13
Better luck next time.
*/