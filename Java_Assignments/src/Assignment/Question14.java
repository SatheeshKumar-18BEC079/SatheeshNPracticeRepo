package Assignment;

class Course{
	void courseInfo() {
		System.out.println("The available courses are Science, commerce, Arts");
	}
}

class Science extends Course{
	void test() {
		System.out.println("Science is selected");
	}
}

class commerce extends Course{
	void test1() {
		System.out.println("Commerce is selected");
	}
}
class Arts extends Course{
	void test2() {
		System.out.println("Arts is selected");
	}
}

public class Question14 {

	public static void main(String[] args) {
		
		
		Arts obj=new Arts();
		obj.test2();
		obj.courseInfo();
		
		commerce obj1= new commerce();
		obj1.test1();
		
		Science obj2= new Science();
		obj2.test();
		

	}

}
