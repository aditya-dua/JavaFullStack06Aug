package inheritance.heirarchical;

public class Customer {

	String name;
	String phoneNumber;
	static int customerCount;
	
	
	public Customer() {
		// TODO Auto-generated constructor stub
		//customerCount++;
	}
	
	// Typical use of constructors....
	
	
	public Customer(String name, String phoneNumber) {
		this();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}	
	public Customer(char[] name, String phoneNumber) {
		this(name.toString(),phoneNumber);
	}
	public void shopping(){	
		System.out.println("Thanks for shopping with us....");
	}
	
	protected void playing(){
		System.out.println("Thanks for Playing with us....");
	}
	
	public void display(){
		System.out.println("Name is:"+name+" Phone Number :"+phoneNumber);
		
	}
	
	public void drive(){
		System.out.println("Drivinggg...");
	}
}
