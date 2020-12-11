package ch2;

class Clidders { 
	 public   void flipper() { 
	 System.out.println("Clidder"); 
	 }
	} 

	public class Clidlets extends Clidders { 
	 public void flipper() { 
	  System.out.println("Flip a Clidlet"); 
	  super.flipper(); 
	 } 
	public static void main(String [] args) { 
	   new Clidlets().flipper(); 
	} 
	}
