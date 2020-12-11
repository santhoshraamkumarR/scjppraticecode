package ch1;

class TestA {
	private static int counter = 0;

	public static int getInstanceCount() {
		return counter;
	}

	public TestA() {
		counter++;
	}
}
class TestB{
	public static void main(String[] args) {
		TestA a = new TestA();
		TestA a1 = new TestA();
		TestA a2 = new TestA();
		System.out.println(TestA.getInstanceCount());
		String[] elements={"for","tea","too"};
		String first=(elements.length > 0)?elements[0]:null;
		System.out.println(first);
		
	}
}
