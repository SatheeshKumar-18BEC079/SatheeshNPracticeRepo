package Assignment;

class student45{
	
	static String collegename="MCET";
	String name;
	int rollno;
	
	student45(String name, int rollno){
		
		
		this.name=name;
		this.rollno=rollno;
		
		
	
	}
	
	void display() {
		System.out.println(collegename+" "+name+" "+rollno);
	}
}

public class Question10 {

	public static void main(String[] args) {
		
		student45 obj=new student45("Hari",90872);
		student45 obj1=new student45("Satheesh", 90873);
		student45 obj2=new student45("Ravi",90874);
		
		obj.display();
		obj1.display();
		obj2.display();
			
		
		

		
		

	}

}
