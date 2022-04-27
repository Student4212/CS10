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

		int max = 0; 
		int min = 0; 
		
		if (second>first && third>first)
		{
			min=first; 
		}
		else if (first>second && third>second) 
		{
			min = second; 
		}
		else 
		{
			min = third; 
		}
		if (second>first && second>third) 
		{
			max = second; 
		}
		else if (third>first && third>second)
		{
			max = third; 
		}
		else 
		{
			max = first; 
		}
		System.out.println("Max: "+max+"  Min: "+min);
	}

}
