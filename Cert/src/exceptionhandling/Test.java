package exceptionhandling;

public class Test {

	static void test() throws Error { 
		if (true)   System.out.print("test "); 
	} 

	public static void main(String[] args) { 
		try { test(); } 
		catch (Exception ex) { System.out.print("exception "); 
		} 
		System.out.print("end "); 
	}

} 

