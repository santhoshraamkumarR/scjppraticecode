package threads;

/*
 * 1.Two threads can communicate with each other by using wait(),notify() and notifyAll() methods. The thread
 * which is expecting updation is responsible to call wait() method,then immediately the thread will entered
 * into waiting state.
 * 
 * The thread which is responsible to perform updation,after perfoming updation it is responsible to call
 * notify() method,then the waiting thread will get that notification and continue its execution with those
 * updated items.
 * 
 * 
 * 2. wait(), notify() and notifyAll(), present in object class,but not in thread class bcoz, thread can call these methods on any java 
 * object.
 * 
 * 3.IllegaMonitorStateException:   
 *        To call wait,notify or notifyAll methods on any object,thread should be owner of that object,that is
 *        the thread should has lock of that object.(ie) the thread should be inside synchronized area.
 *        Hence we can call wait,notify and notifyAll methods only from synchronized area,otherwise we will
 *        get RuntimeException saying IllegaMonitorStateException.
 *        
 *        
 * 4. If a thread calls wait() method on any object,it immediately releases the lock of that particular object
 *   and entered into waiting state.
 *   
 *    If a thread calls notify() method on any object,it releases the lock of the object,but may not immediately
 *    except wait,notify and notifyAll() there is no other method where thread releases the lock.
 *    
 *    
 *    
 *    Which of the following is valid?
 *        1.If a thread calls wait() method, immediately it will entered into waiting state,without releasing 
 *        the any lock - Invalid.
 *        
 *        2.If the thread calls wait() method, it release the lock of that object,but may not immediately - Invalid
 *        
 *        3. If the  calls wait() on any object,it releases all locks acquired by thread and immediately
 *        entered into waiting state -- Invalid
 *        
 *        4. If the thread calls wait() method on any object,it immediately release  the lock of the particular
 *        object and entered into waiting state -- Valid
 *        
 *        5. If the thread calls notify method on any object,it immediately releases the lock of that particular
 *        object -- Invalid
 *         
 *        6. If the thread calls the notify method on any object,it released the lock of the object but 
 *        may not immediately - Valid.
 *        
 *        
 *     Default prototype:
 *               public  final  void wait() throws InterruptedException
 *               public final native void wait(long milliSeconds) throws InterruptedException
 *               public final void wait(long milliseconds,int nanoseconds) throws InterruptedException
 *               
 *               public final native void  notify();
 *               public final native void notifyAll();
 *        
 *        
 *        Every wait method throws Interrupted exception (Checked exception). Hence whenever we are using,we should handle
 *        the Interrupted Exception. Either by try/catch or by throws keyword. Otherwise we get the compile
 *        time error.
 *        
 *        
 *  
 *    
 *   
 *              
 *              
 *   
 * 
 * 
 */


public class InterThreadEx1 {

}
