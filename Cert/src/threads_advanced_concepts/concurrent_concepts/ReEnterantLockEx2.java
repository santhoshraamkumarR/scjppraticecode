package threads_advanced_concepts.concurrent_concepts;

import java.util.concurrent.locks.ReentrantLock;

/*  1. If we comment line 1  and line 2, then the threads will be executed simultaneously and
 *      we will get irregular o/p.
 *      
 *  2. If we uncomment the line 1 and line 2, then the threads will be executed one by one
 *      and we will get regular o/p.
 * 
 *    Demo program for trylock() method:
 * 
 * 
 * 
 */
class Display{
	ReentrantLock l = new ReentrantLock();
	
	public void wish(String name) {
		l.lock(); // Line 1
		for(int i=0;i<5;i++) {
			System.out.print("Good Morning: ");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name);
		}l.unlock(); // Line 2
	}
}

class MyThread extends Thread{
	String name;
	Display d;
	
	MyThread(Display d,String name){
		this.d = d;
		this.name = name;
	}
	
	public void run() {
		d.wish(name);
	}
	
	 
}
public class ReEnterantLockEx2 {
 public static void main(String[] args) {
	Display d = new Display();
	MyThread t1 = new MyThread(d, "Dhoni");
	MyThread t2 = new MyThread(d, "Yuvaraj");
	MyThread t3 = new MyThread(d, "Kohli");
	t1.start();
	t2.start();
	t3.start();
}
}
