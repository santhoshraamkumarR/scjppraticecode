package threads;
/**
 * If a thread wants to wait until completing some other thread,then we should go for join() method.
 * For example if a thread t1 wants to wait until completing t2,then t1 has to call t2.join().
 * If t1 executes t2.join(),then immediately t1 will be entered into waiting state,until t2 completes.
 * Once t2 completes then t1 can continue its execution.
 * 
 *  All are overloaded methods:
         Default prototype: 1. public  final void join() throws InteruptedException;
                            2. public  final void join(long milliseconds)throws InteruptedException;
                            3. public  final void join(long milliseconds,int nanoseconds) throws InteruptedException;
                        May have a chance for  InteruptedException. It is a checked Exception.
 * 
 */

class ThreadJoin extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}

public class ThreadJoinEx {
	public static void main(String[] args) {
		ThreadJoin t = new ThreadJoin();
		t.start();
		try {
		t.join(10000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=0;i<10;i++)
		System.out.println("Main Thread");
		
	}

}
