package Assignments;
import java.util.*;



public class PizzaCost 
{

	public static void main(String[] args) 
	{
		Scanner myObj = new Scanner(System.in); 
	    System.out.println("Enter Pizza Diameter in Whole Inches");

	    int size = myObj.nextInt(); 
	    int size2 = Integer.parseInt(size);
	    
	    OR
	    
	    String size = myObj.nextInt(); 
	    int size2 = Integer.parseInt(size);
	   
	    
	    float extra = 1.75f;
	    int a = size2*size2;
	    System.out.println("It costs" + a+extra);  

	}

}
