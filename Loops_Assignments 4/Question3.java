package Loops_Assignments4;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the year:");
	
	int x=sc.nextInt();
	
	if((x%4==0 || x%400==0) && (x%100!=0)) {
		
		System.out.println("The entered year is a leap year");
	}
	
	else {
		System.out.println("The entered year is not a leap year");
		
	}
	sc.close();
	

	}

}
