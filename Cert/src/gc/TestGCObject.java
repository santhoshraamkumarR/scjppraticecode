package gc;

public class TestGCObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestGCObject t1 = new TestGCObject(); 
		TestGCObject t2 = m1(t1); // line 6 
		TestGCObject t3 = new TestGCObject(); 
        t2 = t3; // line 8 
       t1.finalize();
       t2.finalize();
       t3.finalize();
    } 
      
    static TestGCObject m1(TestGCObject temp)  
    { 
        temp = new TestGCObject(); 
        return temp; 
    }
    
      protected  void finalize() {
    	System.out.println(this.hashCode());
    }
}
