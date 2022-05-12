/*

	Program: Assignment14.java          Date: May 3rd 


	Author: Naomi Lockerbie  
	School: CHHS
	Course: Computer Science 10
	

	*/
package Credit.five;

import java.util.Scanner;

public class Assignment14 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);//creates new scanner 
		System.out.println("Enter your age: "); //displays request that you enter your age
		int age = input.nextInt(); //Records answer as variable age
		if (age>18)
		{
			System.out.println("adult");
		}
		else if (age <= 5)
		{
			System.out.println("Toddler");
		}
		else if (age <= 10)
		{
			System.out.println("child");
		}
		else if (age <= 12) 
		{
			System.out.println("preteen");
		}
		else  
		{
			System.out.println("teen");
		}
	}

}
/*Screen Dump
Enter the number of copies to be printed: 
13
teen
*/