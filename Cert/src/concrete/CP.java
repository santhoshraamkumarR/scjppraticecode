package concrete;

public class CP {
	CP c1;
	CP() { }
	CP(CP c) {
		c1 = c;
	}
	public static void main(String[] args) {
		CP c2 = new CP();
		CP c3 = new CP(c2); 
		c3.go();
		CP c4 = c3.c1; 
		c4.go();
		CP c5 = c2.c1; 
		c5 = new CP(c2);
		c5.go();
	}
	void go() { System.out.print("A "); }
} 