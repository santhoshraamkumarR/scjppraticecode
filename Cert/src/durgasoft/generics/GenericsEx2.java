package durgasoft.generics;
/*
 * 
 * 
 * Video 3:
 *        Bounded types:
 *            We can bound the type parameter for a particular range,by using extends 
 *            keyword. Such types are called Bounded types.
 *            
 *            Ex: class Test<T>{}: 
 *                      As a type parameter,we can pass any type and there are no
 *                      restrictions and hence it is unbounded type.
 *                      Test<Integer> t1 = new Test<Integer>();
 *                      Test<String>  t2 = new Test<String>();
 *                      
 *                class Test <T extends Number>{}
 *                        
 *                 Syntax for bounded type:
 *                  class Test<T extends x>{}
 *                   Here X can be either class or Interface.
 *                   If x is a class,then as the type parameter,we can pass either x type 
 *                   or its child classes.
 *                   If x is an interface,then as the type parameter we can pass either x
 *                   type or its implementation classes.
 *                   
 *              Ex:
 *               class Test<T extends Number>{}
 *               Test<Integer> t1 = new Test<Integer>();
 *               Test<String> t2 = new Test<String>(); //Invalid
 *               CE: Type parameter,Java.lang.String is not within its bound.
 *               
 *               class Test<T extends Runnable>{}
 *               Test<Runnable> t1 = new Test<Runnable>();
 *               Test<Thread>   t2 = new Test<Thread>();
 *               Test<String>   t3 = new Test<String>();//Invalid
 *               CE: Type parameter,java.lang.Integer is not within its bound.
 *               
 *               We can define bounded types,even in combination also
 *               class Test<T extends Number & Runnable>{}
 *               
 *               As the type parameter,we can take anything which should be child class of number
 *               and should implements runnable interface.
 *               
 *               class Test<T extends Runnable & Comparable>{}//valid
 *               class Test<T extends Number & Runnable & Comparable>{}//valid
 *               class Test<T extends Runnable  & Number> [We have to take class first,followed by interface next].
 *               class Test<T extends Number  & Thread> [We can't extend more than one class simultaneously].
 *               
 *               Conclusion 1:
 *                 1. We can define bounded type only by using extends Keyword and we cant use implements and super
 *                 keyword. But we can replace implements keyword purpose with extends keyword.
 *                 
 *                 Valid:
 *                    class Test<T extends Runnable>{}
 *                    class Test<T extends Number>{}
 *                  Invalid:
 *                    class Test<T extends super>{}
 *                    class Test<T implements Runnable>{}
 *                 
 *               Conclusion 2:
 *                  class Test<T>{}
 *                  As the type parameter 'T' we can take any java identifier,but it is convention to
 *                  use T.
 *                  
 *                  valid: class Test<X>{},class Test<A>{},class Test<Durga>{}
 *                  
 *                  
 *                Conclusion 3:
 *                 Based on our requirement,we can declare any number of type parameters and all these
 *                 type parameters should be separated with comma(,).
 *                 
 *                 class Test<A,B>{},class Test<X,Y,Z>{},class HashMap<K,V>{}
 *                 k is key type
 *                 v is value type
 *                 HashMap<Integer,String> hm = new HashMap<Integer,String>(){}
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
 * 
 * 
 * 
 * 
 */


public class GenericsEx2 {

}
