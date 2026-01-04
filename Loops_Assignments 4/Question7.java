package Loops_Assignments4;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the four numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		
		if(a>b && a>c && a>d)
		{
			System.out.println("The maximum number is " + a);
		}
		else if(b>a && b>c && b>d)
		{
			System.out.println("The maximum number is " + b);
		}
		else if(c>a && c>b && c>d)
		{
			System.out.println("The maximum number is " + c);
		}
		else {
			System.out.println("The maximum number is " + d);
		}
sc.close();
	}

}
