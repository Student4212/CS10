package Assignments;
import java.util.*;

public class PizzaCost 
{

	public static void main(String[] args) 
	{
		Scanner myObj = new Scanner(System.in); 
	    System.out.println("Enter Pizza Diameter in Whole Inches");
	    int size = myObj.nextInt(); 
	    
	    
	   double cost = (size * size * 0.05) + 0.75 + 1.00;
	  
	 
	    System.out.println("It costs $" + cost);  

	}

}
