package exceptionhandling;

public class A1 {
	public String sayHello(String name) throws TestException {
		
		 if(name == null) {
	 throw new TestException();
	 }
	
	 return "Hello "+ name;
	 }	
	//}

	public static void main(String[] args) throws TestException {
		 A1 a=new A1();
		 System.out.println(a.sayHello("kk"));

		
	}

}
  class TestException extends Exception {
 }