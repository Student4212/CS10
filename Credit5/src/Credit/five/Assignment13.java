/*

	Program: Assignment12.java          Date: April 28th 


	Author: Naomi Lockerbie  
	School: CHHS
	Course: Computer Science 10
	

	*/
package Credit.five;

import java.util.Scanner;

public class Assignment13 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);//creates new scanner 
		System.out.println("Enter the number of copies to be printed: "); 
		int num = input.nextInt(); //Records answer
		float single = 0f;
		if (num>=0 && num<=99)
		{
			single = 0.30f; 
		}
		else if (num>=100 && num<=499)
		{
			single = 0.28f; 
		}
		else if (num>=500 && num<=749)
		{
			single = 0.27f; 
		}
		else if (num>=750 && num<=1000)
		{
			single = 0.26f; 
		}
		else 
		{
			single = 0.25f; 
		}
		
		float total = single*num; 
		System.out.println("Price per copy is: $"+single+"\r\n"
				+ "Total cost is: $"+total);
			
	}

}
/*Screen Dump
Enter the number of copies to be printed: 
750
Price per copy is: $0.26
Total cost is: $195.0
*/