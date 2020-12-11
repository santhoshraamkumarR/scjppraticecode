package exceptionhandling;

public class ThrowNewExcep {
   public static void main(String args[]) {
	   try {
		throw new NullPointerException("Demo");   
	   }catch(Exception e) {
		   System.out.println(e);
		   throw e;
	   }
   }
}
