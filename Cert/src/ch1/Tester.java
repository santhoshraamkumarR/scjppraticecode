package ch1;

class Pingpong2{
	synchronized void hit(long n) {
		for(int i=1;i<3;i++) {
			System.out.print(n+"-"+i+" ");
		}
	}
}

public class Tester implements Runnable{
static Pingpong2 ping = new Pingpong2();
	public static void main(String[] args) {
   new Thread(new Tester()).start();
   new Thread(new Tester()).start();
	}
	public void run() {
		ping.hit(Thread.currentThread().getId());
	}

}
