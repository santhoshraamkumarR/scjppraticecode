package threads;

/*
 * 
 * 
 * 
 *  1. Diff b/w notify and notifyAll()?
 *         We can use notify method,to give the notification for only one waiting thread. If
 *       multiple threads are waiting,then only one thread will be notify and the remaining threads
 *       have to wait for further notification.
 *       
 *  2. Which thread will be notify()?
 *         We can't expect which thread will be notify(),it depends on JVM.
 *  
 *  3. We can use notifyAll() to give the notification for all waiting threads of the partcular
 *   object,eventhough multiple threads notify but execution will be performed one by one
 *   bcoz,threads required lock and only one lock is available.
 *   
 *  
 *  
 *  
 *  Note:
 *      On which object we are calling waiting method,thread required lock of that 
 *      particular object. 
 *      For Ex: 
 *             If we are calling wait() method on s1,then we have to get lock of s1 object,but 
 *             not on s2 object.
 *             
 *             
 *             
 * 
 * 
 * 
 * 
 * 
 */
public class NotifyAllEx {

}
