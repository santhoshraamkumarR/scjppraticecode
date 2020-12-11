//https://onlinetest.caknowledge.com/scjp-quiz-ocjp-online-test-series-1/
package onlinetest_caknowledge;

public class Barn {

	public static void main(String[] args) {
		new Barn().go("hi", "1","2");
		new Barn().go("hi","world","Hello");
		}
		public void go(String... y) {
		System.out.print(y[y.length - 1] + " ");
		}
		}