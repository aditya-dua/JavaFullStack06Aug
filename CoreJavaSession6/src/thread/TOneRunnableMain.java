package thread;

public class TOneRunnableMain {

	public static void main(String[] args) {
		
		ThreadOne t1R=new ThreadOne("TEST-RUNNABLE-THREAD");
		Thread t1 = new Thread(t1R);
		t1.start();
		
		
		
		
	}
}
