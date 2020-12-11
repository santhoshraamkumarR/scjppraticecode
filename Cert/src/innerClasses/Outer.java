package innerClasses;

public class Outer {

	int x = 10;
	static int y = 20;
	  class Inner{
		  //static int y = 10; static not allowed inside inner class
		int x = 100;
		public void m1() {
			 int x =1000;
			System.out.println("m1 is created");
			System.out.println(Outer.this.x);
			System.out.println(Inner.this.x);
			System.out.println(x);
			System.out.println(y);
			System.out.println("Accessing static value of outer variable: "+y);
		}
		
		
		
		
	}
	
	public void outerMethod() {
		Inner i = new Inner();
		i.m1();
	}
	public static void main(String[] args) {
              System.out.println("Outer Class main method");
              Outer o = new Outer();
              //Outer.Inner i= o.new Inner(); 
              Outer.Inner i= new Outer().new Inner();
             // i.m1();            
              o.outerMethod();
	} 

}
