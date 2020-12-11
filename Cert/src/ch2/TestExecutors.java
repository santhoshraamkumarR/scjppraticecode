package ch2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable{
	private String name;
	
	public Task(String name) {this.name = name;}
	
	public void run() {
		try {
			for(int i=0;i<5;i++) {
				if(i==0) {
					Date date = new Date();
					SimpleDateFormat sdf = new SimpleDateFormat("HH:MM:SS");
					System.out.println("Initialization Time for task name   "+ name + " "+sdf.format(date));
					
					
				}else {
					Date date = new Date();
					SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
					System.out.println("Executing Time for task name - "+" "+name+" "+sdf.format(date));
				}Thread.sleep(2000);
			}System.out.println(name+" Complete");
			
		}catch(Exception e) {
			e.printStackTrace();
			
			
		}
	}
}

public class TestExecutors {

	public static void main(String[] args) {
    
		Runnable r1 = new Task("r1");
		Runnable r2 = new Task("r2");
		Runnable r3 = new Task("r3");
		Runnable r4 = new Task("r4");
		Runnable r5 = new Task("r5");
		
		ExecutorService e = Executors.newFixedThreadPool(5);
		e.execute(r1);
		e.execute(r2);
		e.execute(r3);
		e.execute(r4);
		e.execute(r5);
		e.shutdown();
		
	}

}
