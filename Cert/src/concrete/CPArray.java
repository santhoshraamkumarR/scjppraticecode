package concrete;

public class CPArray {
	public static void main(String[] args) {
	  int[][] x = {{4,5,}, {6,7}};
	  int[] y = (int[]) x[1];
	  Object ob = x;
	  int[][] x2 = (int[][]) ob;
	  int[] x3 = (int[])  ob;
	  System.out.println(y[1]);
	}
} 