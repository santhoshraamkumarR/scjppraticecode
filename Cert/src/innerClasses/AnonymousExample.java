package innerClasses;

public class AnonymousExample {

	
	public static void main(String[] args) {
		AnonymousExample ae = new AnonymousExample(); 
		Popcorn pcn = new Popcorn();
		Popcorn pc = new Popcorn() {
			public void p1() {
				System.out.println("Created the Ananymous class");
			}
			
		};
		Popcorn pc2 = new Popcorn() {
			public void p1() {
				System.out.println("Created the second Ananymous class ");
			}
			
		};
		pc.p1();
		pc2.p1();
		System.out.println(ae.getClass().getName());
		System.out.println(pcn.getClass().getName());
		System.out.println(pc.getClass().getName());
		System.out.println(pc2.getClass().getName());
	}
}


class Popcorn{
	public void p1() {
		System.out.println("Taste");
	}
	
	
}