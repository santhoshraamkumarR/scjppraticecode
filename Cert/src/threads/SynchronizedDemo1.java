package threads;

class Display{
	public  synchronized void wish(String name) {
		for(int i=0;i<=5;i++) {
			System.out.print("Good Morning: ");
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {System.out.println("");}
		System.out.println(name);
		}
	}
}

class MyThread1 extends Thread{
	
	Display d;
	String name;
	
	MyThread1(Display d,String name){
		this.d=d;
		this.name=name;
	}
	
	public void run() {
		d.wish(name);
	}
	
}
public class SynchronizedDemo1 {
   public static void main(String[] args) throws InterruptedException {
	Display d1 = new Display();
	MyThread1 my1 = new MyThread1(d1, "Dhoni");
	MyThread1 my2 = new MyThread1(d1, "Yuvaraj");
	my1.start();
	//my1.join();
	my2.start();
	//my2.join();
}
}
/**
 * 
 * If a very lines of code required synchronization,then its not recommended to declare entire
 * method as sync,we have to enclose those few lines of code by using synchronized block.
 * 
 * The main advantage of sync block over sync method,it reduces the waiting time of threads
and improves the performance of the appln.

 We can declare the sync block as follows.
   1. To get a lock of current object.
         If a thread gets lock of current object,then only it is allowed to execute this Area.
                synchronized(this){}
   
   2. To get a lock of particular object of b.
         synchronized(b){}
         
         
  3. To get a class level lock:
               
               If a thread got class level  lock of display class,then only it is allowed to execute
               this area.
               synchronized(Display.class){}
                      
   
   
   
   
   
   
   
   



T


*/