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
		int x = 50;//stores number 
		int y = 10;//stores number 
		if(x>y) //compares numbers, if x is greater than y, follow instructions in next brackets, if not, skip them 
		{
		  System.out.println("Hello World");//display Hello World 
		}
		int z = 50;//define variable 
		if (x==z)//if the variable x is equal to the variable z, follow instructions in next brackets, if not, skip them
		{
			System.out.println("Hello World");//display Hello World 
		}
		if (x==z)//if the variable x is equal to the variable z, follow instructions in next brackets, if not, follow the instructions in the next curly brackets (after else)
		{
			System.out.println("Yes"); //Display yes
		}
		else //if x and z are not equal, follow instructions in the next curly brackets 
		{
			System.out.println("No");//display no 
		}
		if(x==y) //if x and y are equal, follow the instructions in the next bracket 
		{
			System.out.println("1");//display 1 
		}
		else if (x>y) //if x is greater than y, follow the instructions in the next bracket 
		{
			System.out.println("2");//display 2 
		}
		else //if neither of the last statements were true, follow the instructions in the next bracket 
		{
			System.out.println("3");//display 3 
		}
		int time = 20;//store 20 as time 
		String result = (time < 18)? "Good day." : "Good evening.";//if the time is less than 18, store good day, if it isn't, store good evening
		System.out.println(result); //prints the phrase stored as result 
	}

}
/*Screen Dump
Hello World
Hello World
Yes
2
Good evening.
*/