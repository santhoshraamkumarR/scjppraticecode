package gc;

public class TestGarbage1 {

	public static void main(String[] args) {
		  TestGarbage1 s1=new TestGarbage1();  
		  TestGarbage1 s2=new TestGarbage1();  
		  s1=null;  
		  s2=null;  
		  System.gc();
		  Integer i = new Integer(4);
		  i=null;
		  System.gc();
	}
	
	
	 public void finalize(){System.out.println("object is garbage collected");}  


}
