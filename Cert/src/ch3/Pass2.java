package ch3;

public class Pass2 {

	public static  void main(String[] args) {
		Pass2 pass = new Pass2();
		int x =6;
		pass.doStuff(x);
		System.out.println("main==="+ ++x);
		
	}



	void doStuff(int x){
		System.out.println("do stuff====> "+ x++);
	}
}
