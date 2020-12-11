package innerClasses;

public class MethodClass {

	public void m1() {
		class Inner{
			public void sum(int x,int y) {
				System.out.println(x+y);
			}
		}
		Inner i = new Inner();
		i.sum(5, 10);
		i.sum(20, 20);
		i.sum(50, 100);
	}
	
	public static void main(String args[]) {
		MethodClass mClass = new MethodClass();
		mClass.m1();
		 
	}
	
}
