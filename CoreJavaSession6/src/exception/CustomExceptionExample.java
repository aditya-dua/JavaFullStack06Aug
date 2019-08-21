package exception;

public class CustomExceptionExample {

	public static void main(String[] args) throws WithdrawalPermissibleLimitExeption {
		
		int bal,amount;
		
		bal=1000;
		amount=5000;
		
		if(bal-amount<0){
			throw new WithdrawalPermissibleLimitExeption(bal,amount);
		}
		
		StringBuilder s= new StringBuilder("Aditya");
		display(s.toString());
	}
	
	public static void display(String msg){
		System.out.println("Message is"+msg);
	}
}
