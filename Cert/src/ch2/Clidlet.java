package ch2;

class Clidder{
	public  void flipper() {
		System.out.println("Clidder");
	}
}

public class Clidlet extends Clidder{
	public  void flipper() {
		System.out.println("Cliddet");
	}
	public static void main(String[] args) {

		Clidder c=	new Clidder();
		c.flipper();
	}

}
