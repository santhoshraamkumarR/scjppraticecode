package concrete;
class B1 {
//	public B(String s) {
//		System.out.print("B");
//	}
}
public class A extends B1 {
	public A(String s) { 
		//super(s);
		System.out.print("A");
	}
	public static void main(String [] args) {
	  new A("C");
	}
}