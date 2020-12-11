package scjp_troytec;

public class Thread3 implements Runnable{
	
	public void run() {
	}
	
	void waitForSignal() {
		Object obj=new Object();
		synchronized(Thread.currentThread()) {
			try {
				obj.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			obj.notify();
		}
	}

	public static void main(String[] args) {
		Thread3 t3=new Thread3();
		t3.waitForSignal();
		
		
	}

}
