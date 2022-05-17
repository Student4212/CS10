package Credit.five;

import java.util.Scanner;

public class RockPaperSicissors 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);//creates new scanner
		int comp = 1 + (int)(Math.random()*3);//genterates a random number from 1-3 and stores that number as variable comp 
		System.out.println("Choose rock paper or scissors: "); //asks you to enter rock paper or scissors 
		String player = input.nextLine(); //records your answer as variable player 
		String message = "0";//creates variable message and gives it a value of 0 
		if (player.equals("rock") && comp==1)//says if the value of player is equal to rock (capitaluization doesn't matter) and the value of comp is 1, follow the instructions inside the bracket
		{
			message = "Computer: rock \r\nIt's a Tie";//changes value of message to writing in quotes 
		}
		else if (player.equals("paper") && comp==2)//says if the numbers haven't fit any of the previous crieteria AND the value of player is equal to paper (capitaluization doesn't matter) and the value of comp is 2, follow the instructions inside the bracket
		{
			message = "Computer: paper \r\nIt's a Tie";//changes value of message to writing in quotes 
		}
		else if (player.equals("scissors") && comp==3)//says if the numbers haven't fit any of the previous crieteria AND the value of player is equal to scissors (capitaluization doesn't matter) and the value of comp is 3, follow the instructions inside the bracket
		{
			message = "Computer: scissors \r\nIt's a Tie";//changes value of message to writing in quotes 
		}
		else if (player.equals("rock") && comp==2)//says if the numbers haven't fit any of the previous crieteria AND the value of player is equal to rock (capitaluization doesn't matter) and the value of comp is 2, follow the instructions inside the bracket
		{
			message = "Computer: paper \r\nYou lose!";//changes value of message to writing in quotes 
		}
		else if (player.equals("paper") && comp==3)//says if the numbers haven't fit any of the previous crieteria AND the value of player is equal to paper (capitaluization doesn't matter) and the value of comp is 3, follow the instructions inside the bracket
		{
			message = "Computer: scissors \r\nYou lose!";//changes value of message to writing in quotes 
		}
		else if (player.equals("scissors") && comp==1)//says if the numbers haven't fit any of the previous crieteria AND the value of player is equal to scissors (capitaluization doesn't matter) and the value of comp is 1, follow the instructions inside the bracket
		{
			message = "Computer: rock \r\nYou lose!";//changes value of message to writing in quotes 
		}
		else if (player.equals("rock") && comp==3)//says if the numbers haven't fit any of the previous crieteria AND the value of player is equal to rock (capitaluization doesn't matter) and the value of comp is 3, follow the instructions inside the bracket
		{
			message = "Computer: scissors \r\nYou win!";//changes value of message to writing in quotes 
		}
		else if (player.equals("paper") && comp==1)//says if the numbers haven't fit any of the previous crieteria AND the value of player is equal to paper (capitaluization doesn't matter) and the value of comp is 1, follow the instructions inside the bracket
		{
			message = "Computer: rock \r\nYou win!";//changes value of message to writing in quotes 
		}
		else if (player.equals("scissors") && comp==2)//says if the numbers haven't fit any of the previous crieteria AND the value of player is equal to scissors (capitaluization doesn't matter) and the value of comp is 2, follow the instructions inside the bracket
		{
			message = "Computer: paper \r\nYou win!";//changes value of message to writing in quotes 
			
		}
		System.out.println("You: "+player+" "+message);//displays the players choice and the value of message 
	}

}
