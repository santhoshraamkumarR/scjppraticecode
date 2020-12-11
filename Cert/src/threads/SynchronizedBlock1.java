package threads;


class DisplayEx{
	public   void wish(String name) {
		//synchronized(DisplayEx.class) ->Regular o/p: my1.start() or my2.start() -->Completes first
		synchronized(this)//-->//Irregular or mixed o/p: my1.start() and my2.start() executes simultaneously
		{//synchronized block 
		for(int i=0;i<=5;i++) {
			System.out.print("Good Morning: ");
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {System.out.println("");}
		System.out.println(name);
		}
		} //synchronized block
	}
}

/* Lock concept applicable for object types and class types,but not for primitives,hence we cant pass
primitive type as argument to synchronized block. Otherwise we will get compile time error saying
unexpected type: found int
required:reference
*/
class DisplayEx1{
	public   void wish(String name) {
int x = 10; 
//synchronized (x) //Not possible ->Compile time error
		synchronized(this)//-->//Irregular or mixed o/p: my1.start() and my2.start() executes simultaneously
		{//synchronized block 
		for(int i=0;i<=5;i++) {
			System.out.print("Good Morning: ");
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {System.out.println("");}
		System.out.println(name);
		}
		} //synchronized block
	}
}



public class SynchronizedBlock1 {
 //Remaining things are as same as SynchronizedDemo1.class
}


/**
 * What is synchronized keyword,where we can apply?.
 *   apply for the methods or blocks.
 * 
 * advantage
 *     avoid data inconsistency problem.
 *     
 *  Disadvantage:
 *      Increase waiting time of the object and creates performance problem.
 * 
 * Race condition
 *         If a multiple threads are operating simultaneously on same object on data and
 *         then there may be chance of data consistency pblm. it is called the race condition.
 *         We can overcome this problem, by using synchronized keyword.
 *         
 *         
 * Object lock and Required?
 *          If we declare the method as synchronized then it is called Object lock
 *    
 * Class level lock?
 *           declared as static synchronized method,then it is called class level lock.
 *           
 *  While a thread executing a  synchronized method on the given object is the remaining thread are allowed
 *  to execute,any other synchronized method simultaneosly on the same object?
 *   No           
 *         
 *         
 *         
 *         
 *         
 *         
 *         
 * 
 */




