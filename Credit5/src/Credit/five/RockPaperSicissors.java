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
		if (player.equals("rock") && comp==1)
		{
			message = "Computer: rock \r\nIt's a Tie";
		}
		else if (player.equals("paper") && comp==2)
		{
			message = "Computer: paper \r\nIt's a Tie";
		}
		else if (player.equals("scissors") && comp==3)
		{
			message = "Computer: scissors \r\nIt's a Tie";
		}
		else if (player.equals("rock") && comp==2)
		{
			message = "Computer: paper \r\nYou lose!";
		}
		else if (player.equals("paper") && comp==3)
		{
			message = "Computer: scissors \r\nYou lose!";
		}
		else if (player.equals("scissors") && comp==1)
		{
			message = "Computer: rock \r\nYou lose!";
		}
		else if (player.equals("rock") && comp==3)
		{
			message = "Computer: scissors \r\nYou win!";
		}
		else if (player.equals("paper") && comp==1)
		{
			message = "Computer: rock \r\nYou win!";
		}
		else if (player.equals("scissors") && comp==2)
		{
			message = "Computer: paper \r\nYou win!";
			
		}
		System.out.println("You: "+player+" "+message);
	}

}
