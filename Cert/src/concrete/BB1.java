package concrete;

 
class AA1 {
	 int a = 5;
	 protected int b = 6;
	 public int c = 7;
}
public class BB1 {
  public static void main(String[] args) {
	  AA1 a = new AA1();
	 System.out.print(" " + a.a); 
	 System.out.print(" " + a.b); 
	 System.out.println(" " + a.c); 
  }
}
