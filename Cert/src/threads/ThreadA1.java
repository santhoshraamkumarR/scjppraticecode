package threads;

public class ThreadA1 {
  public static void main(String[] args) throws InterruptedException {
	ThreadB t = new ThreadB();
	t.start();
	synchronized (t) {
		System.out.println("Main thread trying to call wait method: ");
		t.wait();
		System.out.println("Main thread got notification");
		System.out.println(t.total);
	}
	
}
}

class ThreadB extends Thread{
	int total = 0;
	public void run() {
		synchronized(this) {
			System.out.println("Child thread starts calculation");
		for(int i=0;i<=100;i++) {
			total = total+i;
		 }
		System.out.println("Child thread trying to give notification");
		this.notify();
		}
	}
}
