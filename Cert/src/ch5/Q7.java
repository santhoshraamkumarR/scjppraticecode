package ch5;

public class Q7  {
	String str="a";

	void a() {
		try {
			str+="b";
			b();
		}catch(Exception e) {
			str+="c";
		}
	}

	void b() throws Exception {
		try {
			str+="d";
			c();
		}catch(Exception e) {
			 throw new Exception();
		}finally {
			str += "e";
		} str += "f";
	}


	void c() throws Exception {
		throw new Exception();
	}

	void display() {
		System.out.println(str);

	}
	public static void main(String[] args) {
		Q7 q=new Q7();
		q.a();
		q.display();
	}

}
