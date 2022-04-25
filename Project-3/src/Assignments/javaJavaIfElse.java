	/*
	Program: javaJavaIfElse.java          Date: April 20th 


	Author: Naomi Lockerbie  
	School: CHHS
	Course: Computer Science 10
	*/
package Assignments;

public class javaJavaIfElse 
{
	public static void main(String[] args) 
	{
		int x = 50;
		int y = 10;
		if(x>y) 
		{
		  System.out.println("Hello World");
		}
		int z = 50;
		if (x==z)
		{
			System.out.println("Hello World");
		}
		if (x==z)
		{
			System.out.println("Yes"); 
		}
		else 
		{
			System.out.println("No");
		}
		if(x==y) 
		{
			System.out.println("1");
		}
		else if (x>y)
		{
			System.out.println("2");
		}
		else 
		{
			System.out.println("3");
		}
		int time = 20;
		String result = (time < 18)? "Good day." : "Good evening.";
		System.out.println(result); 
	}

}
/*Screen Dump
Hello World
Hello World
Yes
2
Good evening.
*/