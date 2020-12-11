package threads;


//Default prototype: public   final void setPriority(int priority)
class MyThreadPriority extends Thread{

	public void run() {
		//for(int i=0;i<2;i++)
		System.out.println("Child thread");
	}
	
}

public class ThreadPriorities {

	
	public static void main(String[] args) {
		MyThreadPriority my = new MyThreadPriority();
		//my.setPriority(10);
		my.start();
		//ThreadPriorities tp = new ThreadPriorities();
		//Thread.currentThread().setPriority(10);
		for(int i = 0;i<5;i++) {
		System.out.println("Main Thread");
		}
	}
}

