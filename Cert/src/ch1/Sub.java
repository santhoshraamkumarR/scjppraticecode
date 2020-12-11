package ch1;


class Super{
	private int a;protected Super(int a){this.a = a;}
}
public class Sub extends Super{
	public Sub(int a) {super(a);}
	public Sub() { this(5);}

}


  abstract class Shape{
	private int x;
	private int y;
	
	public abstract void draw();
		public void setAnchor(int x,int y) {
			this.x = x;
			this.y = y;
		}
	}
	
   abstract class Circle extends Shape{
	public int radius() {return 0;}
	
}

   
   
   class Atom{
	   public Atom() {System.out.println("Atom ");}
	   
	   class Rock extends Atom{
		   Rock(String name){
			  System.out.println(name);
		   }
	   }
	   class Mountain extends Rock{
		   Mountan(){
			   super("granite");
			   new Rock("granite");
		   }
		   
	   }
   }
