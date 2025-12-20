package Assignment;

abstract class Employee78
{
	
	
	abstract void calculateSalary();

	void employeeDetails()
	{
		System.out.println("The Salary details of Employee is displayed");
	}

}

class FullTimeEmployee extends Employee78
{
	int Rate;
	float hours;
	FullTimeEmployee(int Rate,float hours)
	{
		this.Rate=Rate;
		this.hours=hours;
	}
	void calculateSalary()
	{
		float FTE=Rate * hours;
		System.out.println("The salary of Full time Employee is "+FTE);
	}
}

class PartTimeEmployee extends Employee78
{
	int Rate;
	float hours;
	int x=200;
	
	PartTimeEmployee(int Rate,float hours)
	{
		this.Rate=Rate;
		this.hours=hours;
	}
	void calculateSalary()
	{
		float PTE=Rate * hours/x;
		System.out.println("The salary of Part time Employee is "+PTE);
	}
}


public class Question17 {

	public static void main(String[] args) {
		
		FullTimeEmployee obj1=new FullTimeEmployee(2000,6.5f);
		obj1.employeeDetails();
		obj1.calculateSalary();
		
		PartTimeEmployee obj2=new PartTimeEmployee(3000,9.30f);
		obj2.calculateSalary();
		

	}

}