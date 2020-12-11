package ch9;

public class Letters {

	private String name; 
	 public Letters(String name) { this.name = name; } 
	 public void write() { 
	 System.out.print(name); 
	 System.out.print(name); 
	 } 
	 public void run() { synchronized(Letters.class) { write(); } }

	 public static void main(String[] args) {
		// Thread t = new Thread(new Letters("x"));
		 
	 new Letters("X"); 
	 new Letters("Y"); 
	 } 

}
