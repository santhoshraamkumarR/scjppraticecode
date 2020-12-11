package ch2;

class Alpha{
	public void foo(String args)
	{ System.out.print(" Alpha:foo "); }
	public void bar(String... a)
	{ System.out.print(" Alpha:bar "); }
}

public class Beta extends Alpha {
	public void foo(String a)
	{ System.out.print(" Beta:foo "); }
	public void bar(String... a)
	{ System.out.print(" Beta:bar "); }
	public static void main(String[] argv) {
		Alpha a=new Beta();
		Beta b=(Beta)a;
		a.foo("test"); //Alpha:foo
		a.bar("test"); //Beta:bar
		b.foo("test"); //Beta:foo 
		b.bar("test"); //Beta:bar
	}

}
