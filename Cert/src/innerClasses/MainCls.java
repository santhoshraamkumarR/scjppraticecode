package innerClasses;

import innerClasses.A.B;

abstract class A
{
    {
        System.out.println(1);
    }
     
    static
    {
        System.out.println(2);
    }
    
    interface B{
    	 public void test();
    }
}
 
public class MainCls implements B
{
    public static void main(String[] args)
    {
        A a = new A() { };
        MainCls m  = new MainCls();
        m.test();
    }

	@Override
	public void test() {
		System.out.println("Test");
		
	}
}


class AAA
{
    
 static class BBB
    {
	 
        {
            System.out.println(1);
        }
         
        static 
        {
            System.out.println(2);
        }
    }
}