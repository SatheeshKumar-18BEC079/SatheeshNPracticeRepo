package Assignment;

class Device{
	void start() {
		System.out.println("Device are good");
	}
}

class Mobile extends Device{
	void calling() {
		System.out.println("Mobile phone is working fine");
	}
}
class SmartPhone extends Mobile{
	void internet() {
		System.out.println("Smart phone are not good");
	}
}
public class Question13 {

	public static void main(String[] args) {
		
		SmartPhone obj=new SmartPhone();
		obj.internet();
		obj.calling();
		obj.start();
		

	}

}
