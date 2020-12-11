//https://www.geeksforgeeks.org/garbage-collection-java
package gc;

public class Test11 {

	public static void main(String[] args) {
		Test11 t1 = new Test11(); 
		Test11 t2 = new Test11(); 
          
        // Nullifying the reference variable 
        t1 = null; 
          
        // requesting JVM for running Garbage Collector 
        System.gc(); 
          
        // Nullifying the reference variable 
        t2 = null; 
          
        // requesting JVM for running Garbage Collector 
        Runtime.getRuntime().gc(); 
      

	}
	
	@Override
    // finalize method is called on object once  
    // before garbage collecting it 
    protected void finalize() throws Throwable 
    { 
        System.out.println("Garbage collector called"); 
        System.out.println("Object garbage collected : " + this); 
    } 

}
