package thread;

public class ThreadEven extends Thread{

	public ThreadEven() {
		// TODO Auto-generated constructor stub
		this.setPriority(MAX_PRIORITY);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		try {
			Thread.sleep(20);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for(int i=2;i<=100;i+=2){
			
			System.out.println("THREAD EVEN "+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
}
