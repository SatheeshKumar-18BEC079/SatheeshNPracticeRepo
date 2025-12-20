package Assignment;

class Camera{
	void capture() {
		
		System.out.println("The picture captured in phone was nice");
		
	}
}
class DSLcamera extends Camera{
	void capture() {
		System.out.println("The DSLcamera price is high");
	}
}

public class Question19 {

	public static void main(String[] args) {
		
		Camera obj=new Camera();
		obj.capture();
		
		DSLcamera obj1=new DSLcamera();
		obj1.capture();

	}

}
