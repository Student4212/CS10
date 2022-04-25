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
		String greeting = "Hello"; 
		String txt = "Hello"; 
		System.out.println(txt.length());
		System.out.println(txt.toUpperCase());
		String firstName = "John";
		String lastName = "Doe"; 
		System.out.println(firstName+lastName);
		System.out.println(firstName.concat(lastName));
		String txt2 = "Hello Everybody"; 
		System.out.println(txt2.indexOf("e"));

	}

}
/* Screen Dump
5
HELLO
JohnDoe
JohnDoe
1
 */