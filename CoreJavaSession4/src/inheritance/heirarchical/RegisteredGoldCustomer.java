package inheritance.heirarchical;

public class RegisteredGoldCustomer extends Customer {

	int balanceLeft;
	int playingTimeLeft;
	
	public RegisteredGoldCustomer() {
		// TODO Auto-generated constructor stub
		balanceLeft =1000;
		playingTimeLeft=240;
		System.out.println("RegisteredGoldCustomer + Customer count is:"+customerCount);

		
	}

	public RegisteredGoldCustomer(int balanceLeft, int playingTimeLeft) {
		super();
		this.balanceLeft = balanceLeft;
		this.playingTimeLeft = playingTimeLeft;
	}

	public RegisteredGoldCustomer(int playingTimeLeft) {
		this(10,20);
		this.playingTimeLeft = playingTimeLeft;
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
		System.out.println("Time & Bal left are: "+playingTimeLeft+ " "+balanceLeft);
	}
}
