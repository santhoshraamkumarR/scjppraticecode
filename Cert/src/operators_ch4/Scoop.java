package operators_ch4;

public class Scoop {
	static int thrower() throws Exception { return 42; }
	public static void main(String [] args) {
		int x = 0;
	try {
	x = thrower();
	} catch (Exception e) {
	x++;

	} finally {
		
	System.out.println("x = " + ++x);
	
	int s=3;
	short sh=(short) s;
	System.out.println(sh);
	} } }


