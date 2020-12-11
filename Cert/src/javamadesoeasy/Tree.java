package javamadesoeasy;
 class Plant {
	 public Plant() { this("fern"); }
private String name;
public Plant(String name) { this.name = name; }
public String getName() { return name; }
}
public class Tree {
	public void growFruit() { 
		System.out.println("Grow fruit method");
		
	}
	 public void dropLeaves() {
		 System.out.println("Drop leaf method");
	 }
	public static void main(String[] args) {
		Tree t  = new Tree();
		t.dropLeaves();

	}

}
