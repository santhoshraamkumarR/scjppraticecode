package durgasoft.generics;

import java.util.ArrayList;

/*
 * 
 * Generic method and wild card characters ? mark
 * 
 *  1. m1(ArrayList<String> l) 
 * 
 *            We can call this method by passing only string type.
 *            
 *            But within the method,we can add only string type of object to the list.
 *            By mistake,if we are trying to add any other type,then we will get
 *            compile time error.
 *            
 *            m1(ArrayList<String l>){
 *            l.add("A");
 *            l.add(null);
 *            l.add(10); //Invalid Compile time error.
 *          }
 *          
 *     2. m1(ArrayList<?> l)       
 *             We can call this method by passing array list any unknown type.
 *             But within a method,we cant add anything to the list except null,
 *             because we dont know the type exactly.
 *              
 *             Null is allowed,because it is valid value for any type.
 *             
 *             m1(Al<?> l){
 *               l.add(10.5) //invalid
 *               l.add(a);   //invalid
 *               l.add(null) //valid
 *             }
 *              
 *            
 *            This type of methods are best suitable for read only operation.
 *            
 *            
 *            3. m1(ArrayList<? extends x> l){}
 *            
 *             X can be either class or interface. 
 *             If x is a class,then we can call this method by passing array list of
 *             either x type or it is child classes.
 *             If x is an interface,we can call this method by passing array list of
 *             either x type or its implementation classes.
 *             
 *             But within a method,we cant add anything to the list except null.
 *             because we don't know the type of X exactly.
 *             
 *             This type of method is also best suitable for read only operation.
 *             
 *             4. m1(ArrayList<? super x>l);
 *                        X can be either class or interface. 
 *                        If x is a class then we can call this method by passing array list
 *                        of either x type or its super classes.
 *                        If x is an interface then we can call this method by passing 
 *                        array list of either x type or super class implementation class
 *                        of x.
 *                       
 *                        Object <- Thread <- Runnable
 *                      
 *                        But within a method,we can add x type of object and null to the list.
 *                        
 *                        m1(ArrayList<?  super x>l){
 *                         l.add(x); x is an type of object;
 *                         l.add(null);
 *                        }
 *                        
 *                        
 *                        
 *                        
 *                        
 *             
 *             
 *            
 *            
 *            
 *            
 *            
 *            
 *            
 * 
 */
public class GenericsWildCardEx1 {

	public static void main(String[] args) {
		ArrayList<Integer> I = new ArrayList<Integer>();
		ArrayList<?> al = new ArrayList<Integer>();
		ArrayList<? extends Number> al1= new ArrayList<Integer>();

		/*
		 * Invalid: Incompatible types
		 * found: AL<String>
		 * required:AL<? extends Number>
		 * 
		 */
		
		/*
		 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	       Type mismatch: cannot convert from ArrayList<String> to ArrayList<? extends Number>
           at durgasoft.generics.GenericsWildCardEx1.main(GenericsWildCardEx1.java:99)
 
		 * 
		 */
		 
		//ArrayList<? extends Number> al2 = new ArrayList<String>();



		//ArrayList<?> al3 = new ArrayList<?>();
		/*
		 * 
		 *   Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	         Cannot instantiate the type ArrayList<? extends Number>
	         at durgasoft.generics.GenericsWildCardEx1.main(GenericsWildCardEx1.java:104)

		 * 
		 * 
		 */
		//ArrayList<?> al4 = new ArrayList<? extends Number>();



	}
}