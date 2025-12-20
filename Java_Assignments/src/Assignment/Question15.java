package Assignment;

class LoanCalculator{
	
	int calculateLoan(int amount) {
		return amount;
		
	}
	
	double calculateLoan(int amount, double interestRate) {
		return amount*(interestRate/100);
		
	}
}

public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoanCalculator obj=new LoanCalculator();
		System.out.println("Loan amount is"+ obj.calculateLoan(235456));
		System.out.println("Interest amount of Loan is"+obj.calculateLoan(235456, 5.9076));

	}

}
