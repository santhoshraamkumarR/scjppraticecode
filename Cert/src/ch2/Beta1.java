package ch2;

class Alpha11 { 
	//public void foo() { System.out.print("Afoo "); } 
	public void foo()
	{ System.out.print(" Alpha:foo "); }
	public void bar(String... a)
	{ System.out.print(" Alpha:bar "); }
} 
public class Beta1 extends Alpha11 { 
	public void foo() { System.out.print("Bfoo "); } 
	public static void main(String[] args) { 
		Alpha11 a = new Beta1(); 
		Beta1 b = (Beta1)a; 
		a.foo(); 
		//a.foo("test");
		b.foo(); 
	} 
} 
