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
		int firstRN = 1 + (int)(Math.random()*10);//generates a random number from 1-10 and stores as variable secondRN 
		int secondRN = 1 + (int)(Math.random()*10);//generates a random number from 1-10 and stores as variable secondRN 
		System.out.println("What is "+firstRN+"*"+secondRN+"?"); // asks you what the first number times the second number is 
		int answer = input.nextInt(); //Records answer as variable answer 
		int product = firstRN*secondRN; //calculates the first number times the second number and stores as variable product 
		if (answer==product) //checks if your answer equals the product, if yes follow the instructions in the curly bracket 
		{
			System.out.println("You got it right! Congratulations!!"); //displays the text in quotes  
		}
		else //if the following conditions were not true, follow the instructions in the curly bracket
		{
			System.out.println("You got it wrong. The correct answer was "+product); //displays the text in quotes followed by the product of the two numbers 
		}
		
	}

}
/*Screen Dump
What is 9*10?
90
You got it right! Congratulations!!
*/