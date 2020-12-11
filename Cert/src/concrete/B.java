package concrete;

class A1 {
	public  static void show(){ 
		System.out.print("A"); 
	}
}
public class B extends A1 {
	public static void show() { 
		System.out.print("B"); 
	}
	public static void main(String [] args) {
	  A1 a= new B();
	  a.show();
    }
}