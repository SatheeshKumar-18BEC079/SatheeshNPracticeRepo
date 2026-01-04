package Loops_Assignments4;

public class Question14 {

	public static void main(String[] args) {
		int x1=0;
		int x2=1;
		int X=30;
		
		System.out.println("The Fibonacci Series is ");
		
	    for(int i=2;i<X;i++)
		    {
		    	
		    	int x3=x1+x2;
		    	x1=x2; 
		    	x2=x3;
		    	if(x3>=500)
		    	{
		    		break;
		    	}
		    	System.out.print(" "+x3);
	    	
	    }

	}

}
