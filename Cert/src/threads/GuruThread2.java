package threads;

class MyThreadEX1 extends Thread{
	
	Thread newThread;
	private String name;
	public MyThreadEX1(String name) {
        this.name = name;
	}
	
	public void run() {
		 System.out.println("Name of the Thread is "+name);
	}
	public void start() {
		  System.out.println("Thread started");
		  if (newThread == null) {
			  newThread = new Thread(this, name);
			  newThread.start();
		  }
		 
		 }
}
public class GuruThread2 {
    public static void main(String[] args) {
    	MyThreadEX1 ex1 = new MyThreadEX1("Thread - 1");
    	MyThreadEX1 ex2 = new MyThreadEX1("Thread - 2");
    	ex1.start();
    	ex2.start();
	}
}
