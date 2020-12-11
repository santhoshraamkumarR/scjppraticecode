package ch1;

class Foo{
	static void alpha() {
		System.out.println("alpha method");
	}
	
	static void beta() {
		System.out.println("beta method");
	}
}

public class Prg1 {

	public static void main(String[] args) {
		Foo.alpha();
		Foo foo = new Foo();
		foo.beta();
	}

}
