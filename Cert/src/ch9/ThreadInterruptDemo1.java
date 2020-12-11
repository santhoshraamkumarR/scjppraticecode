package ch9;
class ThreadInterruptDemo extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("I am lazy thread");
		}
		System.out.println("I am entered into a thread again");
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			//e.printStackTrace();
			System.out.println("i got interrupted");
	
		}
	}
}
public class ThreadInterruptDemo1 {

	public static void main(String[] args) {
		ThreadInterruptDemo td = new ThreadInterruptDemo();
		td.start();
		//td.interrupt();
		System.out.println("End of thread");
	}

}
