package innerClasses;

public class StaticNestedClassEx {

	static class Ex1{
		static int y = 10;
		public void m1() {
			
			System.out.println("M1");
		}
		public static void main(String args[]) {
			
			Ex1 ex = new Ex1();
			ex.m1();
		}
	}
	public static void main(String[] args) {
		Ex1 ex = new Ex1();
		
		//ex.m1();
	}
	 
}
