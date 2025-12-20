package Assignment;

interface Payment{
	 void makePayment(); 
}
		
	class upi implements Payment{
		
		public void makePayment() {
			
			System.out.println("UPI is four digit pin");
			
		}
		
	}
		
		class creditcard implements Payment{
			
			public void makePayment() {
				System.out.println("Credit Card balance is Zero");
			}
		
	}
	 

public class Question6 {

	public static void main(String[] args) {
		
	Payment ref1=new upi();
	Payment ref2= new creditcard();
	
	ref1.makePayment();
	ref2.makePayment();
	
		
		
		
		

	}

}
