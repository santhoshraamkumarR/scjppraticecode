package ch2;

import  com.sun.scjp.Geodetics;

//import static com.sun.scjp.Geodetics.DIAMETER;

public class Test {
	public double halfway() { return Geodetics.DIAMETER/2.0; } 
	
	public static void main(String[] args) {
		Test t=new Test();
		t.halfway();
		// System.out.println(DIAMETER);

	}

}
