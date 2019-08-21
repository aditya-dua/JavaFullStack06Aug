package thread;

public class ThreadOne implements Runnable{

	String name;
	
	public ThreadOne(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Hello");
		
	}
	

}
