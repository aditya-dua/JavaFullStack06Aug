package thread;

public class HelloWorldThread extends Thread{

	
	String name;
	int time;
	
	public HelloWorldThread(String name,int time) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.time = time;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		System.out.println("Hello World Using Thread.....");
		print();
	}
		
	private synchronized void print(){

		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<10;i++){
			System.out.println(" Thread "+this.name+i);

		}
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		//super.destroy();
	}
	
	
}
