package Loops_Assignments4;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the Maths marks: ");
        int maths=sc.nextInt();
        
        System.out.println("Enter the Physics marks: ");
        int physics=sc.nextInt();
        
        System.out.println("Enter the Chemistry marks: ");
        int chemistry=sc.nextInt();
        
        int total= maths+physics+chemistry;
        
        int x=maths+physics;
        
        if(maths>=60 && physics>=50 && chemistry>=40)
        {
      	  System.out.println("The Student is Eligible");
        }
        
        else if(total>=180) {
        	
        	System.out.println("The Student is Eligible");
        }
        else if(x>=120) {
        	System.out.println("The Student is Eligible");
        	
        }

        else
        {
      	  System.out.println("The Student is not Eligible");
        }
        sc.close();

	}

}
