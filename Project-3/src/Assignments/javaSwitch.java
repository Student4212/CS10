package Assignments;

public class javaSwitch 
{

	public static void main(String[] args) 
	{
		int day = 2;//defines day as 2 
		switch (day) 
		{
			case 1: 
				System.out.println("Saturday");
				break;
		  
			case 2:
				System.out.println("Sunday");
				break;
		}
		int day2 = 4;
		switch (day2) 
		{
			case 1:
				System.out.println("Saturday");
				break;
			case 2:
		    System.out.println("Sunday"); 
		    break;
		  
		default:
		    System.out.println("Weekend");
		}

	}

}
