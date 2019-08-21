package example.calculator;

public class Add extends Calculator implements ICalculate,IDisplay{

	int sum;
	
	public Add(int i, int j) {
		super(i, j);
		// TODO Auto-generated constructor stub
		
		
	}

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		sum = i+j;
		System.out.println("The Sum Of A & B is "+(i+j));
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Sum of A,B is:"+sum);
	}
	
	
	
	
}
