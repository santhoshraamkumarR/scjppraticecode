package threads;

/*
 *  How a thread can interrupt another thread? 
 *
 * A thread can interrupt a sleeping thread or waiting thread by using interrupt method of
 * the thread class.
 * 
 *  public void interrupt();
 *  
 *  
 */
class ThreadInterrupt extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("I am lazy thread");
			try {
				Thread.sleep(5000);
			}catch(InterruptedException e) {
                    System.out.println("I got interrupted");
			 }
		}
	}
}
public class ThreadInterruptionEx {
 public static void main(String[] args) {
	ThreadInterrupt t = new ThreadInterrupt();
	t.start();
	//t.interrupt();
}
}
