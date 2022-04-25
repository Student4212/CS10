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
		       Scanner input = new Scanner(System.in);//allows you to ask questions 
		       System.out.println("What is your first name?");//displays that question 
		       String firstName = input.nextLine(); //Records answer 
		       System.out.println("What is your last name?");//displays that question 
		       String lastName = input.nextLine();//records answer 
		       System.out.println("What grade are you in?");//displays that question 
		       int grade = input.nextInt();//records answer 
		       input.nextLine();//allows for next question 
		       System.out.println("What school do you attend?");//displays that question 
		       String school = input.nextLine();//records answer 
		       System.out.println("What is your favorite hobby?");// displays that question 
		       String hobby = input.nextLine();//records answer 
		       System.out.println("Hello, your name is " + firstName + " " + lastName + 
		    		   ", you are currently in grade " + grade + " at " + school + 
		    		   ". Your favorite hobby is " + hobby + ".");//displays sentence with your personal information 
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

