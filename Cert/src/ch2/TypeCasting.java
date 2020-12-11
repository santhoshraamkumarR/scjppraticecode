package ch2;

public class TypeCasting {

	public static void main(String... args) {
		IntEx ex=new IntEx();
		byte b = 5;
		ex.method(b);
		
		AEx aex = new BEx();
		aex.message(5);
	}
	
}



class AEx
{
public void message(int i)
{
System.out.println("message from A");
}
}

class BEx extends AEx
{

public void message(int i)
{
System.out.println("message from B");
}
}

class IntEx{
	
	public void method(Integer i) {
		System.out.println("Integer type");
	}
	
	
	public void method(long l) {
		System.out.println("Long  type");
	}
	
	
	
	public void method(byte b) {
		System.out.println("byte type");
	}
	
}