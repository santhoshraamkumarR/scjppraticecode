package gc;


public class Ex1 {
static int count = 0;
{
	count+=1;
}
	public static void main(String[] args) throws Throwable {
		Ex1 ex1 = new Ex1();
		Ex1 ex2 = new Ex1();
		System.out.println(Ex1.count);
		
		ex1 = new Ex1();
		ex1 = null;
		System.out.println(Ex1.count);
		
		
		Runtime r = Runtime.getRuntime();
		long tm = r.totalMemory();
		System.out.println(tm);
		Long fm = r.freeMemory();
		System.out.println(fm);
		r.gc();
		System.out.println(fm);
		 
	}

}
