package multithreading;

public class MyRunnableThread implements Runnable {
	public static int count=0;
	public MyRunnableThread() {
		
	}
	public void run() {
		while(MyRunnableThread.count<=10) {
			try {
				System.out.println("Expl Thread:"+(++MyRunnableThread.count));
				Thread.sleep(100);
			}catch(InterruptedException e){
				System.out.println("Exception in thread"+e.getMessage());
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Starting main Thread");
		MyRunnableThread mrt=new MyRunnableThread();
		Thread t=new Thread(mrt);
		t.start();
		while(MyRunnableThread.count<=10) {
			try {
				System.out.println("Main Thread"+(++MyRunnableThread.count));
				Thread.sleep(100);
			}catch(InterruptedException e) {
				System.out.println("Exception in thread "+ e.getMessage());
			}
		}
		System.out.println("End  of main thread");
	}

}
