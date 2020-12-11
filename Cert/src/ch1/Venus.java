package ch1;

public class Venus {

	static final int[] a1 = {100,200};
	static final int[] a2;
	 static { a2 = new int[2];
	 a2[0]= 100;
	 a2[1]= 101;}
	
	 
	public static void main(String[] args) {
		int[] x= {1,2,3};
		int[] y = {4,5,6};
		new Venus().go(x,y);
		
		
	}
	
	void go(int[]...z) {
		for(int[]a:z) {
			System.out.println(a[0]);
		}
	}

}
