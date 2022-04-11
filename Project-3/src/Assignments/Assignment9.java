package Assignments;

import java.util.Scanner;

public class Assignment9 
{
	/*

	Program: Assignmnet9.java          Date: April 11th 


	Author: Naomi Lockerbie  
	School: CHHS
	Course: Computer Science 10
	

	*/
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
	       System.out.println("Enter an integer");
	       int x = input.nextInt();
	       System.out.println("Enter a second integer");
	       int y = input.nextInt();
	       int div = x/y;
	       int rem = x%y;
	       int div2 = y/x; 
	       int rem2 = y%x;
	       System.out.print(x+" / "+y+" = "+div+"\r\n"
	    		   +x+" % "+y+" = "+rem+"\r\n"
	    		   +y+" / "+x+" = "+div2+"\r\n"
	    		   +y+" % "+x+" = "+rem2);
	       

	}

}
/* Screen Dump

Enter an integer
7
Enter a second integer
18
7 / 18 = 0
7 % 18 = 7
18 / 7 = 2
18 % 7 = 4

 */


