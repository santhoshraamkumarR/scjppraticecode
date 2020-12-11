package final_test_pdf;

  enum Test {
BREAKFAST(7, 30), LUNCH(12, 15), DINNER(19, 45);
private int hh;
private int mm;

Test(int hh, int mm) {
assert (hh >= 0  && hh <= 23) : "Illegal hour.";
assert (mm >= 0 && mm <= 59) : "Illegal mins.";

}

  }
public class Prg6 {

	public static void main(String[] args) {
		Test t = Test.BREAKFAST;
		System.out.println(t);
	}

}
