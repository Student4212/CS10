package Assignments;
import java.util.*;

public class PizzaCost 
{
	/*

	Program: PizzaCost.java          Date: April 6th 


	Author: Naomi Lockerbie  
	School: CHHS
	Course: Computer Science 10
	

	*/
	public static void main(String[] args) 
	{
		Scanner myObj = new Scanner(System.in); 
	    System.out.println("Enter Pizza Diameter in Whole Inches");
	    int size = myObj.nextInt(); 
	    
	    
	   double cost = (size * size * 0.05) + 0.75 + 1.00;
	  
	 
	    System.out.println("It costs $" + cost);  

	}

}
/* Screen Dump

Enter Pizza Diameter in Whole Inches
8
It costs $4.95

 */
