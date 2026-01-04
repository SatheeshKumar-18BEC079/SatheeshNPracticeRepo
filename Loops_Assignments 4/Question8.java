package Loops_Assignments4;
import java.util.Scanner;
public class Question8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age:");
		int age=sc.nextInt();
		System.out.println("Enter the salary:");
		
		int salary=sc.nextInt();
		
		if(age>=25) 
		{
			if(age>=30)
			{
				if (salary>=50000)
				{
					System.out.println("Eligible for loan B");
				}
				else
				{
					System.out.println("Not Eligible for loan B");
				}
			}
			else
			{
				if(salary<30000)
				{
					System.out.println("Eligible for loan A");
				}
				else
				{
					System.out.println("Not Eligible for loan A");
				}
			}				
			}	
		else
		{
			System.out.println("Not eligible");
		}
		sc.close();
	}
		
		

		
		
		
		

}





