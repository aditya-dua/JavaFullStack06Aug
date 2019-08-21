package thread;

public class ThreadOdd extends Thread {

	
	volatile int a;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		for(int i=1;i<100;i+=2){
			System.out.println("THREAD ODD "+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
