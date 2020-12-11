//https://www.tutorialspoint.com/Java-Boxing-and-Widening
package ch3;

public class BoxingEx {
	public static void main(String[] args) {
		Integer testData=10; //Boxing
		System.out.println(testData);
		int unBoxing=testData; //Unboxing
		System.out.println(unBoxing);
		Short s=5;
		System.out.println(s);
		int widening=s;
		System.out.println(widening);
	}
}
