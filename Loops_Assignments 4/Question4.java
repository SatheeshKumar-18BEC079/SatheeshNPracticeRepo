package Loops_Assignments4;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int x=sc.nextInt();
		
		if(x>0){
			
			
			System.out.println("Entered number is positive");
			if(x%4==0) {
				System.out.println("Entered number is divisble by 4");
			}
			else {
				System.out.println("Entered number is not divisible by 4");
			}
			
		}
		else{
			
			
			System.out.println("Entered number is negative");
			if(x%6==0) {
				System.out.println("Entered number is divisble by 6");
			}
			else {
				System.out.println("Entered number is not divisible by 6");
			}
			
		}
		
		
sc.close();

	}

}
