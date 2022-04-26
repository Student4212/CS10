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
		Scanner input = new Scanner(System.in);//creates new scanner 
	       System.out.println("Enter a three digit number");//displays request 
	       int number1 = input.nextInt();//stores number 
	       int number2 = number1/100; //finds first digit by dividing by 100, stores digit 
	       int number3 = (number1%100)/10; //finds second digit by finding remainder and dividing by 10, stores digit 
	       int number4 = ((number1%100)%10);//fonds third digit by finding remainder, stores digit 
	       System.out.println("The first digit is: "+number2+"\r\n"
	       		+ "The second digit is: "+number3+"\r\n"
	       				+ "The third digit is: "+number4);//displays digits 

	}

}
/* Screen Dump

Enter a three digit number
123
The first digit is: 1
The second digit is: 2
The third digit is: 3
 */
