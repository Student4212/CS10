/*

	Program: Assignment15.java          Date: May 4th 


	Author: Naomi Lockerbie  
	School: CHHS
	Course: Computer Science 10
	

	*/
package Credit.five;

import java.util.Scanner;

public class Assignment15 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);//creates new scanner
		int firstRN = 1 + (int)(Math.random()*10);
		int secondRN = 1 + (int)(Math.random()*10);
		System.out.println("What is "+firstRN+"*"+secondRN+"?"); 
		int answer = input.nextInt(); //Records answer as variable answer 
		int product = firstRN*secondRN; 
		if (answer==product) 
		{
			System.out.println("You got it right! Congratulations!!"); 
		}
		else 
		{
			System.out.println("You got it wrong. The correct answer was "+product); 
		}
		
	}

}
