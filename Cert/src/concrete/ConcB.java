package concrete;

 


public class ConcB extends BB {
	 public static void main(String[] args) {
		 Short myNum = 7;
		 System.out.println(add(myNum, 6));
	 }
	}

	class BB {
	 static int add(int x, int y) { return x + y; }
	}
	 