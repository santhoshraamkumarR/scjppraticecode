package ch9;

public class Threads2 implements Runnable {

	public void run() { System.out.println("run.");
	throw new RuntimeException("Problem");
	}
	public static void main(String[] args) {
		
		TestSeven t1 =new TestSeven();
		t1.doThings();
	}
}




class TestSeven extends Thread { 
	  private static int x; 
	  public synchronized void doThings() { 
	  int current = x; 
	  current++; 
	  x = current; 
	  } 
	  public void run() { 
	  doThings(); 
	  } 
	 }
	 