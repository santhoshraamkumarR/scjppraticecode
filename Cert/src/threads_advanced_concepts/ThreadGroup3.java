package threads_advanced_concepts;

class MyThread extends Thread{
	MyThread(ThreadGroup g, String name){
		super(g,name);
	}
	public void run() {
		System.out.println("Child Thread");
		try {
			Thread.sleep(5000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}  
public class ThreadGroup3 {
	public static void main(String[] args) throws InterruptedException {
		ThreadGroup pg = new ThreadGroup("Parent group");
		ThreadGroup cg = new ThreadGroup(pg,"Child group 1");
		ThreadGroup cg1 = new ThreadGroup(pg,"Child group 2");
		MyThread m1 = new MyThread(pg, "Child Thread 1");
		MyThread m2 = new MyThread(pg, "Child Thread 2");
		m1.start();
		m2.start();
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();
		Thread.sleep(7000);
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
	}

}
//Write a program to display all active thread name belongs to System group and 
//its child group.








