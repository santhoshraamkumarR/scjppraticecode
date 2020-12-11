package ch8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WorkerThread implements Runnable{
	public String command;
	public WorkerThread(String command) {
		this.command = command;
	}

 
	public void run() {
		System.out.println("Thread name before "+Thread.currentThread().getName());
		processCommand();
		System.out.println("Thread name after "+Thread.currentThread().getName());
	}

	public void processCommand() {
		try {
				Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public String toString() {
		return this.command;
	}
	
	
	public static void main(String[] args) {
		ExecutorService e = Executors.newFixedThreadPool(5);
		for(int i=0;i<10;i++) {
		Runnable  w = new WorkerThread(" "+i);
		e.execute(w);
		}
		e.shutdown();while(!e.isTerminated()) {};
		System.out.println("Terminated");
		
		
	}        

	
	
 }
