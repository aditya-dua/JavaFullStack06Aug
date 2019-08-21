package inheritance.single;

public  class Animal {

	int noOfLegs;
	boolean hasTail;
	boolean hasFurr;
	String breed;
	
	public Animal() {
		super(); // 
		// TODO Auto-generated constructor stub
	}

	public Animal(int noOfLegs, boolean hasTail, boolean hasFurr, String breed) {
		super();
		this.noOfLegs = noOfLegs;
		this.hasTail = hasTail;
		this.hasFurr = hasFurr;
		this.breed = breed;
	}
	
	//public abstract void move();
	
	public void display(){		
		System.out.println("Animal has "+noOfLegs+"legs and the breed "+breed);
	}
	
	public void wagTail() throws ArithmeticException{
		System.out.println(10/0);
	}
	
	
}
