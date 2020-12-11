package ch2;

  class TestInterface implements DeclareStuff{

	public static void main(String[] args) {
		int x = 5;
		new TestInterface().doStuff(++x);	
	}


   public void doStuff(int s) {
s += EASY + ++s;

 System.out.println("s " + s);
 }
}