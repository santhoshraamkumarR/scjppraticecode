package durgasoft.generics;
/*
 * 
 *  We can declare type parameter either at class level or at method level. 
 * 
 *  1. Declaring a type parameter at class level:
 *      class Test<T>{
 *         We can use T within this class based on our requirement.
 *         }
 *         
 *  2. Declaring a type parameter at method level:
 *           We have to declare type parameter just before return type
 *           
 *          class Test{
 *           
 *           public <T> void m1(T obj){
 *              We can use T anywhere in this method,based on our requirement.
 *           }
 *          }
 * 
 * 
 * 
 * 
 * We can define bounded types,even at method level also.
 * 
 * public <T> void m1(){}
 * public <T extends Number> void m2(){}
 * <T extends Runnable>
 * <T extends Runnable & Comparable>
 * <T extends Number & Runnable>
 * <T extends Number & Runnable & comparable>
 * <T extends Runnable & Number> //Invalid cant implement and extend it
 * <T extends Number & Thread> // Invalid cant extends more than one class
 * 
 * 
 * Communication with non-generic code:
 *          
 *          If we send generic object to non generic area,then it starts behaving like 
 *          non generic object.
 *          Similarly,if we send non generic object to generic area,then it starts 
 *          behaving like generic object.
 *           The reason is the location in which object present,based on that behaviour 
 *           will be defined.
 *           
 *           
 *   conclusion:
 *          The main purpose of generics is to provide type safety and to resolve
 *          type casting problems. 
 *          
 *          Type safety and type casting both are applicable at compile time,hence
 *          generics concept also applicable only at compile time,but not yet
 *          run time.
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

import java.util.ArrayList;

public class GenericMethods {
	
	public static void main(String[] args) {
		//Generic method accept only string
		ArrayList<String> al = new ArrayList<String>();
		al.add("Durga");
		al.add("Ravi");
		m1(al);
		
	}
	
	//Non Generic method. Accepts any type
	public static void m1(ArrayList al) {
		al.add(10);
		
		System.out.println(al);
	}

}



