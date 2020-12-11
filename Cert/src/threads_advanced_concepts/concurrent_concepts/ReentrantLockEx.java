package threads_advanced_concepts.concurrent_concepts;

/*
 * 
 * 
 * It is the  implementation class of lock interface and it is the direct child class of
 * object.  
 * 
 * Reentrant means a thread can acquire same lock multiple times without any issue.
 * 
 * Internally reentrant lock increments threads personal count,whenever we call lock() methods 
 * and decrements the count value,whenever thread calls unlock() method. And the lock will
 * be released when the count become zero.
 * 
 * 
 * Constructors:
 *   1.ReenterantLock l = new ReenterantLock();
 *   
 *         creates an instance of reentrant lock.
 *     
 *   2.ReenterantLock l = new ReenterantLock(boolean fairness);
 *          Creates an reentrant lock with the given fairness policy.
 *          If the fairness is true,then the longest waiting thread can acquire the lock,
 *          if it is availabgle,ie it follows 
 *          First come first serve(FCFS) policy,
 *          
 *          If fairness is false,then which waiting thread will get the chance we cant
 *          expect.
 *          
 *          
 *          The default value for fairness is false.
 *          
 *          
 *          Which of the following declarations are equal?
 *             Ex:
 *                ReennterantLock l = new ReenterantLock();
 *                Reenterantlock l = new Reenterantlock(true);
 *                Reenterantlock l = new Reenterantlock(false);
 *                All the above first and third one are equal.
 *                
 *                
 *                
 *          Important methods of reenterant lock :      
 *                
 *              1.void lock():
 *              
 *              2.boolean tryLock():
 *              
 *              3.boolean tryLock(long l,TimeOut l):
 *              
 *              4.void lockInterruptbly():
 *              
 *              5.void unlock():
 *              
 *              6.int getHoldCount():
 *              
 *                  Returns no of holds on this lock by current thread,
 *                  
 *              
 *              7.boolean isHeldByCurrentThread():
 *              
 *                   Returns true if and only if lock is hold by current thread.
 *              
 *              8.int getQueueLength():
 *                    
 *                    Returns no of thread waiting for the lock.
 *                    
 *              9.Collection getQueuedThreads():
 *                      
 *                      It returns the collection of threads,which are waiting to get
 *                      the lock.
 *                      
 *             10. boolean hasQueuedThreads():
 *                   
 *                       Returns true,if any thread waiting to get the lock.
 *                       
 *             11. boolean isLocked():
 *                       
 *                       Returns true, if the lock is acquired by some thread.
 *            
 *             12. boolean isFair():
 *                      
 *                      Returns true, if the fairness policy set with true value.
 *                    
 *             14. Thread getOwner():
 *                        
 *                        Returns the thread which acquires the lock.
 *                                            
 *              
 * 
 */

import java.util.concurrent.locks.*;

public class ReentrantLockEx {

	public static void main(String[] args) {
		ReentrantLock l = new ReentrantLock();
		l.lock();
		l.lock();
		System.out.println(l.isLocked());
		System.out.println(l.isHeldByCurrentThread());
		System.out.println(l.getQueueLength());
		l.unlock();
		System.out.println(l.isLocked());
		l.unlock();
		System.out.println(l.isLocked());
		System.out.println(l.getHoldCount());
		System.out.println(l.isFair());
		
	}
	
	
}
