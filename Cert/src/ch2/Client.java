package ch2;
class AClient{
	
	String name = "A";
	String getName() {
		return name;
	}
	
	String greeting() {
		return "Class A";
	}
}


class BClient extends AClient{
	String name = "B";
	/*String getName() {
		return name;
	}*/
	
	String greeting() {
		return "Class B";
	}
}


public class Client {

	public static void main(String[] args) {
      AClient a = new AClient();
      BClient b = new BClient();
      System.out.println(a.greeting() +"  "+a.getName() +" name");
      System.out.println(b.greeting() +" "+b.getName() +" name");
		
		
	}

}
