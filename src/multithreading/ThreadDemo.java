package multithreading;

public class ThreadDemo extends Thread {
	@Override
	public void run() {
		System.out.println("Inside run method "+Thread.currentThread());
	}
	public static void main(String[] args) {
		System.out.println("Active count: "+Thread.activeCount()+" "+Thread.currentThread());
		
		ThreadDemo td=new ThreadDemo();
		td.setPriority(10);
		td.setName("ThreadDemo");
		td.start();
		System.out.println("Active count: "+Thread.activeCount());

	}

}
