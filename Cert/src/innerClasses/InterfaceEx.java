package innerClasses;

interface Outer1{
	public void m1() ;
	
	interface inner1{
		public void m2();
	}
	
}
public class InterfaceEx implements Outer1,Outer1.inner1{
	public void m1() {
		System.out.println("M1 is implemented alone");
	}
	
	public void m2() {
		System.out.println("M2 is implement with Outer");
	}
public static void main(String[] args) {
	InterfaceEx ex = new InterfaceEx();
	ex.m1();
	ex.m2();
}
}
//In Interface M1 
