package threads;

/**
 * 
 *
Yield method causes to pause current executing thread,to give the chance for
waiting threads of same priority,If there is no waiting thread or all waiting threads have
now priority then same thread can continue its execution

Default prototype: public static native void yield()

Q.If multiple threads are waiting with same priority then which waiting thread will get the chance?
  A.We can't expect it depends on Thread Schedular
 *
 *
 **/
class YieldEx extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Child Thread");
			//Thread.currentThread().setPriority(10);
			Thread.yield();
		}
	}
}
public class ThreadYield {
	public static void main(String[] args) {
		YieldEx y = new YieldEx();
		y.start();
		for(int i = 0; i<10;i++) {
			System.out.println("Main Thread");
		}
		
	}
}



