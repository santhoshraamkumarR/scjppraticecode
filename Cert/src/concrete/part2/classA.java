package concrete.part2;

class B {
	public B(String s) {
		System.out.print("B");
	}
}
public class classA extends B {
	 classA(String s) { 
		 super(s);
		System.out.print("A");
	}
	public static void main(String [] args) {
	  new classA("C");
	}
}