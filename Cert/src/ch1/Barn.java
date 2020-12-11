package ch1;

public class Barn {

	
	
	public static void main(String[]... args) {
            new Barn().go(1,"go");
            new Barn().go(2, "wnet","done");
            
		
	}

	
	public void go(int x, String...y) {
		System.out.println((y.length-1));
		
	}
}
