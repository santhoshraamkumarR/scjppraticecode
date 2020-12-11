package gc;


class TestObj{
	int i;
	
	public TestObj(int i) {
		this.i = i;
	}
	
	TestObj incrByTen() {
		TestObj o = new TestObj(i+10);
		return o;
	}
}
public class ObjectReturnDemo {
 
	public static void main(String[] args) {
		TestObj t = new TestObj(10);
		TestObj t2;
		//t  = t.incrByTen();
		t2 = t.incrByTen();
		System.out.println(t.i);
		System.out.println(t2.i);
		
	}

}
