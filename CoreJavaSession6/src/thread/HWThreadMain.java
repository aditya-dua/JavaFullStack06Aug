package thread;

public class HWThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HelloWorldThread hwT=new HelloWorldThread("T1 ",2000);
		hwT.start();
		
		System.out.println("Main THREAD...");
		
		
		print();
		
		
		HelloWorldThread hwt3= new HelloWorldThread("T2 ",3000);
		hwt3.start();
		
		for(int i=0;i<10;i++){
			System.out.println("2 Main THREAD..."+i);

		}
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(hwT.isAlive());
	}
	
	public static synchronized void print(){
		for(int i=0;i<10;i++){
			System.out.println("1 Main THREAD..."+i);

		}
	}

}
