package Credit.five;

import java.util.Scanner;

public class GroupProject 
{
	public static void main(String[] args) 
		{
			String one = "play";
			while (one=="play")
			{
			Scanner input = new Scanner(System.in);//creates new scanner
			int comp = 1 + (int)(Math.random()*3);//genterates a random number from 1-3 and stores that number as variable comp
			System.out.println("\r\nEnter rock paper or scissors: "); //asks you to enter rock paper or scissors
			String player = input.nextLine(); //records your answer as variable player
			String message = "Error";//creates variable message and gives it a value of Error
			if (player.equalsIgnoreCase("rock") && comp==1)//says if the value of player is equal to rock (capitalization doesn't matter) and the value of comp is 1, follow the instructions inside the bracket
			{
				message = "Computer: rock \r\nIt's a Tie";
			}
			else if (player=="paper" && comp==2)//says if the numbers haven't fit any of the previous criteria AND the value of player is equal to paper (capitalization doesn't matter) and the value of comp is 2, follow the instructions inside the bracket
			{
				message = "Computer: paper \r\nIt's a Tie";
			}
			else if (player=="scissors" && comp==3)//says if the numbers haven't fit any of the previous criteria AND the value of player is equal to scissors (capitalization doesn't matter) and the value of comp is 3, follow the instructions inside the bracket
			{
				message = "Computer: scissors \r\nIt's a Tie";
			}
			else if (player=="rock" && comp==2)//says if the numbers haven't fit any of the previous criteria AND the value of player is equal to rock (capitalization doesn't matter) and the value of comp is 2, follow the instructions inside the bracket
			{
				message = "Computer: paper \r\nYou lose!";
			}
			else if (player=="paper" && comp==3)
			{
				message = "Computer: scissors \r\nYou lose!";
			}
			else if (player.equalsIgnoreCase("scissors") && comp==1)
			{
				message = "Computer: rock \r\nYou lose!";
			}
			else if (player=="rock" && comp==3)
			{
				message = "Computer: scissors \r\nYou win!";
			}
			else if (player.equalsIgnoreCase("paper") && comp==1)
			{
				message = "Computer: rock \r\nYou win!";
			}
			else if (player=="scissors" && comp==2)
			{
				message = "Computer: paper \r\nYou win!";
				
			}
			System.out.println("You: "+player+"\r\n"+message+"\r\n\r\n"
				+ "Enter play to continue playing or anything else to exit the program.");
			one = input.nextLine();
			}
			System.out.println("\r\nYou have exited the program. Have a good day and come back soon!");
		}
	}