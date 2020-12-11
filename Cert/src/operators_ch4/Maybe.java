package operators_ch4;

public class Maybe {

	public static void main(String[] args) {
		boolean b1=true;boolean b2=false;
		System.out.println(!false^false);
		System.out.println(" " + (!b1 | (b2 = false)));
		
		System.out.println(" " + (b2 ^ b1));

	}

}
