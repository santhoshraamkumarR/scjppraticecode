package final_test_pdf;

class A1{
	int k;
	boolean isTrue;
	static int p;
	public void printValue() {
		System.out.println(k);
		System.out.println(isTrue);
		System.out.println(p);
	}
	
	
}

public class Prg2 {

	public static void main(String[] args) {
		A1 a = new A1();

		 a.printValue();
	}

}
