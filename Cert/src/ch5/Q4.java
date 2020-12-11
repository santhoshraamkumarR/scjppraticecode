//https://www.geeksforgeeks.org/java-gq/exception-handling-2-gq/

package ch5;
class Base extends Exception{}
class Derived extends Base  {} 
public class Q4 {
	public static void main(String[] args) {
		try {
			 throw new Derived();
		}catch(Base b) {
			System.out.println("Caught base class exception");
		}/*catch(Derived d) {
			System.out.println("Caught Derived class exception");
		}*/
	}

}
