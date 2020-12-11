package threads_advanced_concepts.concurrent_concepts;
/*
 * 
 * 
 * Thread Local Vs Inheritance:
 *       1. Parent Threads thread local variable by default not available to the child thread.
 *       If we want to make parent threads thread local variable value,available to the child 
 *       thread,then we should go for Inheritable thread local class.
 *       
 *       2. By default child thread value is exactly same as parent threads value. But we can
 *       provide customized value for child thread by overriding child value method.
 *       
 *       Constructor:
 *          InheritableThreadLocal tl = new InheritableThreadLocal();
 *          
 *        Methods:
 *           InheritableThreadLocal is the child class of thread local and hence all
 *           methods present in thread local by default available to InheritableThreadLocal
 *           
 *             In addition to these methods,it contains only one methods.
 *               public object childValue(Object ParentValue){}
 *       
 *       
 * In the below program,if we replace InheritableThreadLocal with ThreadLocal and if 
 * we are not overriding child value method,then the output is null.
 * 
 * In this program, if we are maintaining the Inheritable Thread local and we are not 
 * overriding child value 
 *  
 *  then    Parent Value: Parent
            Child value: Parent
            
            or 
            
            Parent Value: Parent
            Child value: CC

 * 
 * 
 * 
 * 
 * 
 * 
 */
class ParentThread extends Thread{
//	static ThreadLocal tl = new ThreadLocal<>();
	static InheritableThreadLocal  tl = new InheritableThreadLocal() {
		public Object childValue(Object p) {
			return "CC";
		}
	};
	public void run() {
		
		tl.set("Parent");
		System.out.println("Parent Value: "+tl.get());
		ChildThread ct = new ChildThread();
		ct.start();
	}
}

class ChildThread extends Thread{
	
	public void run() {
		
		System.out.println("Child value: "+ParentThread.tl.get());
	}
}
public class ThreadLocalEx3 {
 public static void main(String[] args) {
	ParentThread t = new ParentThread();
	t.start();
}
}
