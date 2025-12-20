package Assignment;

class Product{
	
	int productID;
	String productName;
	int price;
	
	Product(){
		System.out.println("Product Created");
	}
	
	Product(int a,String b, int c){
		
		productID = a;
		productName =b;
		price = c;
	}
		
		void displayProduct() 
		{
			System.out.println(productID+" "+productName+" "+price);
		}
	}
	


public class Question3 {

	public static void main(String[] args) {
		
		Product obj=new Product();
		Product obj1 = new Product(1234,"Shampoo",43);
		obj1.displayProduct();
		
		

	}

}
