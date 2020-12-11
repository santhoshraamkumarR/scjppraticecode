package concrete;

class CP1 {
	String count(short cnt) { return "only one"; }
	String count(Integer... cnt) { return "too many"; }
}
public class Test {
	public static void main(String [] args) {
		System.out.println(new CP1().count(5));
	}
}
