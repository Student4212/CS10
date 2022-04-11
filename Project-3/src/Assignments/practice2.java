package Assignments;
import java.util.Scanner;
public class practice2 {

	public static void main(String[] args) 
	{
		 Scanner input = new Scanner(System.in);
	       System.out.println("What is your first name?");
	       String fullName = input.nextLine();
		if (fullName.equalsIgnoreCase("Kitchen"))
		{
			System.out.println("You must be Ap Tim Kitchen");
		}
		else 
		{
			System.out.println("Sorry you must be another AP");
		}
	}

}
