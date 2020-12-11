package innerClasses;

class X1
{   
    static
    {
        class Y1
        {   
            {
                System.out.println(1);
            }
        }
    }
     
    {
        class Y2
        {
            {
                System.out.println(2);
            }
        }
    }
}
 
public class MainCls30
{
    public static void main(String[] args)
    {
    	
        new X1();
    }
}