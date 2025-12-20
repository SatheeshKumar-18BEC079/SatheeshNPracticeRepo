package Assignment;

class shape1 
{
	int length;
	
	shape1(int length)
	{
		this.length=length;
	}
	
	 void square()
	 {
		float area=length*length;
		System.out.println("The area of square is "+area);
	 }
	 
	 
	 void rectangle(int breadth)
	 {
		 int area1=length*breadth;  
		 System.out.println("The area of rectangle is "+area1);
	 }
	 void circle()
	 {
		 double area2= 3.14* length * length; 
		 System.out.println("The area of circle is "+area2);
	 }
	 
}

public class Question24 {

	public static void main(String[] args) {
		
		shape1 obj=new shape1(11);
		obj.square();
		obj.rectangle(16);
		obj.circle();
		
		

	}

}