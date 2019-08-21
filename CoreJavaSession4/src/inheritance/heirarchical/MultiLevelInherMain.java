package inheritance.heirarchical;

public class MultiLevelInherMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer c = new Customer("Aditya", "1234567890");
		RegisteredGoldCustomer gc = new RegisteredGoldCustomer();
		RegisteredDiamondCustomer dc = new RegisteredDiamondCustomer();
		
		//c.display();
		//gc.display();
		//dc.shopping();
		
		//dc.display();
		
		Customer cus = new RegisteredGoldCustomer();
		//RegisteredDiamondCustomer cus1 = new Customer();
		
		//cus.display();
		// Since the compiler is unaware, run time.
		cus.drive();
	}

}
