package ch1;


  class Target{
	private Integer i = 0;
	public int addOne() {
		return ++i;
	}
}
public class Client {

	public static void main(String[] args) {
System.out.println(new Target().addOne());
	}

}
