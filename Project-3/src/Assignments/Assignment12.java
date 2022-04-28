/*

	Program: Assignment12.java          Date: April 28th 


	Author: Naomi Lockerbie  
	School: CHHS
	Course: Computer Science 10
	

	*/
package Assignments;

import java.util.Scanner;

public class Assignment12 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);//creates new scanner 
		System.out.println("Enter you grade as a percentage: ");//asks you for your grade on the test
		int grade = input.nextInt();//records the grade 
		String letter = "None"; //creates variable letter and makes it equal to none 
		if (grade>=90 && grade<=100)//says if grade is greater than or equal to ninety and less than or equal to 100, follow the instructions inside the bracket 
		{
			letter = "A+"; //Assigns variable letter the new value of A+ 
		}
		else if (grade>=80 && grade<=89)//if the grade does not fit the previous conditions and it is greater than or equal to eighty and less than or equal to 89, follow the instructions inside the bracket 
		{
			letter = "A";//Assigns the variable letter the new value of A 
		}
		else if (grade>=75 && grade<=79)//if the grade has not fit any of the previous criteria and it is greater than or equal to 79 and less than or equal to 75, follow the instructions inside the bracket
		{
			letter = "B+";//Assigns the variable letter the new value of B+ 
		}
		else if (grade>=70 && grade<=74)//if the grade has not fit any of the previous criteria and it is greater than or equal to 70 and less than or equal to 74, follow the instructions inside the bracket
		{
			letter = "B";//Assigns the variable letter the new value of B 
		}
		else if (grade>=65 && grade<=69) //if the grade has not fit any of the previous criteria and it is greater than or equal to 65 and less than or equal to 69, follow the instructions inside the bracket
		{
			letter = "C+"; //Assigns the variable letter the new value of C+ 
		}
		else if (grade>=60 && grade<=64)//if the grade has not fit any of the previous criteria and it is greater than or equal to 60 and less than or equal to 64, follow the instructions inside the bracket
		{
			letter = "C";//Assigns the variable letter the new value of C 
		}
		else if (grade>=55 && grade<=59)//if the grade has not fit any of the previous criteria and it is greater than or equal to 55 and less than or equal to 59, follow the instructions inside the bracket
		{
			letter = "D+";//Assigns the variable letter the new value of D+ 
		}
		else if (grade>=50 && grade<=54)//if the grade has not fit any of the previous criteria and it is greater than or equal to 50 and less than or equal to 54, follow the instructions inside the bracket
		{
			letter = "D";//Assigns the variable letter the new value of D
		}
		else //if the grade has not fit any of the previous criteria follow the instructions inside the bracket
		{
			letter = "F";//Assigns the variable letter the new value of F 
		}
		System.out.println("The corresponding letter grade is: "+letter);//Displays letter grade and explanation 
	}

}
