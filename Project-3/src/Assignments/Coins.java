/*

	Program: Coins.java          Date: April 8th 


	Author: Naomi Lockerbie  
	School: CHHS
	Course: Computer Science 10
	

	*/
package Assignments;
import java.util.Scanner;
public class Coins 
{
	public static void main(String[] args) 
	{
		Scanner myObj = new Scanner(System.in); 
	    System.out.println("How much money do you have in coins written in cents");
	    int change = myObj.nextInt(); 		
	    System.out.println("The minimum change change you have is " + change);
		int quarters = change / 25;
		System.out.println("Quarters: " + quarters);
		int dimes = (change % 25)/10;
		System.out.println("Dimes: " + dimes);
		int nickels = ((change % 25)%10)/5;
		System.out.println("Nickels: " + nickels);
		int pennies = (((change % 25)%10)%5);
		System.out.println("Pennies: " + pennies);

	}

}

/* Screen Dump

How much money do you have in coins written in cents
213
The minimum change change you have is 213
Quarters: 8
Dimes: 1
Nickels: 0
Pennies: 3

 */