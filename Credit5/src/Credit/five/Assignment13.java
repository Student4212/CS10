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
		System.out.println("Enter the number of copies to be printed: "); //displays request that you enter the number of copies you need to print 
		int num = input.nextInt(); //Records answer as variable num
		float single = 0f;//creates variable (float) single and gives it a value of 0 
		if (num>=0 && num<=99)//says if number of copies/num is greater than or equal to 0 and less than or equal to 99, follow the instructions inside the bracket 
		{
			single = 0.30f; //stores 0.30 as the value of single 
		}
		else if (num>=100 && num<=499)//if the number of copies/num does not fit the previous conditions and it is greater than or equal to 100 and less than or equal to 499, follow the instructions inside the bracket 
		{
			single = 0.28f; //stores 0.28 as the value of single 
		}
		else if (num>=500 && num<=749)//if the number of copies/num does not fit the previous conditions and it is greater than or equal to 500 and less than or equal to 749, follow the instructions inside the bracket 
		{
			single = 0.27f; //stores 0.27 as the value of single 
		}
		else if (num>=750 && num<=1000)//if the number of copies/num does not fit the previous conditions and it is greater than or equal to 750 and less than or equal to 1000, follow the instructions inside the bracket 
		{
			single = 0.26f; //stores 0.26 as the value of single 
		}
		else //if the number of copies/num does not fit the previous conditions, follow the instructions inside the bracket 
		{
			single = 0.25f; //stores 0.25 as the value of single 
		}
		
		float total = single*num; //multiply number of copies/num by the value of single (the price of a single copy printed )
		System.out.println("Price per copy is: $"+single+"\r\n"
				+ "Total cost is: $"+total);//display prices and totals
			
	}

}
/*Screen Dump
Enter the number of copies to be printed: 
750
Price per copy is: $0.26
Total cost is: $195.0
*/