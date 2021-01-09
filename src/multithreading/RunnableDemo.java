package multithreading;

public class RunnableDemo implements Runnable {
	@Override
	public void run() {
		System.out.println("Inside run method "+Thread.currentThread());
		
	}

	public static void main(String[] args) {
		RunnableDemo rd=new RunnableDemo();
		Thread thread=new Thread(rd);
		thread.start();
	}

	
}
