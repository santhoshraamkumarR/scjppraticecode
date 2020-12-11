package ch1;

public class Test1 {
int x = 12;
 public void method(int x) {
	 x+=x;
	 System.out.println(x);
 }
	public static void main(String[] args) {
		Test1 t = new Test1();
		t.method(5);

	}

}
