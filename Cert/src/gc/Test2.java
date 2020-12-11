package gc;
//Object reffered to another object
public class Test2 {

	String name;

	public Test2(String name) {
		this.name = name;
	}

	public static void main(String[] args) throws Throwable {
		Test2 t1 = new Test2("t1");
		Test2 t2 = new Test2("t2");
		t1 = t2;

		System.gc();

		String str = new String("GeeksForGeeks"); 
		//Thread.sleep(1000);  
		str = null;
		System.out.println("end of main"); 
		// t1.finalize();
		System.out.println("Finalize method call");
	}

	protected   void finalize() {
		System.out.println(name  + "successfully GC");
	}}