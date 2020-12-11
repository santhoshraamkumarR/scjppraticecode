package exceptionhandling;

public class FlowException {
static int[] a;
{a[0] = 2;}
	public static void main(String[] args) {
		
try {
	// throw new Exception();
}catch(NullPointerException e) {
	System.out.println("a");
}catch(Exception e) {
	System.out.println("b");
}finally {
	System.out.println("c");
}


 try { test(); } 
  catch (Exception ex) { System.out.print("exception "); } 

	}

static void test() { 
try { 
String x = null;  
System.out.print(x.toString() + " "); 
 } 
 finally { System.out.print("finally "); } 
} 


}

