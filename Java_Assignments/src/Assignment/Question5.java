package Assignment;

abstract class Animal{
	abstract void sound();
}
	class Dog extends Animal {
		void sound() {
			
			System.out.println("Dog barks");
			
		}
	}
	
	class cat extends Animal {
		void sound() {
			System.out.println("Cat Meows");
		}
	}
	
		



public class Question5 {

	public static void main(String[] args) {
		
	Dog obj=new Dog();
	obj.sound();
	
	cat obj1=new cat();
	obj1.sound();
	
		
		

	}

}
