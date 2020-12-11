//https://www.aliensbrain.com/quiz/20/java-oops-quiz-scjp
package javamadesoeasy;

public class Wow {

	public static void go(short n) {System.out.println("short");}
	 public static void go(Short n) {System.out.println("SHORT");}
	 public static void go(Long n) {System.out.println(" LONG");}
	 public static void go(int n) {System.out.println(" int");}

	 public static void main(String [] args) {
	   Short y = 6;
	   int z = 7;
	   go(y);
	   go(z);

	 }
	 
	 
	 
	 enum Levels 
	 {
	      TOP,
	      
	      MEDIUM,
	      
	      BOTTOM;
	 }
	 
}
