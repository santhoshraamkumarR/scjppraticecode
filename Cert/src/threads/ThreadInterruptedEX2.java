package threads;
/*
 *  Whenever we are calling interrupt() method,If the target thread not in sleeping/waiting state then there is
 *  no impact of Interrupt call immediately. Interrupt call will be waited until target thread entered into
 *  sleeping/waiting state.
 *  
 *  If the target thread entered into sleeping/waiting state then immediately interrupt call will interrupt the
 *  target thread.
 *   
 *  If the target thread never entered into sleeping/waiting state in its lifetime then there is no impact of
 *  interrupt call. This is the only case where interrupt call will be wasted.
 *  
 *   
 * 
 */
class ThreadInterruptedex extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("I am Lazy "+i);
		}
		System.out.println("I am entering into Sleep mode");
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {System.out.println("Thread got interrupted");}
	}
}

public class ThreadInterruptedEX2 {
	public static void main(String[] args) {
		ThreadInterruptedex ex = new ThreadInterruptedex();
		ex.start();
		ex.interrupt();
		System.out.println("Main Thread");
	}
}



/*
 * 
 * Synchronized is the modifier applicable only for methods and blocks,but not for classes and variables.
 * 
 * If multiple threads are trying to operate simultaneously on the same java object,then there may be a chance
 * of inconsistency problem. To overcome this problem we should go for synchronized keyword.
 * 
 * If a method/blocked declared as synchronized then at a time only one thread allowed to execute that method
 * or block given object,so that Data inconsistency problem will be resolved.
 * 
 * Main advantage of synchronized keyword we can resolve data inconsistency problem,but the main disadvantage of synchronized keyword 
 * is, it increases the waiting time of threads and creates performance problems. Hence if there is no specific
 * requirement,then it is not recommended to use the synchronized keyword
 *  
 *  
 *  
 *  
 *  Internally synchronization concept is implemented by using LOCK.
 *  
 *  Every object in Java has unique lock.
 *  
 *  Whenever we are using synchronized keyword,then only the LOCK concept will come into the application(Picture).
 *  
 *  If a Thread wants to execute synchronized method on the given object,first it has to get lock of that
 *  object. Once thread got the lock then its allowed to execute any synchronized method on that object.
 *  
 *  Once the method execution completes automatically thread release the lock.
 * 
 *  Acquiring/Releasing the lock internally takes care by JVM and program not responsible for this activity.
 *  
 *  While a thread executing on the given object the remaining threads are not allowed to execute in a 
 *  Synchronized method simultaneously on the same object. But remaining threads are allowed to execute the
 *  non synchronized methods simultaneously.
 *  
 *  class x{
 *  
 *    synchronized m1(){}
 *    Synchronized m2() {}
 *    m3();
 *    
 *    }
 *    
 *    If t1 starts of execute m1() ,if t2 executes of m1() (Waiting state) then t3 executes of m2 ()(Waiting method)
 *    and t4 starts of execute m4(), it will get a chance of m4 method.
 *    
 *    Lock concept is implemented based on object,but not based on method.
 *    Usage:
 *    Where ever we are performing the update operation (add/remove/delete/replace) then we need to 
 *    use the Synchronized.
 *     
 *    Non Synchronized:
 *        Wherever object wont be changed we use the non synchronized.
 *        
 *        
 *  
 *  
 *  
 *  
 * 




*/
