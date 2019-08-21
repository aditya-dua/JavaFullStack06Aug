package inheritance.heirarchical;

public class RegisteredDiamondCustomer extends RegisteredGoldCustomer{

	int shoppingTime;
	int noOfVisitsRemaining;
	final int total_allowed_visits=10;

	public RegisteredDiamondCustomer() {
		// TODO Auto-generated constructor stub
		shoppingTime=1000;
		noOfVisitsRemaining=50;
		System.out.println("Customer count is:"+customerCount);
	}


	@Override
	public void shopping() {
		// TODO Auto-generated method stub
		super.shopping();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Shopping and visit left are:"+shoppingTime+" "+noOfVisitsRemaining);
	}
	
	
	public void drive(){
		System.out.println("DRIVING and visit left are:"+shoppingTime+" "+noOfVisitsRemaining);

	}


}
