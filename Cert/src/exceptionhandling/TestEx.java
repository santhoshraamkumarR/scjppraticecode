package exceptionhandling;

public class TestEx {
	public static void main(String[] args) { 
		try { 
			args = null; 
			args[0] = "test"; 
			System.out.println(args[0]); 
		} catch (Exception ex) { 
			System.out.println("Exception"); 
		} 
		
		try { 
			 A a = new A(); 
			 //a.method1(); 
			 } catch (Exception e) { 
			 System.out.print("an error occurred"); 
			 }

	} 
}

