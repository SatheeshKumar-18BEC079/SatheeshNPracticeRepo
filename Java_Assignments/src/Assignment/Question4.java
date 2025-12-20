package Assignment;

class Calculator{
	
	
	
	int add(int a, int b) {
		
		return a+b;
		
	}
	
	double add(double a, double b) {
		
		return a+b;
	}
}

public class Question4 {

	public static void main(String[] args) {
		
		Calculator obj = new Calculator();
		
		System.out.println(obj.add(23,76));
		System.out.println(obj.add(23.3498d, 87.6887d));

	}

}
