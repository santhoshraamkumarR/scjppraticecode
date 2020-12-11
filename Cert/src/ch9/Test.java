package ch9;

public class Test {
	public synchronized static void main(String[] args) throws InterruptedException {
		Thread t=new Thread();
		t.start();
		System.out.print("X ");
		synchronized(t) {
			t.wait(100);
		}System.out.print("Y");
	}
}
