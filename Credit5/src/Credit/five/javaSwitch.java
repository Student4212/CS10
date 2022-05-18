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
		switch (day) //opens new switch about variable day 
		{
			case 1: //if user types one, follow instructions too break and beyond, if not, skip ahead to break 
				System.out.println("Saturday");//display Saturday 
				break;//end of case 
		  
			case 2://if user types two, follow instructions too break and beyond, if not, skip ahead to break 
				System.out.println("Sunday");//display Sunday 
				break;//end of case 
		}
		int day2 = 4;//defines variable day2 as 4 
		switch (day2) //opens new switch about variable day2 
		{
			case 1://if user types one, follow instructions too break and beyond, if not, skip ahead to break 
				System.out.println("Saturday");//display Saturday
				break;//end of case
			case 2://if user types two, follow instructions too break and beyond, if not, skip ahead to break 
		    System.out.println("Sunday"); //display Sunday 
		    break;//end of case
		  
		default://if not one or two, follow the following instructions 
		    System.out.println("Weekend");//Display Weekend 
		}
	}
}
/* Screen Dump
Sunday
Weekend
 */
