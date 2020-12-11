//https://javaconceptoftheday.com/java-practice-coding-questions-on-nested-classes/
package innerClasses;

class X
{
      int x = 3131;
     
      class Y
    {
          int y = x++;
         
          class Z
        {
              int z = y++;
        }
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
    	X x = new X();
    	X.Y y = x.new Y();
    	X.Y.Z z = y.new Z();
        System.out.println(x.x);
         
        System.out.println(y.y);
         
        System.out.println(z.z);
    }
}