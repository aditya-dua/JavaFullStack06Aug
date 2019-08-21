package example.calculator;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Add add = new Add(1000,150);
		
		
		// Performing Some Calculation
		
		add.calculate();
		add.display();
		
		Difference diff = new Difference(10,5);
		diff.calculate();
	}

}
