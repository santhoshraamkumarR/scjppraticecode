package ch2;

class One{
	public One foo() {
		return this;}
}

class Two extends One{
	public Two foo() {return this;}
	public One foo1() { return this; }
}
public class Three extends Two {
	public Two foo() {return this;}
	public One foo1() { return this; }
	
	public static void main(String[] args) {
		Three three = new Three();
		three.foo();
	}
}
