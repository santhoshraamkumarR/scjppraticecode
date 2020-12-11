package ch1;



class AA{
	private static int counter = 0;
	public static int  getInstance() {
		return counter;
	}
	
	public AA() {
		counter++;
	}
}
public class BB {

	public static void main(String[] args) {
            AA a1 = new AA();
            AA a2= new AA();
            AA a3 = new AA();
            System.out.println(AA.getInstance());
            
            
            String[] elements = {"for","one","two"};
            String first = (elements.length>0)?elements[0]:null;
            System.out.println(first);
	}

}
