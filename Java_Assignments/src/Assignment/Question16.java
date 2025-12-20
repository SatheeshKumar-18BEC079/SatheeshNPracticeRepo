package Assignment;

class Hospital{
	void emergencyService() {
		System.out.println("The emergency service number is 108");
	}
}
class cityHospital extends Hospital{
	void emergencyService() {
		super.emergencyService();
		System.out.println("The cityHospital is nearby");
		
	}
	
}

public class Question16 {

	public static void main(String[] args) {
		
		cityHospital obj=new cityHospital();
		obj.emergencyService();
		

	}

}
