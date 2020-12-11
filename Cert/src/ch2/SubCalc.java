package ch2;

 class SuperCalc {
 protected   int multiply(int a, int b) { return a * b;}
 }

 public class SubCalc extends SuperCalc{
 public  int multiply(int a, int b) {
 int c = super.multiply(a, b);
 return c; 
 } 

 public static void main(String args[]) {
 SubCalc sc = new SubCalc (); 
 System.out.println(sc.multiply(3,4)); 
 System.out.println(sc.multiply(2,2));
}}
 
 class Blip { 
	  protected int blipvert(int x) { return 0; } 
	  } 
	  class Vert extends Blip { 
		  public int blipvert(int x) { return 0; }
		 // private int blipvert(long x) { return 0; }
		  //protected int blipvert(long x) { return 0; }

		  //private long blipvert(long x) { return 0; }
		  //protected long blipvert(int x, int y) { return 0; }
	  }