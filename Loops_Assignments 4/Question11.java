package Loops_Assignments4;

public class Question11 {

	public static void main(String[] args) {
		int x=1;
		while(x<=100)
		{
			if(x%3!=0 && x%5!=0)
			{
				System.out.println(x);
				
			}
		    x++;
		    if(x==77)
			{
			break;
			}
			
		}

	}

}
