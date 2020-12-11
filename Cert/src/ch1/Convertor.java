package ch1;

public class Convertor {

	public static void main(String[] args) {
		String i = args[0];
		int j=12;
		System.out.println(j==Integer.parseInt(i));
		
		
		
		int x =0;
		int y =10;
		do {
			y--;
			//System.out.println("Y is "+y);
			++x;
			//System.out.println("X is "+x);
		}while(x<5);
		System.out.println(x+","+y);
	}

}
