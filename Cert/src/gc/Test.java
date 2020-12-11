package gc;

import java.util.ArrayList;

public class Test {


	String objName;

	public Test(String objName) {
		this.objName =  objName;
	}

	static void show() {
		Test t = new Test("t");
		//display();

	}

	static void display() {
		Test t1 = new Test("t1");
	}
	
	public Test() {
		//genNumbers();
	}
	public static void main(String[] args) {
		//Test t = new Test();
		//t.genNumbers();
		show();display();
		System.gc();

	}

	public static void genNumbers() { 
		
		ArrayList numbers = new ArrayList(); 
		for (int i=0; i<10; i++) { 
			int value = i * ((int) Math.random()); 
			Integer intObj = new Integer(value); 
			numbers.add(intObj); 
		} 
		System.out.println(numbers); 
		Test t2 = new Test("getnos");
	} 


	protected void finalize() {
		System.out.println("GC succesfully collected ---> "+this.objName);
	}
}
