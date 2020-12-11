package threads;

public class SynchronizedDemo2 {
   public static void main(String[] args) throws InterruptedException {
	Display d1 = new Display(); //Display class is in SynchronizedDemo1
	Display d2 = new Display();
	MyThread1 my1 = new MyThread1(d1, "Dhoni");
	MyThread1 my2 = new MyThread1(d2, "Yuvaraj");
	my1.start();
	my2.start();
}
}

/*
 * 
 * Case study:
 *  In the above main method, the my1 object passes Dhoni as argument, 
 *  my2 object passes Yuvaraj as argument.
 *  
 *  Even though which method is synchronized,we will get Irregular output,bcoz threads are operating
 *  on different Java object(d1,d2). 
 * Conclusion:
 *    
 *  If multiple threads are operating on same java object then synchronization is required.
 *  
 *  If multiple threads are operating on multiple java objects then synchronizaton is not required.
 *  
 *  
 *   Note: There are two types of locks. Class wise lock and Object wise lock.
 *  
 *  If we declare static like the below method then the o/p is regular.
 *  public static synchronized void wish(String name) .
 *  
 *  Reason: It has class level lock. So it executes one by one.
 *  
 *  
 *  
 *  Class level lock:
 *     Every class in java has a unique lock,which is also known as Class level lock. 
 *     If a thread wants to execute  the static  synchronized(),then thread require the class level lock
 *     Once the thread got the class level lock,then it is allowed to execute,any static synchronized method of that class.
 *     Once method execution completes automatically thread release the lock.
 *     
 *     
 *  
 *   
 *   
 *   
 *     While a thread executing static synchronized static method, the remaining threads are not allowed to execute 
 *     any static synchronized method of that class simultaneously, but remaining threads are allowed to execute the following methods
 *     simultaneously.
 *         Normal static methods,
 *         Synchronized instance methods
 *         Normal instance methods
 *     
 *            Sample code:
 *            
 *                class x{
 *                  static sync m1();
 *                  static sync m2();
 *                   static m3();
 *                   sync m4();
 *                   m5();
 *                   }
 *            
 *            
 */

