package ch1;

public class FindAverage
{
    public static void main(String args[])
    {
        System.out.println("Average of 7.2, 4.7 and 3.1 is " + average(7.2, 4.7, 3.1));
        System.out.println("Average of 25.0, 40.4, 33.0 and 2.0 is " + average(25.0, 40.4, 33.0, 2.0));
        System.out.println("Average of 5, 10, 15, 20 and 25 is " + average(5, 10, 15, 20, 25));
        Short shortRoom = 1;
        int intRoom = 2;
      book(shortRoom);
        //book((short) intRoom);*/
 
    }
    public static double average(double a, double b, double c)
    {
		//return c;
        return (a+b+c)/3;
    }
 
    public static double average(double a, double b, double c, double d)
    {
        return (a+b+c+d)/4;
    }
 
    public static double average(double a, double b, double c, double d, double e)
    {
        return (a+b+c+d+e)/5;
    }
    
    public static void book(short a) {
        System.out.print("short ");
    }
    public static void book(Short a) {
        System.out.print("SHORT ");
    }
    public static void book(Long a) {
        System.out.print("LONG ");
    }
 
}
