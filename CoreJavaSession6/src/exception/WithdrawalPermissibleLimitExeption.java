package exception;

public class WithdrawalPermissibleLimitExeption  extends Exception{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	int balance;
	int amount;
	

	public WithdrawalPermissibleLimitExeption(int balance, int amount) {
		this("You are trying to withdraw, more than your balance! BAL :"+"BAL :"+balance+" Amount:"+amount);
		this.balance = balance;
		this.amount = amount;
	}

	public WithdrawalPermissibleLimitExeption(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}
	
	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		super.printStackTrace();
		System.err.println("STACK CALLED...");
	}
	
	
	

	

}
