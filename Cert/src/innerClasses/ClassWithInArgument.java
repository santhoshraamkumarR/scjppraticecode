package innerClasses;

public class ClassWithInArgument {
 public static void main(String[] args) {
	new Thread(new Runnable() {

		 public void run() {
			 for(int i=0;i<10;i++) {
				 System.out.println("Test");
			 }
		 }
	
	}).start();
	
	for(int i=0;i<25;i++) {
		System.out.println( "Main Thread");
	}
}
}
