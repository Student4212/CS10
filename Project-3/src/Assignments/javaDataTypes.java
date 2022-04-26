/*
	Program: javaDataTypes.java          Date: April 19th 


	Author: Naomi Lockerbie  
	School: CHHS
	Course: Computer Science 10
	*/
package Assignments;

public class javaDataTypes 
{
	public static void main(String[] args) 
	{
		int myNum = 9;//defines variable/int 
		float myFloatNum = 8.99f;//defines variable/float as 8.99
		char myLetter = 'A';//defines variable/char 
		boolean myBool = false;//defines variable/boolean 
		String myText = "Hello World";//defines variable/string
		//primitive data type 
		double myDouble = 9.78d;//defines variable/double as 9.78 
		int myInt = (int)myDouble;//turns myDouble into an integer (9)
		System.out.println(myNum+" "+myFloatNum+" "+myLetter+" "+myBool+" "+myText+" "+myDouble+" "+myInt);//prints off all the variables
	}

}
/* Screen Dump
9 8.99 A false Hello World 9.78 9
 */