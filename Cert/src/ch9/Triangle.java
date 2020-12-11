package ch9;

public class Triangle implements Runnable {

	 void go() throws Exception { 
		 Thread t = new Thread(new Triangle());
		 t.start(); 
		 for(int x = 1; x < 100000; x++) { 
		 //insert code here 
			 Thread.yield();
		 if(x%100 == 0) System.out.print("g"); 
		 } } 
		 public void run() { 
		 try { 
		 for(int x = 1; x < 100000; x++) { 
		 // insert the same code here 
			 Thread.sleep(1);
		 if(x%100 == 0) System.out.print("t"); 
		 }
		 } catch (Exception e) { } 
		}

	
	public static void main(String[] args) throws Exception {
    Triangle t = new Triangle();
   t.go();
	}

}
