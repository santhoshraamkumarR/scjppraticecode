package ch3;

import java.awt.Dimension;

public class ReferenceTest {

	public static void main(String[] args) {
     Dimension d=new Dimension(5,10);
     int a=1;
     ReferenceTest rt=new ReferenceTest();
     System.out.println("Before modify "+d.height);
     rt.modify(d);
     System.out.println("After modify "+d.height);
     System.out.println("Before MOdify var "+a);
     rt.modifyPrimitive(a);
    System.out.println("After modify var "+a);
	}
	
	void modify(Dimension d) {
		d.height=d.height+1;
		System.out.println(d.height);
	
	}

	void modifyPrimitive(int number) {
		number=number+1;
		System.out.println(number);
	}
}
 