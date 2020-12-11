package operators_ch4;

public class Pass21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			  int x = 5;
			  Pass21 p = new Pass21();
			   p.doStuff(x);
			  System.out.print(" main x = " + x);
			  }
			 
			  void doStuff(int x) {
			  System.out.print(" doStuff x = " + x++);
			  }

}
