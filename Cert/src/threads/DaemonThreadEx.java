package threads;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

/**
 * 
 *  
 * 
 * @author santhosh
 * 
 * Daemon Threads:
 *           The thread which are  executing in the background are called Daemon threads
 *            Ex:
 *            1.GC,2.Attach Listener and 3.Signal Dispatcher 
 *            
 *            The main objective of Daemon thread is to provide support for non-daemon
 *            threads(Main thread).
 *             For Ex: 
 *                  If a main thread runs with low memory,then JVM runs GC to destroy 
 *                  useless objects,so that no of bytes of free memory will be 
 *                  improved,with these free memory,main thread can continue with
 *                  execution.
 *                  
 *                  Usually the daemon thread having low priority,but based on our
 *                  requirement,the daemon threads can run with high priority also.
 *                  
 *                  We can check daemon nature of a thread by using 
 *                    isDaemon() method of the thread class
 *                     public boolean isDaemon(){}
 *                   
 *                   We can change daemon nature  of a  thread by using setDaemon()
 *                   public void set setDaemon(boolean b).
 *                   
 *                   
 *                   But Changing daemon nature is possible before starting 
 *                   of a thread only.
 *                   
 *                   After starting a thread, if we trying to change the daemon
 *                   nature then we will get Runtime Exception saying 
 *                    IllegalThread state exception.
 *                    
 *                    
 *         Default nature of the thread:
 *                By default the main thread is always non daemon. And all remaining thread
 *                daemon nature will be inherited from parent to child. ie If the parent
 *                thread is daemon then automatically the child thread is also daemon.
 *                
 *                And If the parent thread is non daemon,then automatically the child 
 *                thread is also non daemon.
 *                
 *                
 *                It is impossible to change the daemon nature of main thread,because
 *                which is already started by JVM at the beginning
 *                
 *                
 *                whenever last non daemon threads terminates, automatically all daemon 
 *                threads will be terminated,irrespective of their position.
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

class MyThreadd extends Thread{}
public class DaemonThreadEx {

	public static void main(String[] args) {
		System.out.println("The  main thread is: "+Thread.currentThread().isDaemon());
		//Thread.currentThread().setDaemon(true); //raises IllegalStateException Run time exception 
	 
		MyThreadd t = new MyThreadd();
		
		System.out.println("The  child thread is: "+t.currentThread().isDaemon());
		t.setDaemon(true);
		System.out.println("After set the value as daemon:  "+t.isDaemon());
	
	}
}
