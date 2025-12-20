package Assignment;

class Vehicle{
	
	void fuelType() {
		
		System.out.println("Runs on fuel");
		
	}
}
	class ElectricCar extends Vehicle{
		
		void fuelType() {
			System.out.println("Runs on electricity");
		}
		
		
	}


public class Question2 {

	public static void main(String[] args) {
		
		Vehicle obj= new Vehicle ();
		obj.fuelType();
		ElectricCar obj1= new ElectricCar();
		obj1.fuelType();
		
		
				
		

	}

}
