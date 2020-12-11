package threads_advanced_concepts.concurrent_concepts;
/*
 * 
 * In this program,for every thread can maintain a separate customer id maintained by
 * thread local object
 */
class CustomerThread extends Thread{
	static Integer custId = 0;
	
	static ThreadLocal t1 = new ThreadLocal() {
		public Integer initialValue() {
			return ++custId;
		}
		
	};
	public CustomerThread(String name) {
		super(name);
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName()+"Executing with "
				+ "the Thread name: "+t1.get());
	}
	
	
}
public class ThreadLocalEx2 {
  public static void main(String[] args) {
	CustomerThread c1 = new CustomerThread("Customer 1");
	CustomerThread c2 = new CustomerThread("Customer 2");
	CustomerThread c3 = new CustomerThread("Customer 3");
	CustomerThread c4 = new CustomerThread("Customer 4");
	 c1.start();
	 c2.start();
	 c3.start();
	 c4.start();
	
}
}
