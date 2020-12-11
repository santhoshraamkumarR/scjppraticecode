package threads;


class Sample extends Thread{
	public void start() {
		 super.start();
		System.out.println("Start  thread");
	}
	
	public void run() {
		System.out.println("Run Method");
	}
	
}
public class ThreadDemo1 {
 public static void main(String[] args) {
	Sample sample = new Sample();
	sample.start();
	//sample.run();
	System.out.println("Main Method");
	 
}	

}
