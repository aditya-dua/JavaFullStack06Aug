package example.calculator;

public class Difference extends Calculator implements ICalculate{

	//int i,j;
	

	public Difference(int i, int j) {
		super(i, j);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		System.out.println("The Difference Of A & B is "+(i-j));
	}
	
	
}
