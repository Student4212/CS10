package Assignments;

/*

Program: Assignmnet9.java          Date: April 11th 


Author: Naomi Lockerbie  
School: CHHS
Course: Computer Science 10


*/
import java.util.Scanner;

public class Assignment9 
{	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
	       System.out.println("Enter an integer");//asks you for an integer 
	       int x = input.nextInt();//records integer 
	       System.out.println("Enter a second integer");//asks for second integer
	       int y = input.nextInt();//records second integer 
	       int div = x/y;//divide x by y
	       int rem = x%y;//find that remainder 
	       int div2 = y/x; //divide y by x 
	       int rem2 = y%x;//find that remainder
	       System.out.print(x+" / "+y+" = "+div+"\r\n"
	    		   +x+" % "+y+" = "+rem+"\r\n"
	    		   +y+" / "+x+" = "+div2+"\r\n"
	    		   +y+" % "+x+" = "+rem2);//print all the equations and answers 
	}

}
/* Screen Dump

Enter an integer
7
Enter a second integer
18
7 / 18 = 0
7 % 18 = 7
18 / 7 = 2
18 % 7 = 4

 */


