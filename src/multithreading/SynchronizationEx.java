package multithreading;
import java.util.*;
import java.io.*;
	class Sender{
		public void send(String msg) {
			System.out.println("Sending \t"+msg);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println("Thread Interrupted");
			}
			System.out.println("\n"+msg +" Sent");
		}
	}
	class ThreadedSend extends Thread{
		private String msg;
		private Thread t;
		Sender sender;
		public ThreadedSend(String m,Sender obj) {
			msg=m;
			sender=obj;
		}
		public void run() {
			synchronized(sender) {
				sender.send(msg);
			}
		}
	}
	public class SynchronizationEx{
	
	public static void main(String[] args) {
		Sender snd=new Sender();
		ThreadedSend ts=new ThreadedSend("Hi", snd);
		ThreadedSend ts2=new ThreadedSend("Bye", snd);
		ts.start();
		ts2.start();
	
	}
	}

	
