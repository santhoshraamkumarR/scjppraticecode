package threads_advanced_concepts.concurrent_concepts;
/*
 * Callable and Future:
 *  
 *   In the case of runnable job,thread wont return anything after completing the job. If a
 *   thread is required to return some result,after execution then we should go for callable.
 *   Callable interface contains only one method call();
 *    
 *        public object call() throws Exception{}
 *        
 *    If we submit the callable object to executor,then after completing the job,thread return 
 *    object of the type Future. i.e  Future object is used to retrieve the result from callable
 *    job.
 *    
 *    
 *    
 *    Difference between Runnable and Callable:
 *    
 *    If a thread is not required to return anything after completing the job then we should
 *    go for Runnable.
 *    
 *    If a thread required to return,something after completing the job,then we should go
 *    for Callable.
 *    
 *    
 *    Runnable interface contains only one method run()
 *    Callable interface contains only one method call().
 *    
 *    Runnable job not required to return anything and hence return type of run method is void.
 *    Callable job is required to return something and hence return type of call method is object.
 *    
 *    Within Run method if there is rising checked Exception,compulsory we should handle by using
 *    try/catch. We cant use throws keyword for run method,
 *    
 *    Inside call method if there is raising checked exception,we are not try/catch, The call method
 *    throws Exception
 *    
 *    
 *    Runnable interface present in Java.lang package and introduced 1.0 version
 *    Callable interfacepa present in java.util.concurrent  and introduced in  1.5 version
 *    
 *    
 *        
 *        
 *   
 * 
 */

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyCallable implements Callable{
	
	int num;
	MyCallable(int num){
		this.num = num;
		
	}
	
	public Object call() throws Exception{
		System.out.println(Thread.currentThread().getName()+""
				+ " is the responsible to "+num+" numbers");
		
		int sum = 0;
		
		for(int i =0;i<=num;i++) {
			sum+=i;
		}return sum;
	}
	
}
public class CallableInterfaceEx {
 public static void main(String[] args) throws InterruptedException, ExecutionException {
	MyCallable[] c = {new MyCallable(10),new MyCallable(20),new MyCallable(30),
			new MyCallable(40),new MyCallable(50),new MyCallable(60)};
	ExecutorService s = Executors.newFixedThreadPool(3);
	for(MyCallable call:c) {
		Future f = s.submit(call);
		System.out.println(f.get());
	}s.shutdown();
	
}
}
