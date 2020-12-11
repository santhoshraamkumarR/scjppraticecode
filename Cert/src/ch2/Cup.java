package ch2;

public class Cup {

	public void takeCup(Cup c) {
		if (c instanceof PoisonCup) {
			System.out.println("Inconceivable!");
		} else if (c instanceof Cup) {
			System.out.println("Dizzying intellect!");
		} else {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		Cup c=new PoisonCup();
		c.takeCup(c);	
		A a=new A();
	System.out.println(a.getInstanceCount());
	String[] elements = { "for", "tea", "too" };
	String first = (elements.length > 0) ? elements[0] : null;
	System.out.println(first);
	}

}


class PoisonCup extends Cup { }


class A{
	private static int counter=0;
    public static int getInstanceCount()
   {
       return counter;
   }
   public A()
   {
      counter++;
   }

}