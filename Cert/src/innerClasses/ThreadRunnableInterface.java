package innerClasses;

public class ThreadRunnableInterface {
 
	
	public static void main(String[] args) {
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
 			        for(int i =0; i<=25;i++) {
 			        	System.out.println("Child Thread");
 			        }
			}
		};
	          Thread t = new Thread(r);
	          t.start();
	          for(int i=0;i<15;i++) {
	        	  System.out.println("Main Thread starts");
	          }
	          
	          //ThreadRunnableInterface ti = new ThreadRunnableInterface();
	          
	          
	}
	
	
	
}
