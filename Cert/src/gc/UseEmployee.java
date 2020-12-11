package gc;

 class Employee {

	
	private int ID;
	
	private String name;
	
	private int age;
	
	private static int nextID = 1;
	
	
	public Employee(String name,int age) {
		this.name = name;
		this.age = age;
		this.ID = nextID++;
	}
	
	
	public void show() {
		System.out.println("ID: "+ID+" Name: "+name+" Age: "+age); 
	}
	
	public void showNextID() {
		System.out.println("Next ID: "+nextID);
	}
}

class UseEmployee{
	public static void main(String[] args) {
		Employee e1 = new Employee("GFG1",22);
		Employee e2 = new Employee("GFG2",23);
		Employee e3 = new Employee("GFG2",24);
		e1.show();
		e2.show();
		e3.show();
		e1.showNextID();
		e2.showNextID();
		e3.showNextID();
		
		{
			Employee x = new Employee("GFG4",25);
			Employee y = new Employee("GFG5",26);
			x.show();
			y.show();
			x.showNextID();
			y.showNextID();
		}
		e1.showNextID();
	}
	
}
