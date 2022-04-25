/*

	Program: Assignmnet8Part2.java          Date: April 11th 


	Author: Naomi Lockerbie  
	School: CHHS
	Course: Computer Science 10
	

	*/
package Assignments;

import java.util.Scanner;

public class Assignmnet8Part2 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
	       System.out.println("Enter a three digit number");
	       int number1 = input.nextInt();
	       int number2 = number1/100; 
	       int number3 = (number1%100)/10; 
	       int number4 = ((number1%100)%10);
	       System.out.println("The first digit is: "+number2+"\r\n"
	       		+ "The second digit is: "+number3+"\r\n"
	       				+ "The third digit is: "+number4);

	}

}
/* Screen Dump

Enter a three digit number
123
The first digit is: 1
The second digit is: 2
The third digit is: 3
 */
