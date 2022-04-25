/*

		Program: Assignmnet6.java          Date: April 7th 


		Author: Naomi Lockerbie  
		School: CHHS
		Course: Computer Science 10
		

		*/
package Assignments;
import java.util.*;
public class Assignment6 
{
		    public static void main(String args[])
		    {
		       Scanner input = new Scanner(System.in);
		       System.out.println("What is your first name?");
		       String firstName = input.nextLine();
		       System.out.println("What is your last name?");
		       String lastName = input.nextLine();
		       System.out.println("What grade are you in?");
		       int grade = input.nextInt();
		       input.nextLine();
		       System.out.println("What school do you attend?");		       
		       String school = input.nextLine();
		       System.out.println("What is your favorite hobby?");
		       String hobby = input.nextLine();
		       System.out.println("Hello, your name is " + firstName + " " + lastName + 
		    		   ", you are currently in grade " + grade + " at " + school + 
		    		   ". Your favorite hobby is " + hobby + ".");
		    }
}
/* Screen Dump

What is your first name?
Naomi
What is your last name?
Lockerbie
What grade are you in?
10
What school do you attend?
CHHS
What is your favorite hobby?
Skiing
Hello, your name is Naomi Lockerbie, you are currently in grade 10 at CHHS. Your favorite hobby is Skiing.

 */

