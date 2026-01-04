package Loops_Assignments4;



public class Question22 {

	public static void main(String[] args) {
		int x =0;
		for(int i=100;i<=999;i++)
		{
			int n =i;
			int rev = 0;
			for(int temp = n; temp>0;temp=temp/10)
			{
				int d = temp %10;
				rev = rev *10 + d;
			}
			if(n == rev)
			{
				x = n;
			}
		}
		System.out.println("Largest palindrome number between 100 and 1000 is : " + x);
		}

	}

