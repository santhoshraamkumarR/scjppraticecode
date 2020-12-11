package threads_advanced_concepts.concurrent_concepts;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * 
 * Thread pools:
 *        Creating a new thread for every job may create performance and memory problem. To
 *        overcome this,we should go for thread pool.
 *        
 *        Thread pool is a pool of already created threads,ready to do our job.
 *        
 *        Java 1.5 version,introduces,thread pool framework,to implement thread pools.
 *        
 *        Thread pool framework also known as Executor framework.
 *        
 *        
 *        We can create a thread pool as follows:
 *           ExecutorService ser = Executors.newFixedThreadPool(3);
 *        
 *        we can submit a runnable job by using submit method.
 *               service.submit(object);
 *               
 *        We can shutdown executor service,by using shutdown method:
 *                  service.shutdown();       
 *               
 *               
 *               
 *               In the below example 3 threads are example to execute 6 jobs. So that
 *               a single thread can be re used for multiple jobs.
 *               
 *               
 *               While designing/developing web or application servers,we can use Thread
 *               pool concept. 
 *               
 *               Default pool size is: 60 for maximum server.
 * 
 * 
 * 
 * 
 * 
 */


class PrintJob implements Runnable{


	String name;

	PrintJob(String name){
		this.name = name;
	}

	public void run() {
		System.out.println(name+ ".....Thread job completed by"+Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		}catch(Exception e) {}
		System.out.println(name+" ...... completed by"+Thread.currentThread().getName());
	}


}
public class ExecutorFramework1 {
	public static void main(String[] args) {
		PrintJob[] p = {new PrintJob("Anand"),
				new PrintJob("Vel"),
				new PrintJob("San"),
				new PrintJob("Velu"),
				new PrintJob("Anil"),
				new PrintJob("Shyam"),
		};

		ExecutorService ser = Executors.newFixedThreadPool(5);
		for(PrintJob job:p) {
			ser.submit(job);

		}
		ser.shutdown();
	}
}
