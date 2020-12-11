package threads_advanced_concepts;

/*
 * 
 * 
 * 
 * Based on functionality, we can group threads into a single unit which is nothing but thread
 * group. ie Thread group contains a group of threads.
 * 
 * In addition to threads thread group can also contain some thread groups.
 * 
 * The main advantage of maintaining thread in the form of thread group is we can perform common operation
 * very easily.
 * 
 * 
 * Every thread in java belongs to some group.
 * 
 * Main thread belongs to main group.
 * 
 * Every thread group in java is the child group of System group,either directly or indirectly. Hence
 * system group acts as a root of all thread groups in Java.
 * 
 * 
 * System group contains several system level threads. Like 
 *    finalize,
 *    reference handler 
 *    signal dispatcher
 *    attach listener
 * 
 * 
 * 
 * Thread group is a java class present in Java.lang package and it is the direct child class
 * of object.
 * 
 * Constructors:
 *          1. ThreadGroup g1 = new ThreadGroup(String groupName);
 * 
 *  Creates a new thread group with a specified group name.
 *  
 *  The parent of this new group is ThreadGroup of currently executing thread.
 *  
 *  
 *          2. ThreadGroup g2 = new ThreadGroup(ThreadGroup g, String groupName);
 *          
 *   Creates a new thread group with a specified group name.
 *   The parent of this  new thread group is specified parent group     
 *       
 *       format:
 *       ThreadGroup g2 = new ThreadGroup(g1,"Second group");
 * 
 * 
 * Important methods of Thread group class:
 *            1.String getName(): 
 *                       It returns name of the Thread group.
 *                
 *            2. int getMaxPriority():
 *                         Returns max priority of the thread group.
 *                
 *            3. void setMaxPriority(int p):
 *                          To set maximum priority of the thread group. 
 *                          
 *                           The default max priority is 10.
 *                           
 *                           Threads in the thread group that already have higher priority wont be
 *                           affected. But newly added threads,this max priority is applicable.
 *                              Ex:
 *                                      Thread t1 = new Thread(g1,"Thread 1");
										Thread t2 = new Thread(g1,"Thread 2");
										g1.setMaxPriority(2);
										Thread t3 = new Thread(g1,"Thread 3");
										System.out.println("T1: "+t1.getPriority());
										System.out.println("T2: "+t2.getPriority());
										System.out.println("T3: "+t3.getPriority());
										
			                          o/p: T1: 5
										   T2: 5
										   T3: 2	
				
				4. ThreadGroup getParent():
				           Returns parent group of current thread.
				           
				5. void list():
				            It prints the information about the Thread Group to the console.
				            
				6. int activeCount():
				             Returns number of active threads present in the thread group.
				             
                7. int activeGroupCount():
                             It returns number of active groups present in the current thread
                             group.
                             
                             				                                    					   
			    8. int enumerate(Thread[] t):
			                To copy all active threads of this group into provided thread array
			                In this case sub thread group threads also considered.
			               
                9. int enumerate(ThreadGroup[] g):
                             To copy all active sub thread groups into thread group array. 
                             
                10. boolean isDaemon():                   						   
						To check whether thread group is daemon or not.
				
	            11. void setDaemon(boolean b):
	                      To change the daemon nature of the thread group.        
	             
	            12. void interrupt:
			            To interrupt all waiting/sleeping threads present in the thread group.
 *                            
 *              13. void destroy():
 *                         To destroy the Thread groups and its sub thread group.     
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
 * 
 * 
 */
public class ThreadGroups {

	 
	public static void main(String[] args) {
		//System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		
		ThreadGroup g1 = new ThreadGroup("First group");
		System.out.println("First thread group"+ g1.getParent().getName());
		
		ThreadGroup g2 = new ThreadGroup(g1,"Second group");
		System.out.println("Parent of"+g2.getParent().getName());
		
		Thread t1 = new Thread(g1,"Thread 1");
		Thread t2 = new Thread(g1,"Thread 2");
		g1.setMaxPriority(2);
		Thread t3 = new Thread(g1,"Thread 3");
		System.out.println("T1: "+t1.getPriority());
		System.out.println("T2: "+t2.getPriority());
		System.out.println("T3: "+t3.getPriority());
		
		
		
	}
}
