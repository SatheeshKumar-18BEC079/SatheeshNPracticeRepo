package Assignment;

class school2
{
  String name;
  String address;
  int strength;
  
  school2(String name,String address)
  {
	  this.name=name;
	  this.address=address;
  }
  school2(String name,String address,int strength)
  {
	  this(name,address);
	  this.strength=strength;
  }
  
  void display()
  {
	  System.out.println("School details: " + name+ ",  "+address+" ,  "+strength);
  }
  
}

public class Question26 {

	public static void main(String[] args) {
		
		school2 obj=new school2("Bharathi school","Mulanur",1240);
		obj.display();
		
		school2 obj1=new school2("Model School","Vadavalli, Coimbatore",1500);
		obj1.display();
		

	}

}