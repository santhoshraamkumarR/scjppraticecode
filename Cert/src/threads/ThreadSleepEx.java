package threads;


/**
 * If a thread dnt want to perform any operation for a particular amount of time,then we should go for 
 * sleep method.
 * 
 * Default prototype: public static native void sleep(long milliseconds) throws InterruptedException;
 *                    public static void sleep(long milliseconds,int nanoseconds)throws InterruptedException;
 *                    
 *                There may be a chance of interrupted Exception,checked Exception
 * 
 */



public class ThreadSleepEx {
 public static void main(String args[]) {
	 for(int i=0;i<10;i++) {
		 System.out.println("Slide - "+i);
		 try {
		 Thread.sleep(5000);
		 }catch(InterruptedException e) {
			 e.printStackTrace();
		 }
	 }
 }
}


//

