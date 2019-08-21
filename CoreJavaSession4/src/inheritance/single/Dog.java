package inheritance.single;

public class Dog extends Animal{
	
	String color;
	String group;
	boolean isPuppy;

	
	public Dog() {
		// TODO Auto-generated constructor stub
		super();
		hasTail = true;
	}
	public void bark(){
		System.out.println("BHOO BHOO.........");	
	}
	
	
	
	public Dog(String color, String group, boolean isPuppy) {
		super(4,true,false,"Cordgi");
		this.color = color;
		this.group = group;
		this.isPuppy = isPuppy;
	}
	public void doTricks(){
		System.out.println("Dog is doing tricks.");
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Dog's color is: "+color);

	}
	
	
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Dog is Walking");
	}
	
	public void wagTail() throws ArithmeticException {
		// TODO Auto-generated method stub
		super.wagTail();
		System.out.println("Dog is Wagging his tail");
	}
	
	
	
	
	
}
