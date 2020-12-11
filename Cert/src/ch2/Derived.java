package ch2;

class Base{
	
	int _x;
	public Base(int _x) {}
	
}


public class Derived extends Base {
	int _x,_y;
   Derived(int _x,int _y){
	   super(_x);
	   this._y=_y;
	   System.out.println(_x+" "+_y);
	   
   }
	
	public static void main(String[] args) {
      Base b=new Derived(5,10);
      int i;
      for( i=10;i>10;i--);
      System.out.println(i);
	}

}
