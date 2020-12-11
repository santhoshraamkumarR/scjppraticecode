package threads;


class RunnableEx implements Runnable{
	public void run() {
//		for(int i = 0; i<=5;i++) {
//			System.out.println("Child thread " +i);
//		}
		System.out.println("Executed by child: "+Thread.currentThread().getName());
		System.out.println("Child Class: "+Thread.currentThread().getPriority());
	}
}

public class RunnableExample {
 public static void main(String[] args) {
	RunnableEx ex = new RunnableEx();
	Thread t = new Thread(ex);
	t.start();
	t.currentThread().setName("Test Thread");
	System.out.println("Executed by: "+Thread.currentThread().getName());
	System.out.println(""+Thread.currentThread().getPriority());
	Thread.currentThread().setPriority(10);
	System.out.println("Set Priority "+Thread.currentThread().getPriority());
	//ex.run(); //No new thread will be created and RunnableEx run() method will be 
	            //executed like normal method call
}
}
