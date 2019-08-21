package thread;

public class ThreadSyncMain {

	public static void main(String[] args) {

		ThreadTwo t2=new ThreadTwo();
		t2.start();

		synchronized (t2) {

			try {
				System.out.println("Waiting for thread to complete its execution...");
				t2.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Sum of first 100 numbers is:"+t2.sum);
		}
	}
}
