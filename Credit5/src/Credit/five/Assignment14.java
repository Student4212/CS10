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
		if (age>18)//checks if the entered age is greater than 18, if yes follow the instructions in the curly bracket
		{
			System.out.println("adult");//displays adult 
		}
		else if (age <= 5)//if none of the previous criteria has been meet, it checks if the entered age is less than or equal to five, if yes follow the instructions in the curly bracket
		{
			System.out.println("Toddler");//displays Toddler 
		}
		else if (age <= 10)//if none of the previous criteria has been meet, it checks if the entered age is less than or equal to ten, if yes follow the instructions in the curly bracket
		{
			System.out.println("child");//displays child
		}
		else if (age <= 12) //if none of the previous criteria has been meet, it checks if the entered age is less than or equal to 12, if yes follow the instructions in the curly bracket
		{
			System.out.println("preteen");//displays preteen 
		}
		else  //if none of the previous criteria has been meet, follow the instructions in the curly bracket
		{
			System.out.println("teen");//displays teen
		}
	}

}
/*Screen Dump
Enter the number of copies to be printed: 
13
teen
*/