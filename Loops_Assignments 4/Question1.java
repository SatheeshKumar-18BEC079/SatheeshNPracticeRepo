package Loops_Assignments4;

import java.util.Scanner;


public class Question1 {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
	
		

		
		System.out.println("Enter the Number: ");
	    int a=sc.nextInt();
		
		
	    
	    if(a>=50 && a<=200 && a%3==0 && a%5!=0) 
	    {
	    	System.out.println("Valid number");
	    }
	    else
	    {
	    	System.out.println("Invalid number");
	    	
	    }
		
	    sc.close();
		

	}

}
