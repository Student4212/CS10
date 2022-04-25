/*

	Program: Assignmnet8Part1.java          Date: April 11th 


	Author: Naomi Lockerbie  
	School: CHHS
	Course: Computer Science 10
	

	*/
package Assignments;

import java.util.Scanner;

public class Assignment8Part1 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
	       System.out.println("Enter a two digit number");//asks you for the number
	       int number1 = input.nextInt();//records the number
	       int number2 = number1/10; //finds first digit
	       int number3 = number1%10; //finds second digit 
	       System.out.println("The first digit is: "+number2+"\r\n"
	       		+ "The second digit is: "+number3);//displays the digits 

	}

}
/* Screen Dump

Enter a two digit number
13
The first digit is: 1
The second digit is: 3

 */
