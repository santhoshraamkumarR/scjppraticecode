package threads;
/*
 * calling main thread in Child class
 * 
 */

class ThreadJoin2 extends Thread{
	static Thread myThread;
	public void run() {
		try {
			myThread.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread "+i);
		}
	}
}

public class ThreadJoinEX2 {
	public static void main(String[] args) throws InterruptedException {
		ThreadJoin2.myThread =Thread.currentThread(); //Assigning main thread to child thread object
		ThreadJoin2 t = new ThreadJoin2();
        t.start();
        //t.join();
        /**
         * if we uncomment the above line then both parent and child thread gets hanged and it is 
         * like the Dead lock.
         */
       
        for(int i=0;i<10;i++) {
        	System.out.println("Main Thread");
              try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        }

	}
}
