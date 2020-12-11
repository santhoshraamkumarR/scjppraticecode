//https://howtodoinjava.com/java/keywords/java-synchronized/
package threads;

class Samp {

	synchronized void printNumbers(int n) throws InterruptedException 
	{
		//synchronized (this) {
			for(int i=1;i<=n;i++) {
				System.out.println(Thread.currentThread().getName()+": "+i);
				Thread.sleep(5000);
			}
		//}

	}

}

class Samp1 extends Thread{
	Samp s;
	int n;
	Samp1(Samp s,int n){
		this.s = s;
		this.n = n;
	}
	
	public  void run() {
		try {
			s.printNumbers(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class MathClass {
	public static void main(String[] args) throws InterruptedException {
		Samp s = new Samp();
		  Samp1 s1 = new Samp1(s, 3);
		  Samp1 s2 = new Samp1(s, 3);
		  s1.start();		  
		  s2.start();
		  
//		Runnable r = new Runnable() {
//			@Override
//			public void run() {
//				try {
//					s.printNumbers(3);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//
//			}
//		};

		/*new Thread(r,"One").start();
		new Thread(r,"Two").start();*/
	}
}
