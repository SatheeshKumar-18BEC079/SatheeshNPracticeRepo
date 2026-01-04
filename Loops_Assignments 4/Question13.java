package Loops_Assignments4;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number :");
		
		int num=sc.nextInt();
		
		int i=0;
		   
		while(num!=0)
		{
			int d=num%10;
			if (d==2 || d==3 || d==5 || d==7)
	        {
	          i=i+1;
	         }
	        num=num/10;
	       }
		System.out.println("The number of prime digits is: " +i);
		sc.close();

	}


}
