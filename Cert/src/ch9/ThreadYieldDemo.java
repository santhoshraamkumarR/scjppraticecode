package ch9;

class MyThreadss extends Thread{
	
	public void run() {
		for(int i = 0; i < 5; i++) {
			Thread.yield();
			System.out.println("Child Thread" +getName()+getId());
		}
	}
}


public class ThreadYieldDemo {

	public static void main(String[] args) {
        MyThreadss thread = new MyThreadss();
        thread.start();
        for(int i = 0; i<=5;i++) {
        	System.out.println("Main Thread "+thread.getName());
        }
		
		
	}

}
