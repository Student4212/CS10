package Credit.five;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Assignment17 
{

	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in); //creates new scanner 
		DecimalFormat df = new DecimalFormat("0.00"); //sets up decimals to be too two points
		System.out.println("Please enter a GPA or enter -1 to quit the program: ");//asks you to enter a gpa or to enter -1 to quit 
		double gpa = input.nextDouble(); //record the number as a double (numbher with decimals) called gpa 
		while (gpa != -1)//if gpa is not equal to -1, go through instructions in curly bracket, if it is, skip to end of loop 
		{
		
		if(gpa > 3.80)//says that if the gpa is greater than or equal too 3.8 to follow the instructions in the curly bracket
		{
			System.out.println("summa cum laude");//displays summa cum laude 
						
		}
		else if(gpa >= 3.65)//says that if the gpa hasn't meet any of the previous criteria and is greater than or equal too 3.65 to follow the instructions in the curly bracket
		{
			System.out.println("magna cum laude");//displays magna cum laude
			
		}
		else if(gpa >= 3.50)//says that if the gpa hasn't meet any of the previous criteria and is greater than or equal too 3.5 to follow the instructions in the curly bracket
		{
			System.out.println("cum laude");//displays cum laude
			
		}
		else if (gpa <= 3.5 && gpa > 0)//says that if the gpa hasn't meet any of the previous criteria and is less than or equal too 3.5 and over 0 to follow the instructions in the curly bracket
		{
			System.out.println("Sorry, you did not qualify for an honors distinction");//displays message 
			
		}
		
		System.out.println("\r\nPlease enter a GPA or enter -1 to quit the program: ");//requests you enter a new gpa or enter -1 to quit 
		gpa = input.nextDouble(); //records answer 
		}//end of loop, start at beginning of loop again 
		System.out.println("Thank you for using our program, have a great day!");//displays message once you quit 

	}

}
/*Screen Dump
Please enter a GPA or enter -1 to quit the program: 
3
Sorry, you did not qualify for an honors distinction

Please enter a GPA or enter -1 to quit the program: 
3.5
cum laude

Please enter a GPA or enter -1 to quit the program: 
3.9
summa cum laude

Please enter a GPA or enter -1 to quit the program: 
3.8
magna cum laude

Please enter a GPA or enter -1 to quit the program: 
-1
Thank you for using our program, have a great day!
*/