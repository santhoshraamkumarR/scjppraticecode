//https://www.guru99.com/multithreading-java.html
package threads;

class ThreadExm1 implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
		System.out.print("Hello  ");
		}
		System.out.println();
	}
}

class ThreadExm2 implements Runnable{
	
	public void run() {
		for(int i=0;i<10;i++) {
		System.out.print("Good ");
		
		}
		System.out.println();
	}
}


class ThreadExm3 implements Runnable{
	
	public void run() {
		for(int i=0;i<10;i++) {
		System.out.print("Morning ");
		}
		System.out.println();
	}
}

 

public class GuruThread1{
	public static void main(String[] args) {
		ThreadExm1 ex1 = new ThreadExm1();
		ThreadExm2 ex2 = new ThreadExm2();
		ThreadExm3 ex3 = new ThreadExm3();
		Thread t1 = new Thread(ex1);
		t1.start();
		System.out.println("T1 Name: "+t1.getName());
		Thread t2 = new Thread(ex2);
		t2.start();
		System.out.println("T2 Name: "+t2.getName());
		Thread t3 = new Thread(ex3);
		t3.start();
		System.out.println("T3 Name: "+t3.getName());
	 
	 
	}
}
