package thread;

public class ThreadEvenOddMain {

	public static void main(String[] args) {
		
		ThreadOdd to = new ThreadOdd();
		to.start();
		
		
		
		ThreadEven te= new ThreadEven();
		te.start();
		
		//te.run();
		System.out.println("Thread Name is:"+te.getName() + te.getId());
		System.out.println("Thread Priority is:"+te.getPriority());

		to.stop();
	}
}

