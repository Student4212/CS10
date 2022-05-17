/*

	Program: javaSwitch.java          Date: April 27th 


	Author: Naomi Lockerbie  
	School: CHHS
	Course: Computer Science 10
	

	*/
package Credit.five;

public class javaSwitch 
{

	public static void main(String[] args) 
	{
		int day = 2;//defines day as 2 
		switch (day) 
		{
			case 1: 
				System.out.println("Saturday");
				break;
		  
			case 2:
				System.out.println("Sunday");
				break;
		}
		int day2 = 4;
		switch (day2) 
		{
			case 1:
				System.out.println("Saturday");
				break;
			case 2:
		    System.out.println("Sunday"); 
		    break;
		  
		default:
		    System.out.println("Weekend");
		}

	}

}
/* Screen Dump
Sunday
Weekend
 */
