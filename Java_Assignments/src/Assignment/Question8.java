package Assignment;

class shape{
	
	void area(){
	
		
	}
	
}

class Rectangle extends shape{
	
	void area() {
		System.out.println("Area of rectangle");
	}
}

class circle extends shape{
	void area() {
		System.out.println("Area of circle");
	}
}

public class Question8 {

	public static void main(String[] args) {
		shape ref1= new Rectangle();
		shape ref2= new circle();
		
		ref1.area();
		ref2.area();

	}

}
