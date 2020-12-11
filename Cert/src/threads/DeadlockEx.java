package threads;


/**
 *  
 * 
 * @author santhosh
 * 
 * Deadlock:
 *        If two threads are waiting,for each other forever such type of infinite waiting is
 *        called Deadlock.
 *        Synchronized keyword is the only reason for Deadlock situation. Hence while using 
 *        synchronize we have to be very careful.
 *        There are no resolution technique for available,but prevention technique are available.
 *         
 *        In the below program,if we remove at least one synchronized keyword,the program wont enter
 *        into Deadlock.
 *        
 *        The synchronized keyword is the only reason for Deadlock situation. Due to this while using
 *        synchronized keyword,we have to take special care.
 *        
 *        Deadlock Vs Starvation:
 *              Long waiting of a thread where waiting never ends is called Deadlock.
 *              Whereas long waiting of a thread where waiting ends yet at a certain point is
 *              called Starvation.
 *              For Ex:
 *                  Low priority thread has to wait until completing all high priority 
 *                  threads,It may be long waiting,but ends yet certain point is called
 *                  which is nothing but starvation.
 *
 */
class A{
	 
	
	public  synchronized void d1(B b) {
		System.out.println("Thread starts d1() execution");
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {}
		   System.out.println("Thread trying to call B's last method");
		b.last();
	}
	
	
	public synchronized void last() {
		System.out.println("Inside A's class,last method");
	}
}



class B{
	
	public synchronized  void d2(A a) {
		System.out.println("Thread B starts execution of d2() method");
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {}
		System.out.println("Thread B try to call A's last() method ");
		a.last();
	}
	  public  void last() {
		System.out.println("Inside B's class last() method");
	  }
}



public class DeadlockEx extends Thread {
	A a = new A();
	B b = new B();
	
	
	public void m1() {
	    this.start();
		b.d2(a);
	}
	
	
	public void run() {
		a.d1(b);
	}

	public static void main(String[] args) {
		DeadlockEx ex1 = new DeadlockEx();
		ex1.m1();
	}
}
