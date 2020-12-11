package ch1;


interface  DeclareStuff{
	
	void doStuff(int t);
}
public class TestDeclare {

	public static final int EASY = 3;
	public static void main(String[] args) {
           int x = 11; int a = 1;
           new TestDeclare().doStuff(++x,a);
		
		
	}
	
	void doStuff(int s,int a) {
		//System.out.println(s);
		int s1=s+EASY + ++s;
		//System.out.println(s+ ++s);
		 System.out.println(s1);
		
	}

}
