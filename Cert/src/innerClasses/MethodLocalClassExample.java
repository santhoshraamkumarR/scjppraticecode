package innerClasses;

public class MethodLocalClassExample {
	public void m1() {
		 int x = 10;
		class InnerClas{
			public void innerClassMethod() {
				System.out.println(x); //Needs to be declare as Final keyword to access
				                       // the local variable inside method
			}
		} 
		 
		InnerClas ic = new InnerClas();
		ic.innerClassMethod();
	}
	public static void main(String[] args) {
		MethodLocalClassExample mc = new MethodLocalClassExample();
		mc.m1();
		
	}

}
