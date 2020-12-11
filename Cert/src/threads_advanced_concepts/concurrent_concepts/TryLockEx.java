package threads_advanced_concepts.concurrent_concepts;

import java.util.concurrent.locks.ReentrantLock;

class MyThrd extends Thread{
	
	static ReentrantLock r = new ReentrantLock();
	MyThrd(String name){
		super(name);
	}
	
	public void run() {
		
		if(r.tryLock()) {
			System.out.println(Thread.currentThread().getName()+"....Got lock and performing "
					+ "same operation");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {e.printStackTrace();}
			r.unlock();
		}else {
		      System.out.println(Thread.currentThread().getName()+".....Unable to get lock"
		      		+ "and hence performing alternative operation");	
		}
	}
	
}
public class TryLockEx {
 public static void main(String[] args) {
	MyThrd t1 = new MyThrd("First thread");
	MyThrd t2 = new MyThrd("Second thread");
	t1.start();
	t2.start();
}
}
