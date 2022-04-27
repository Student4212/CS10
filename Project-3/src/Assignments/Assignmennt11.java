/*

	Program: Assignment11.java          Date: April 27th 


	Author: Naomi Lockerbie  
	School: CHHS
	Course: Computer Science 10
	

	*/
package Assignments;
import java.util.Scanner;
public class Assignmennt11 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);//creates new scanner 
		System.out.println("Enter any three digits");//asks you for the three digits
		int all = input.nextInt();//records the three digits 
		int first = all/100; //extracts the first digit by dividing by 100 
		int second = (all%100)/10; //extracts the second digit by finding the remainder you get when you divide by 100 and then dividing that by 10 
		int third = ((all%100)%10); //extracts the third digit by finding the remainder you get when you divide by 100 and then the remainder you get by dividing that remainder by 10 

		int max = 0; //defines max as 0 
		int min = 0; //defines min as 0 
		
		if (second>first && third>first)// says that second and third are larger than first to follow the instructions in the curly bracket
		{
			min=first; // define min as the value of first 
		}
		else if (first>second && third>second) //says that first and third are larger than second to follow the instructions in the curly bracket
		{
			min = second; //Defines min as the value of second
		}
		else //says that if  second and third are not larger than first and first and third are not larger than second to follow the instructions in the curly bracket
		{
			min = third; //defines min as the value of third 
		}
		if (second>first && second>third) //says that if first and third are smaller than second to follow the instructions in the curly bracket
		{
			max = second; //defines max as the value of second 
		}
		else if (third>first && third>second)//says that if first and second are smaller than third to follow the instructions in the curly bracket
		{
			max = third; //defines max as the value of third
		}
		else //says that if first and second are not smaller than third and first and third are not smaller than second to follow the instructions in the curly bracket
		{
			max = first; //defines max as the value of first  
		}
		System.out.println("Max: "+max+"  Min: "+min);//prints out the value of min and the value of max and explains what they are 
	}

}
