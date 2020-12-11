package concrete.part2;
 

class A {
	public   void show(){ 
		System.out.print("A"); 
	}
}
public class  ClassB extends A {
	public   void show() { 
		System.out.print("B"); 
	}
	public static void main(String [] args) {
	   new  ClassB().show();
    }
}