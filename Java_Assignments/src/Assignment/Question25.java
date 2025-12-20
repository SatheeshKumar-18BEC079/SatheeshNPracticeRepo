package Assignment;

class school 
{
	String name;
	
	school()
	{
		name="PKD matriculation higher secondary school";
		System.out.println("The name of the school is : "+name);
	}
	void display()
	{
		System.out.println("This School is based out of Kolkata");
	}
}


public class Question25 {


	public static void main(String[] args) {
		
	school obj=new school();
	obj.display();
	
		
	}

}