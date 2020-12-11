package scjp_troytec;

public class Thread4 extends Thread {
	private int x=2;
	public static void main(String args[]) throws Exception{
		new Thread4().makeItSo();
	}
	
	public Thread4() {
		x=15;
		start();
	}
	
	
	public void makeItSo() throws Exception{
	    join();
		x=x-1;
		System.out.println(x);
	}

	
	public void run() {

		System.out.println("x value before "+x);
		x*=2;
		System.out.println("x value after "+x);
	}
}
