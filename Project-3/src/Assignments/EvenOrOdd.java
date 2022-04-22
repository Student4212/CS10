package Assignments;

import java.util.Scanner;

public class EvenOrOdd 
{
	/*

	Program: EvenOrOdd.java          Date: April 21th 


	Author: Naomi Lockerbie  
	School: CHHS
	Course: Computer Science 10
	

	*/
	public static void main(String[] args) 
	{
			Scanner myObj = new Scanner(System.in); 
		    System.out.println("Enter an integer: ");
		    int n1 = myObj.nextInt(); 
		    int rem = n1%2; 
		    if (rem==1)
		    {
		    	System.out.println("The integer "+n1+" is odd.");
		    }
		    else 
		    {
		    	System.out.println("The integer "+n1+" is even.");
		    }
		    

	}

}

/* Screen Dump

Enter Pizza Diameter in Whole Inches
8
It costs $4.95
*/