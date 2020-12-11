package concrete;

public class CPTest {
	public enum Card {
		SPADES(20), CLUB(50) {
			public int getValue(int val) {
				return val * 3;
			}
		};
		Card(int num) {
			this.num = num;
		}

		private int num;

		public int getValue(int val) {
			return num * val;
		}
	}

	public static void main(String[] args) {
		System.out.print(Card.SPADES.getValue(41));
		System.out.print(" " + Card.SPADES + " " + Card.SPADES.num);
	}
}
