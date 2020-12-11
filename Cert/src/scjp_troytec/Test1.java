package scjp_troytec;

public class Test1 extends Thread{
 public static void main(String argv[]){
 Test1 t = new Test1();
 //t.run();
 t.start();
 }
 public void run(){
 System.out.println("run-test");
 }


}
