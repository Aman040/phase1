package multithreading;

public class Mythread extends Thread{
	public void run() {
		System.out.println("Concurrent thread running");
	}

	public static void main(String[] args) {
		Mythread mt=new Mythread();
		mt.start();

	}

}
