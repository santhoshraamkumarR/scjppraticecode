package scjp_troytec;

public class Test2 {
public static void main(String... args) {
 A a = new A();
	 Thread t = new Thread(a);
		 t.setName("good");
		 t.start();
 }
		 }


class A implements Runnable{
public void run(){
System.out.println(Thread.currentThread().getName());
}
}

