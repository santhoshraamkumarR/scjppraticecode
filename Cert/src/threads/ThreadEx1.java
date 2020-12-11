package threads;
/*
 * In this exercise we will create a simple counting thread. It will count to 100, pausing
one second between each number. Also, in keeping with the counting theme, it will
output a string every ten numbers.
 * 
 * 
 */

class ThreadCount extends Thread{
	public void run() {
		for(int i=1;i<=100;i++) {
			System.out.print(i+" ");
			try {
				Thread.sleep(1000);
				
				if(i%10==0) {
					System.out.println("Hey" );
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
	}
}
public class ThreadEx1 {
	public static void main(String args[]) {
		ThreadCount tc = new ThreadCount();
		tc.start();
	}
	

}
