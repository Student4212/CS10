	/*
	Program: javaMath.java          Date: April 20th 


	Author: Naomi Lockerbie  
	School: CHHS
	Course: Computer Science 10
	*/
package Assignments;

public class javaMath 
{
	public static void main(String[] args) 
	{
		int x = 5; //stores variable 
		int y = 10; //stores variable 
		Math.max(x, y);//finds the highest possible number of those two digits (10)
		int z = 16; //stores variable 
		Math.sqrt(z); //squares z 
		Math.random();//chooses a random number 
		System.out.println(x+" "+y+" "+Math.max(x, y)+" "+z+" "+Math.sqrt(z)+" "+Math.random());//prints all answers or examples of what the program did
	}

}
/*Screen Dump
 5 10 10 16 4.0 0.2892217961339484
*/