package ch3;


class Foo{
	public void doStuff() {}
}


class Bar extends Foo{
	public void doStuff() {}
}
public class ClassTest {
int x=5;
	public static void main(String[] args) {
		Foo f=new Bar();
		//Bar b=new Foo();
		//System.out.println(x);
	}

}
