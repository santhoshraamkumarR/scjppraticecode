//https://java.scjp.jobs4times.com/asser.htm#intro
package ch5;

public class Test {

	public static void main(String[] args) {


		/*	Keyword assert is used in 1.3v.
			If we used in the above version the compiler 
				will throw an error
				*/
		//int assert=10; 
		//System.out.println(assert);
		
		int x=10;
		assert(x>20):"here x value should be >10 but it is not";
		System.out.println(x);
	}

}
