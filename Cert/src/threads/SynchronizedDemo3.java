package threads;
/* Is thread can occur multiple locks?
 * Yes, of course from different object
 *  class X{
 *  
 *    public synchronized void m1(){
 *         //Thread has a lock of object x
 *       Y y = new Y();
 *              
 *       
 *       synchronized(y){
 *       
 *          Here thread has a lock of object x and y.
 *         Z z = new Z();
 *         
 *         Here thread has a lock of object x,y and z.
 *         
 *         synchronized(z){
 *         
 *         }
 *       }
 *    
 *    }
 *   }
 * 
 * 
 * What is synchronized statement?
 *            Interview people created terminology (As per java spec,there is no such terminology).
 *              The statements present in synchronized method and synchronized block  are called synchronized
 *             statements.
 *             
 *             
 *            
 * 
 */
class DisplayEx2{

	public synchronized void m1() {
		for(int i=0;i<10;i++) {
			System.out.print(i);
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {}
		}
	}

	public synchronized void m2() {
		for(int i=65;i<75;i++) {
			System.out.print((char)i);
			try {
				Thread.sleep(5000);
			}catch(InterruptedException e) {}
		}
	}
}




class MyThread11 extends Thread{
	DisplayEx2 d;
	MyThread t1;

	public MyThread11(DisplayEx2 d) {
		this.d=d;
	}

	public void run() {
		d.m1();
	}
}


class MyThread12 extends Thread{
	DisplayEx2 d;

	public MyThread12(DisplayEx2 d) {
		this.d=d;
	}

	public void run() {
		d.m2();
	}

}
public class SynchronizedDemo3 {
	public static void main(String[] args) {
		DisplayEx2 d2 = new DisplayEx2();
		MyThread11 m1 = new MyThread11(d2);
		MyThread12 m2 = new MyThread12(d2);
		m1.start();
		m2.start();
	}
}
