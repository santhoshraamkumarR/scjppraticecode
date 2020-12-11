package threads_advanced_concepts.concurrent_concepts;

/*
 * The problems with the traditional synchronized keyword.
 *   1. we are not having any flexibility to try for a lock without waiting.
 *   
 *   2. There is no way to specify the maximum waiting time for a thread to get a
 *   lock,so that thread will wait until getting the lock,which may create performance
 *   problem,which may cause deadlock.
 *   
 *   3. If a thread release the lock,then which waiting thread will get that lock,we 
 *   are not having any control on this.
 *   
 *   4. There is no API to list out all waiting thread for a lock.
 *   
 *   
 *   5. Synchronized keyword compulsory to use either method level or within a method.
 *  and it is not possible to use across multiple methods.
 *  
 *   
 *   To overcome the above problems sun people introduced:
 *             concurrent package (java.util.concurrent.locks) in 1.5 Version.
 *             
 *             
 *  
 *  It also provides several enhancement to the programer to provide more control
 *  on concurrency.
 *  
 *  
 *  Lock interface:
 *          Lock object is similar to implicit lock acquired by a thread,to execute
 *          synchronized method or block.
 *          
 *          Lock implementation provide more extensive operations than traditional 
 *          implicit locks.
 *          
 *          
 *    Important methods of lock interface:
 *        1. void lock():
 *                    We can use this method to acquired a lock. If lock is 
 *        already available,then immediately current thread will get that lock. 
 *        If the lock is not already available then it will wait until getting the lock.
 *        It is exactly same behaviour of traditional synchronized keyword.
 *        
 *          
 *        2.boolean tryLock();
 *          To acquire the lock without waiting. If the lock is available,then the thread
 *          acquires the lock and returns true. If the lock is not available  this method
 *          return false and can continue its execution without waiting. In this case
 *          thread never be entered into waiting state.    
 *                          if(l.tryLock()){
 *                          perform same operation;
 *                          }else{
 *                          perform alternative operation;
 *                          }
 *                         
 *   
 *   
 *        3. boolean tryLock(long time,TimeUnit u):
 *                 If lock is available then the thread will get the lock and continue
 *                 its execution.
 *                 
 *                 If the lock is not available then the thread will wait,until specified
 *                 amount of time,still if the lock is not available,then the thread can
 *                 continue its execution.
 *                 
 *                 TimeUnit: 
 *                      It is an Enum,present in java.util.concurrent package.
 *                      
 *                      enum TimeUnit{
 *                      NANOSECONDS,MICROSECONDS,MILLISECONDS,SECONDS,MINUTES,HOURS,
 *                      DAYS;
 *                      }
 *                      
 *                      if(l.tryLock(1000,TimeUnit.MILLISECONDS)){
 *                          perform same operation;
 *                          }else{
 *                          perform alternative operation;
 *                          }
 *                      
 * 
 * 
 *        4. void lockInterruptbly():
 *                   Acquires the lock,if it is available and returns immediately.
 *                   If the lock is not available then it will wait,while waiting the
 *                   thread is interrupted,then the thread wont get the lock.
 *                   
 *                   
 *        5. void unlock():
 *                  To call this method,compulsory current thread should be owner of the 
 *                  lock,otherwise we will get runtime exception saying 
 *                       IllegalMonitorStateException();
 *                       
 *                       
 *                       
 *                       
 *                 
 * 
 */
public class ConcurrentEx1 {

}
