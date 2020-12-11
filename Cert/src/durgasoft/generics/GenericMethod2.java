package durgasoft.generics;

import java.util.ArrayList;
/*
 * At the time of compilation at the  last step,generic syntax will be
*          removed and hence for the JVM generic syntax wont be available.
           
           The following declaration are equal:
                  ArrayList l = new ArrayList ();
                  ArrayList l = new ArrayList<Integer>();
                  ArrayList l = new ArrayList<String>();
                  ArrayList l = new ArrayList<Double>();
 * 
 * 
 *         The following declarations are equal:
 *               ArrayList<String> l = new ArrayList<String>();
 *               ArrayList<String> l = new ArrayList<>();
 *               
 *               
 *         For these array list objects,we can add only string type of objects.
 *         
 *               
 * 
 * Invalid:
 *     public static void m1(ArrayList<Integer> i) {}

       public static void m1(ArrayList<String> s) {}       
 * 
 *   CE: Name clash: both methods having same erasure. method name m1 for both methods
 *   
 *   
 *   Compilation rules:
 *         1. Compile code normally by considering generic syntax.
 *         2. Remove Generic syntax
 *         3. Compile once again resultant code.       
 * 
 * 
 * 
 */


public class GenericMethod2 {
 public static void main(String[] args) {
	 ArrayList l = new ArrayList<String>();
	 l.add(10);
	 l.add(10.5);
	 l.add("Durga");
	 System.out.println(l);
	 
	 
	 
}
 
//public static void m1(ArrayList<Integer> i) {}

//public static void m1(ArrayList<String> s) {}
 
}
