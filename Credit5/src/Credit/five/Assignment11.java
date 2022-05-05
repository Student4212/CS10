/*

	Program: Assignment11.java          Date: April 27th 


	Author: Naomi Lockerbie  
	School: CHHS
	Course: Computer Science 10
	

	*/
package Credit.five;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Assignment11 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);//creates new scanner
		DecimalFormat dn = new DecimalFormat("0.0");
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
		int sum = first + second + third; //adds all three digits together and saves answer as sum 
		int product = first * second * third; //Multiples all three digits together and saves answer as product
		double average = ((double)(first + second + third) / (double)3);//adds all; three digits together and divides them by three to find the average, which itthen saves as average 
		
		System.out.println("The largest of the three digits is: "+max+
				"\r\nThe smallest of the three digits is: "+min+
				"\r\nThe sum of the three digits is: "+sum+
				"\r\nThe product of the three digits is: "+product+
				"\r\nThe average of the three digits is: "+ dn.format(average)
				);//prints out the smallest digit, the largest digit, the sum of the digits, the product of the digits and the average of the digits and explains what they are 
	}

}
/*Screen Dump
Enter any three digits
892
The largest of the three digits is: 9
The smallest of the three digits is: 2
The sum of the three digits is: 19
The product of the three digits is: 144
The average of the three digits is: 6.3
*/