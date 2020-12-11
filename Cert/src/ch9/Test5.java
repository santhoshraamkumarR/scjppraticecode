package ch9;

public class Test5 extends Thread{
	private int x; 
	public  void foo() { synchronized(this) {
		int current = x; 
		x = current + 1; 
		
		System.out.print(x + ", "); }
	}
	public void go() { 
		for(int i = 0; i < 5; i++) { 
			new Thread() { 
				public void run() { 
					foo(); 
				} }.start(); 
		}
	}
	public static void main(String args[]) {
		Test5 t5 = new Test5();
		 t5.start();

	}
}