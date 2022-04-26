/*

	Program: EvenOrOdd.java          Date: April 21th 


	Author: Naomi Lockerbie  
	School: CHHS
	Course: Computer Science 10
	

	*/
package Assignments;

import java.util.Scanner;

public class EvenOrOdd 
{
	public static void main(String[] args) 
	{
			Scanner myObj = new Scanner(System.in); //creates new scanner 
		    System.out.println("Enter an integer: ");//displays the request
		    int n1 = myObj.nextInt(); //records response 
		    int rem = n1%2; //calculates the remainder you get if you divide by two 
		    if (rem==1)//compares it to one, if they are equal, proceed, if not, skip next step and go to else
		    {
		    	System.out.println("The integer "+n1+" is odd.");//displays the integer and that it is odd 
		    }
		    else //skips next step if the remainder is equal to 1 
		    {
		    	System.out.println("The integer "+n1+" is even.");//displays integer and that it is even 
		    }
		    

	}

}

/* Screen Dump

Enter Pizza Diameter in Whole Inches
8
It costs $4.95
*/