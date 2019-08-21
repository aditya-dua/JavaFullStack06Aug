package thread;

public class ThreadTwo extends Thread {

	int sum;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (this) {
			for(int i=0;i<100;i++){

				if(i==50) notify();
				else{sum+=i;}
			}
			//notify();
		}
		

	}

}
