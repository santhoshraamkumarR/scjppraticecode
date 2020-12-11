package ch7;

public class OuterTest {

	public static void main(String[] args) {

		 Airplane.BlackBox box=new Airplane().new BlackBox();
		 box.printvariable();
		
	}

}
class Airplane{
	
	String code="11";
	class BlackBox{
		String code="22";
		public void printvariable() {
			System.out.print(code);
			System.out.print(Airplane.this.code);
		}
	}
	
}