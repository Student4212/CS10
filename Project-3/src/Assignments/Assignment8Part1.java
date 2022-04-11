package Assignments;

import java.util.Scanner;

public class Assignment8Part1 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
	       System.out.println("Enter a two digit number");
	       int number1 = input.nextInt();
	       int number2 = number1/10; 
	       int number3 = number1%10; 
	       System.out.println("The first digit is: "+number2+"\r\n"
	       		+ "The second digit is: "+number3);

	}

}
