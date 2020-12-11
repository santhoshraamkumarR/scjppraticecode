package threads_advanced_concepts.concurrent_concepts;


/*
 * 
 * Thread local class provides,thread local variables. 
 * Thread local class maintains value per thread basis.
 * Each thread local object maintains a separate value like userID,transactionID..... for each
 * thread that access  a object.
 * Thread can access its local value,can manipulate its value and even can remove its value
 * In every part of the code,which is executed by the thread,we can access its local variable.
 * Ex:
 *  Consider a servlet,which invokes some business methods,we have a requirement to generate a
 *  unique transactionID for each and every request and we have to pass this transaction ID,to the
 *  business methods,for this requirement we can use ThreadLocal, to maintain a separate transactionID
 *  for every request,ie for every thread.
 *  
 *  Note:
 *   Thread local class introduced in 1.2v and enhanced in 1.5v.
 *   Thread local can be associated with Thread scope.
 *   Total code which is executed by thread has access to the corresponding local variables. 
 *   A thread can access, its own local variables and can't access other threads local variables.
 *   Once the thread entered into the Dead state,all its local variable are default eligible
 *   for GC.
 * 
 * 
 * Constructor:
 * 
 *   ThreadLocal t = new ThreadLocal();
 *   
 *    It creates a thread local variable.
 * 
 *  Methods:
 *    
 *    1. Object get():
 *        Returns the value of the Thread local variable,associated with current thread.
 *     
 *    2. Object initalValue():    
 *        Returns initial value of thread local variable,associates with current thread.
 *        The default implementation of this method returns null. To customize our own initial
 *        value we have to override this method.
 *    
 *    
 *           
 *    
 *    3. void set(Object newValue);
 *          To set a new value
 *          
 *          
 *    4. void remove():
 *           To remove the value of thread local variable associated with current thread.
 *           It is newly added method in 1.5V.
 *           After removal,if we are trying to access,it will be reinitialized once again
 *           by invoking its initial value method.
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
 * 
 */
public class ThreadLocalEx {
	public static void main(String[] args) {
		ThreadLocal t1 = new ThreadLocal() {
			//Overriding the initial value method.
			public  Object initialValue() {
				 return "abc";
			 }
		};
		System.out.println(t1.get());
		t1.set("Test");
		System.out.println(t1.get());
		t1.remove();
		System.out.println(t1.get());
	}
}
