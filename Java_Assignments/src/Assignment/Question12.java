package Assignment;

class Account{
	
	private String accountHolderName;
	private double balance;
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
		if(balance<0) {
			System.out.println("Negative values are not valid");
		}
	}
	
}


public class Question12 {

	public static void main(String[] args) {
		
		Account obj= new Account();
		obj.setAccountHolderName("Satheesh");
		obj.setBalance(-255);
		
		Account obj1= new Account();
		obj1.setAccountHolderName("Satheesh");
		obj1.setBalance(4327);
		

	}

}
