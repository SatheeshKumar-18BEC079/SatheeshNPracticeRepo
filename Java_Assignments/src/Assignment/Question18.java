package Assignment;

interface Transport{
	void booking(); 
		
	
}

class Bus implements Transport{
	public void booking() {
		System.out.println("The Bus number is 63B");
		
	}
}

class Flight implements Transport{
	public void booking() {
		System.out.println("The Flight number is A765GD");
	}
}

public class Question18 {

	public static void main(String[] args) {
		Transport ref1=new Bus();
		ref1.booking();
		Transport ref2=new Flight();
		ref2.booking();
		
	

	}

}
