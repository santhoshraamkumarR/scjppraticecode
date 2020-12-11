package ch2;
class Parent{
	private String name;
	public Parent(String name) {
		this.name = name;
		 
	}
	
	//public Parent() { this("fern"); } 
	public String getName() {
		return name;
	}
	
	
}
public class Tre extends Parent{
  public Tre() {
	  super("fe");
	  
  }
	 
	
	public void growFruit() {}
	public void dropLeaves() {}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
