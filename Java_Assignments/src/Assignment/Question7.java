package Assignment;

class person{
	person(){
		System.out.println("Person created");
	}
}
class student extends person{
	student(){
		super();
		System.out.println("Student Created");
		
		
	}
}

public class Question7 {

	public static void main(String[] args) {
		
		student obj=new student();

	}

}
