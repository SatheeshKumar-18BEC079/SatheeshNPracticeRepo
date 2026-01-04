package Loops_Assignments4;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int x=sc.nextInt();

		int sum=0;
		
		if(x>=100 && x<=999)
		{
			while(x!=0)
			{
				int rem=x%10;
				sum=sum+rem;
				x=x/10;
			}
			if(sum%2==0)
			{
				System.out.println("The sum of digits is EVEN");
			}
			else
			{
				System.out.println("The sum of digits is ODD");
			}
		}
		else
		{
			System.out.println("The entered number is not a 3 digit number");
		}
		sc.close();
		
		

	}

}
