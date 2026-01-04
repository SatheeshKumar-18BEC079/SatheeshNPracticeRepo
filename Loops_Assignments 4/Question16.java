package Loops_Assignments4;

import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		
		int count=0;
		int num;
		
		do
		{
			System.out.print("Enter the number: ");
			num=sc.nextInt();
			if(num>=0 && num%2==0)
			{
				count=count+num;
			}
			
		}
		while(num>=0);
		System.out.println("The sum of the even numbers entered: " +count);
		sc.close();

	}
	
	

}
