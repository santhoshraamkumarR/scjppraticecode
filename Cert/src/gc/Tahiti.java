package gc;

public class Tahiti {
	Tahiti t; 
	public static void main(String[] args) { 
		Tahiti t = new Tahiti();
		
		Tahiti t2 = t.go(t); 
		System.gc();
		
	
	} 
	Tahiti go(Tahiti t) { 
		Tahiti t1 = new Tahiti(); Tahiti t2 = new Tahiti(); 
		t1.t = t2; t2.t = t1; t.t = t2; 
		t = null;  // more code here
		return t1;
	} 
	
protected void finalize() {
	System.out.println("Gc");
}
}