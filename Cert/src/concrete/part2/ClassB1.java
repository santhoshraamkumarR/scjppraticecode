package concrete.part2;

public class ClassB1 extends A11{
	  public static String print() {
		  return "b";
	  }
	  public static void main(String[] args) {
		  ClassB1 b = new ClassB1();
		  A11 a = new ClassB1();
		  System.out.println(b.print() + " " + a.print());
	 }
	}
	class A11 {
		public static String print() { 
			return "a"; 
		} 
	} 