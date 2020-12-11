package scjp_troytec;

public class Threads2 implements Runnable{
	public void run() {
		System.out.println("Run. ");
		//throw new RuntimeException("Poblem ");
	}



	public static void main(String[] args) {
		Thread t=new Thread(new Threads2());
		t.start();
		System.out.println("End of Method ");
	}

}
