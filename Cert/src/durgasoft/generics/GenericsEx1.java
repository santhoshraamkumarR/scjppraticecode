package durgasoft.generics;

/*
 *    Video 1 & 2 covered
 * 
 * 1. Introduction
 * 
 *          The main objectives of generic are to provide type safety and to resolve type casting
 *          problems.
 *                   
 *          
 *     Case 1: 
 *             Type safety:
 *                   Arrays are type safe ie is we can give the gurantee for the type of element
 *            present inside the array.
 *                     For Ex: If our programming requirement is to hold only particular datatype
 *                     of the type. (String,Integer).
 *                      If we use string array and by mistake we are trying to add other type of
 *                      object,we will get compile time error.
 *                      
 *                      String[] s = new String[1000];
 *                      s[0] = "durga";
 *                      s[1] = "Test";
 *                      s[2] = new Integer[0];
 *                      CE: Incompatible types
 *                      found: java.lang.Integer
 *                      req: java.lang.String.
 *                      
 *                  Hence String array can contain only string type of objects. Due to this we can
 *                  give the guarantee for the type of elements present inside the array. Hence arrays 
 *                  are safe to use with respect to type, ie is arrays are type safe.
 *                  
 *                  
 *                ArrayList Object:
 *                But collection are not type safe, ie we cant give the gurantee for the type of
 *                elements present inside the collection.
 *                 For Ex:
 *                       If our programming requirement is to hold,only string type of objects and if
 *                       we choose array list,by mistake if we are trying to add any other type of object
 *                       we wont get any compile time error.
 *                        But the program may fail at runtime.
 *                        
 *                        
 * 
 *                    ArrayList l = new ArrayList();
 *                    l.add("Ravi"); l.add("Durga"),l.add(new Integer(10));   
 *                    String name1 = (String)l.get(0);
 *                    String name2 = (String)l.get(1);
 *                    String name3 = (String)l.get(2);
 *                  We will get ClassCastException (Runtime Exception). Hence we can't give the 
 *                  gurantee for the type of elements,present inside the collection,due to this
 *                  collections are not safe to use with respect to type. ie is collections are
 *                  not type safe.
 *                  
 *                  
 *                  
 *                  
 *                  
 *       Case 2:
 *             Type casting:
 *                   In the case of arrays,at the time of retrival its not required to perform 
 *                   type casting,because there is a gurantee for the type of elements,present inside
 *                   array.
 *                   
 *                   String[] s = new String[1000];
 *                   s[0] = "Durga";
 *                   String name = s[0]; //Type casting not required.
 *                   
 *                    
 *                    But in the case of collections at the time of retrival,compusory we should perform 
 *                    type casting,bcoz there is no gurantee for the type of elements present inside the 
 *                    collection.
 *                    
 *                    ArrayList l = new ArrayList();
 *                    l.add("Durge"); 
 *                    String name1 = l.get(0);
 *                    CE: java.lang.object
 *                    found: java.lang.object
 *                    req: java.lang.String
 *                    String name1 = (String)l.get(0); //Type casting is mandatory
 *                    
 *                    
 *                Hence type casting is bigger headache in collection
 *                
 *                    To overcome above problems of collections,Sun people introduced Generics concept
 *                    in 1.5V.
 *                    
 *                    Hence the main objectives of generics are 
 *                     1. To provide type safety and 
 *                     2. To resolve type casting problems
 *                     
 *                    
 *                    For Ex: 
 *                       To hold only string type of objects,we can create generic version of array list
 *                       object has follows:
 *                             ArrayList<String> l = new ArrayList<String>();
 *                           
 *                             
 *                             For this array list,we can add only string type of objects. By mistake
 *                             if we are trying to add any other type then we will get compile time
 *                             error.
 *                               l.add("Durga"); l.add("Ravi"); l.add(new Integer(10)); //Immediately
 *                               compile time error.
 *                               
 *                               Hence through generics we are getting type safety.
 *                               
 *                               
 *                               At the time of retrival,we are not required to perform type casting.
 *                               
 *                               ArrayList<String> l = new ArrayList<String>
 *                               l.add("Durga");
 *                               String name1 = l.get(0); //Type casting is not required.
 *                               
 *                               Hence through generics,we can solve type casting problem.
 *                               
 *                               
 *                              ArrayList l  = new ArrayList();                ArrayList<String> l = new ArrayList<String>();
 *                              1.It is a non generic version of                It is a generic version of array
 *                              array list object
 *                             
 *                             2.For this array list we can add,any             For this array list we can add  only
 *                             type of object,and hence it is                   String type of object and hence it is 
 *                             not type safe.                                   type safe 
 *                             
 *                    
 *                    
 *                             3.At the time of retrieval,compulsory             At the time of retrival,we are not required
 *                              type casting is required                         to perform type casting         
 *                            
 *                  
 *                 Conclusion 1: 
 *                  Polymorphism concept applicable only for the base type,but not for parameter 
 *                  type. (Usage of parent reference,to hold child objects,is the concept of
 *                  polymorphism)
 *                  
 *                  ArrayList<String> l = new ArrayList<String>(); //Valid
 *                  List<String> l = new ArrayList<String>(); //valid
 *                  Collection<String> l = new ArrayList<String>(); //valid
 *                  ArrayList<Object> l = new ArrayList<String>(); //Invalid
 *                  //incompatible types:
 *                    found:java.lang.String
 *                    req:  java.lang.Object 
 *                  
 *                  Conclusion 2:
 *                           
 *                           For the type parameter we can provide any class or interface name,but
 *                           not primitive.
 *                           
 *                           If we are trying to provide primitive,then we will get
 *                           compile time error
 *                           
 *                           ArrayList<int> x = new ArrayList<int>();
 *                           CE: Unexpected type
 *                           found: int
 *                           required: reference
 *                           
 *                           
 *               Generic classes:
 *                      Until 1.4V a non generic version of array list class is declared as follows
 *                        
 *                        class ArrayList{
 *                        
 *                        add (Object o)
 *                        object get(int index); //return type
 *                        }
 *                        
 *                        The argument to add method is object and hence we can add any type of 
 *                        object to the Array list. Due to this we are missing Type Safety.
 *                        
 *                        The return type of get method is Object. Hence at the time of retrieval,
 *                        we have to perform type casting.
 *                        
 *                        
 *                        
 *                        But in 1.5v,a generic version of array list class is declared as 
 *                        follows.
 *                            class Al<T> { //T is type parameter
 *                                add(T t)
 *                                T get(int index)
 *                            
 *                            }
 *                        
 *                        
 *                         Based on our run time requirement,t will be replaced with our 
 *                         provided type.
 *                         
 *                            For Ex:
 *                             To hold only string type of objects,a generic version arraylist
 *                             of object can be created as follows.
 *                             
 *                               Al<String> l = new ArrayList<String>();
 *                                      For this requirement,compiler consider version of array list
 *                                      class is as follows.
 *                                      
 *                                      class Al<String>{
 *                                      add(String s)
 *                                      String get(int index)
 *                                       }
 *                               
 *                            The argument to add method is String type,Hence we can add only 
 *                            string type of objects,by mistake if we are trying to add
 *                            any other type,we will get compile time error.
 *                            
 *                             l.add("durga");//valid
 *                             l.add(new Integer(10));//invalid
 *                             
 *                             ce: cant find symbol
 *                             symbol: method add(java.lang.Integer)
 *                             location: class Al<String>
 *                              Hence through generics we are getting type safety
 *                            
 *                            The return type of get method is string and hence at the time
 *                            of retrieval,we are not required to perform type casting.
 *                            
 *                            String name1 = l.get(0);
 *                            Type casting is not required.
 *                            
 *                            
 *                    In generics,we are associating a type parameter to the class,such type of
 *                    parameter raised classes are nothing but generic classes or template
 *                    classes.
 *                    
 *                    Based on our requirement,we can define our own generic classes also
 *                    
 *                    
 *                    class Account<T>{}
 *                    
 *                    Account<Gold> a1 = new Account<Gold>{}
 *                    Account<Platinum> a2 = new Account<Platinum>{}
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

class Gen<T>{
	T object;
	public Gen(T obj) {
		this.object = obj;
	}
	
	
	
	public void show() {
		System.out.println("The type of object is: "+object.getClass().getName());
	}
	
	
	public T getObj() {
		return object;
	}
}


public class GenericsEx1 {
 public static void main(String[] args) {
	Gen<String> g1 = new Gen<String>("Durga");
	g1.show();
	System.out.println(g1.getObj());
	
	Gen<Integer> g2 = new Gen<Integer>(10);
	g2.show();
	System.out.println(g2.getObj());
	
	
	Gen<Double> g3 = new Gen<Double>(5.5);
	g3.show();
	System.out.println(g3.getObj());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
