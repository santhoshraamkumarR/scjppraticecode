package ch2;
class Bird{ {System.out.print("b1");}
public Bird() {System.out.print("b2");}
}




class Raptor extends Bird{
	static {System.out.println("r1 ");}
	public Raptor() {System.out.println("r2 ");}
	{ System.out.print("r3 "); } 
	static { System.out.print("r4 "); } } 

class Hawk extends Raptor{
	public static void main(String[] args) {
		System.out.println("Pre");
		new Hawk(); {
			System.out.println("Hawk");
		}

	}

}
