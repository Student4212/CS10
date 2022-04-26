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
		Scanner myObj = new Scanner(System.in); //creates new scanner 
	    System.out.println("How much money do you have in coins written in cents");//displays question 
	    int change = myObj.nextInt();//records answer 
	    System.out.println("The minimum number of coins you could have is you have is: ");//displays sentences 
		int quarters = change / 25;//divides by 25 for the number of quarters 
		System.out.println("Quarters: " + quarters);//displays it 
		int dimes = (change % 25)/10;//remainder from last math is divided by 10 to find dimes
		System.out.println("Dimes: " + dimes);//displays it 
		int nickels = ((change % 25)%10)/5;//remainder from last math is divided by 5 to find nickels
		System.out.println("Nickels: " + nickels);//displays it 
		int pennies = (((change % 25)%10)%5);//remainder from last math is the pennies
		System.out.println("Pennies: " + pennies);//displays it 

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