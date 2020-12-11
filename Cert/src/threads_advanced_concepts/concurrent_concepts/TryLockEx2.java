package threads_advanced_concepts.concurrent_concepts;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class MyThrd1 extends Thread{
	
	static ReentrantLock r = new ReentrantLock();
	MyThrd1(String name){
		super(name);
	}
	
	public void run() {
		do {
			
		
		try {
			if(r.tryLock(5000,TimeUnit.MILLISECONDS)) {
				System.out.println(Thread.currentThread().getName()+"....Got lock and performing "
						+ "same operation");
					Thread.sleep(20000);
				      r .unlock();
				      System.out.println(Thread.currentThread().getName()+" Releases the lock ");
				      break;
			}
			else {
			      System.out.println(Thread.currentThread().getName()+"...Unable to get lock"
			      		+ "and hence performing alternative operation");	
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}while(true);
	}
	
}
public class TryLockEx2 {
 public static void main(String[] args) {
	MyThrd1 t1 = new MyThrd1("First thread");
	MyThrd1 t2 = new MyThrd1("Second thread");
	t1.start();
	t2.start();
}
}
