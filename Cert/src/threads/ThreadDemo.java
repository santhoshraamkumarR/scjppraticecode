package threads;

class MyThread extends Thread{
	public void run() {
		System.out.println("No Arg method");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i<=10;i++) {
			System.out.println("Child Thread "+i);
			
		}
	}
	
	public void run(int i) {
		System.out.println("Arg method");
	}
	
}


public class ThreadDemo {

	public static void main(String[] args) {

		MyThread myThread = new MyThread();
		myThread.start();
		myThread.run(10);
		for(int i=0;i<=10;i++) {
			System.out.println("Main Thread "+i);
		}
		
	}

}
