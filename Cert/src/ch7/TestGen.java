package ch7;


class Gen<T>{
	private T object;
	
	public Gen(T object) {
		this.object = object;
	}

	public T getObject() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}
	
	
	
}
public class TestGen {
	public static void main(String[] args) {
		
	
Gen<String> str = new Gen<String> ("Yes");
Gen<Integer> ints = new Gen<Integer>(10);
System.out.println(str.getObject() + " "+ints.getObject());
}
}