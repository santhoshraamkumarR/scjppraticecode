package concrete;

public class CpTest {

	static int nums = 8;
	 public static void main(String[] args) {
		 new CpTest().go(nums);
		 System.out.print(" "+nums);
	 }
	 void go(int num1) {
		 num1++;
		 for(int num = 3; num < 6; num++);
		 System.out.print(" "+num1);
	 }

}
