package innerClasses;

public class StaticMethodClass {

	
	int x = 10;
	static int y = 20;
	
	public static void m1() {
		class InnerClass{
			public void nestedMethod() {
				//System.out.println(x); //Cant declare the instance variable inside static method
				System.out.println(y);
			}
			
		}
		
		InnerClass ic = new InnerClass();
		ic.nestedMethod();
		
	}
	
	
	public static void main(String args[]) {
		StaticMethodClass sc = new StaticMethodClass();
		sc.m1();
	}
}
