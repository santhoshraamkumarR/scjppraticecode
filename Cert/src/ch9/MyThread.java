package ch9;

public class MyThread extends Thread{

	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Child Thread");
		}
	}
	
	
	public void start() {
		super.start();
		System.out.println("start method");
	}
}
