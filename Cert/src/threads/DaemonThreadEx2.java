package threads;


class MyThreadDaemon extends Thread{
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread");
			try {
				Thread.sleep(2000);
			}catch(IllegalStateException | InterruptedException e) {}
		}
	}
}
public class DaemonThreadEx2 {
 public static void main(String[] args) {
	 MyThreadDaemon t = new MyThreadDaemon();
	 t.setDaemon(true); 
	 
	 /*Whenever the main thread terminates,automatically the child thread
	 will be terminated. In this case the o/p is 
	  End of Main Thread followed by  Child Thread or
	 Child Thread followed by  Main Thread
	 System.out.println("End of Main Thread");
	 */
	 
	 
	 t.start();
}
}
