package Assignment;

class Employee


{
	private int empID;
	private String empName;
	private float salary;
	

public int getEmpID() {
		return empID;
	}


	public void setEmpID(int empID) {
		this.empID = empID;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}

	
	void displayDetails()
	{
		System.out.println(empID+" "+empName+" "+salary);
	}

}
public class Question1 {
	


	public static void main(String[] args) {
		
		Employee obj=new Employee();
		obj.setEmpID(2128431);
		obj.setEmpName("Satheesh");
		obj.setSalary(28000.75f);
		obj.displayDetails();
		
		

	}

}

