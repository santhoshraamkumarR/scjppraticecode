package operators_ch4;

public class Prg2 {

	public static void main(String[] args) {
		int x=6;
		Prg2 pr2=new Prg2();
		pr2.doStuff(x);
		System.out.println("main "+x);

	}


	void doStuff(int x) {
		System.out.println("doStuff "+ ++x);
	}
}
