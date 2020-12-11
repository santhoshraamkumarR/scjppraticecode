package gc;


class Test1{
	int i;
	Test1(){}
	Test1(int i){this.i = i;}
}
public class TestPassByValue {

	public static void main(String[] args) {
     Test1 t = new Test1(5);
     
     change(t);
		System.out.println(t.i);
		
		
	}
	
	public static void change(Test1 t) {
		
		t = new Test1();
		
		t.i = 10;
	}

}
