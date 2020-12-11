package ch2;

class X
{
    void calculate(int a, int b)
    {
        System.out.println("Class X");
    }
}
 
class Y extends X
{
    @Override
    void calculate(int a, int b)
    {
        System.out.println("Class Y");
    }
}
 
class Z extends Y
{
    @Override
    void calculate(int a, int b) 
    {
        System.out.println("Class Z");
    }
}
 
public class MainClass1
{   
    public static void main(String[] args)
    {
        X x = new Y();
         
        x.calculate(10, 20);
         
        Y y = new Z();
         
        y.calculate(50, 100);
         
        
        SubClass sub = new SubClass();
        
        sub.superClassMethod(123321d);
       
        AA a=new AA();
        a.A();
        method(12);
        
        AO a1 = new BO();
        
        a1.methodOne();
 
   }
    
    
    static void method(Integer i)
    {
        System.out.println(1);
    }
     
    static void method(Double d)
    {
        System.out.println(2);
    }
     
    static void method(Number n)
    {
        System.out.println(4);
    }
     
    static void method(Object o)
    {
        System.out.println(5);
    }
 
}

class AA
{
    public  AA(int i)
    {
        System.out.println(1);
    }
     
    public  AA()
    {
        this(10);
         
        System.out.println(2);
    }
     
    void A()
    {
        A(10);
         
        System.out.println(3);
    }
     
    void A(int i)
    {
        System.out.println(4);
    }
}
 
class SuperClass
{
    void superClassMethod(Number n)
    {
        System.out.println("From Super Class");
    }
}
 
class SubClass extends SuperClass
{
    void superClassMethod(Double d)
    {
        System.out.println("From Sub Class");
    }
}
 





class AO
{
      void methodOne()
    {
        System.out.println("AAA");
    }
}
 
class BO extends AO
{
      void methodOne()
    {
        System.out.println("BBB");
    }
}
