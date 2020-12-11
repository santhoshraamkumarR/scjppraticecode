package gc;

class Snoochy { 
	Boochy booch; 
	public Snoochy() { booch = new Boochy(this); } 
} 

class Boochy { 
	Snoochy snooch; 
	public Boochy(Snoochy s) { snooch = s; } 
// And the statements: 
public static void main(String[] args) { 
	Snoochy snoog = new Snoochy(); 
	snoog = null; 
	System.gc();
	// more code here 
} 


protected void finalize() {
	System.out.println("garbage collected");
}
}

