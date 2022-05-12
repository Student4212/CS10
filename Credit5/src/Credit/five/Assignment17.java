package Credit.five;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Assignment17 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); 
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("Please enter your GPA or enter -1 to quit the program: ");
		double gpa = input.nextDouble(); 
		while(gpa == -1)
		{
			gpa++;
		}
		if(gpa >= 3.80)
		{
			System.out.println("summa cum laude");
			System.out.println("Enter another GPA or type -1 to quit?");
			
		}
		else if(gpa >= 3.65)
		{
			System.out.println("magna cum laude");
			System.out.println("Enter another GPA or type -1 to quit?");
			
		}
		else if(gpa >= 3.50)
		{
			System.out.println("cum laude");
			System.out.println("Enter another GPA or type -1 to quit?");
			
		}
		else if (gpa <= 3.5 && gpa > 0)
		{
			System.out.println("Sorry, you did not qualify for an honors distinction\r\n"
					+ "Would you like to continue or quit?");

		}
		System.out.println("Thank you for using our program, have a great day!");

	}

}
/*Screen Dump

*/