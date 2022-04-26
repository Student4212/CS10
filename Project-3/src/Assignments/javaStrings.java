	/*
	Program: javaStrings.java          Date: April 19th 


	Author: Naomi Lockerbie  
	School: CHHS
	Course: Computer Science 10
	*/
package Assignments;

public class javaStrings 
{
	public static void main(String[] args) 
	{
		String greeting = "Hello"; //defines greeting as Hello 
		String txt = "Hello"; //defines txt as Hello 
		System.out.println(txt.length());//prints the number of letter in the value of the variable txt 
		System.out.println(txt.toUpperCase());//prints the value of the variable txt in upper case 
		String firstName = "John";//stores John and firstName 
		String lastName = "Doe"; //stores Doe as lastName 
		System.out.println(firstName+lastName);//prints the value of the two variables, firstName and lastName 
		System.out.println(firstName.concat(lastName));//prints the two variables with a space in between
		String txt2 = "Hello Everybody"; //defines txt2 as Hello Everybody 
		System.out.println(txt2.indexOf("e"));//counts the number of letters until the first e in the value of the variable txt2 and [rints that number 

	}

}
/* Screen Dump
5
HELLO
JohnDoe
JohnDoe
1
 */