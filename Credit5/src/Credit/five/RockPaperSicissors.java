package Credit.five;

import java.util.Scanner;

public class RockPaperSicissors 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);//creates new scanner
		int comp = 1 + (int)(Math.random()*3);
		System.out.println("Choose rock paper or scissors: "); 
		String player = input.nextLine(); 
		String message = "0";
		if (player=="rock" && comp==1)
		{
			message = "Computer: rock \r\nIt's a Tie";
		}
		else if (player=="paper" && comp==2)
		{
			message = "Computer: paper \r\nIt's a Tie";
		}
		else if (player=="scissors" && comp==3)
		{
			message = "Computer: scissors \r\nIt's a Tie";
		}
		else if (player=="rock" && comp==2)
		{
			message = "Computer: paper \r\nYou lose!";
		}
		else if (player=="paper" && comp==3)
		{
			message = "Computer: scissors \r\nYou lose!";
		}
		else if (player=="scissors" && comp==1)
		{
			message = "Computer: rock \r\nYou lose!";
		}
		else if (player=="rock" && comp==3)
		{
			message = "Computer: scissors \r\nYou win!";
		}
		else if (player=="paper" && comp==1)
		{
			message = "Computer: rock \r\nYou win!";
		}
		else if (player=="scissors" && comp==2)
		{
			message = "Computer: paper \r\nYou win!";
			
		}
		System.out.println("You: "+player+" "+message);
	}

}