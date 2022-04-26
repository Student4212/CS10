/*

	Program: PizzaCost.java          Date: April 6th 


	Author: Naomi Lockerbie  
	School: CHHS
	Course: Computer Science 10
	

	*/
package Assignments;
import java.util.*;

public class PizzaCost 
{
public static void main(String[] args) 
	{
	    Scanner myObj = new Scanner(System.in);  //creates new scanner 
	    System.out.println("Enter the Diameter of the Pizza in Whole Inches");//displays request 
	    int size = myObj.nextInt();//stores responce 
	    double cost = (size * size * 0.05) + 0.75 + 1.00;//does the math to find cost
	    System.out.println("It costs $ " + cost); //prints the cost 
	}

}
/* Screen Dump

Enter Pizza Diameter in Whole Inches
8
It costs $4.95

 */
