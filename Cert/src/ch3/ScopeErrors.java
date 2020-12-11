package ch3;

public class ScopeErrors {

	public static void main(String[] args) {
		ScopeErrors se=new ScopeErrors();
		se.go();
	}
	void go() {
		int y=5;
		go2(y);
		y++;
		System.out.println(y);
		
	}
	
	void go2(int y) {
		y++;
		
	}

}
