package Assignments;

import java.util.Scanner;

public class Assignment8Part1 
{
	/*

	Program: Assignmnet8Part1.java          Date: April 11th 


	Author: Naomi Lockerbie  
	School: CHHS
	Course: Computer Science 10
	

	*/
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
	       System.out.println("Enter a two digit number");
	       int number1 = input.nextInt();
	       int number2 = number1/10; 
	       int number3 = number1%10; 
	       System.out.println("The first digit is: "+number2+"\r\n"
	       		+ "The second digit is: "+number3);

	}

}
/* Screen Dump

Enter a two digit number
13
The first digit is: 1
The second digit is: 3

 */
