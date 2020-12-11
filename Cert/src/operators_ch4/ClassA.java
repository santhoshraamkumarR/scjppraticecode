package operators_ch4;

public class ClassA {
//	public int  getValue() {
//		 int value=0;
//		  boolean setting = true;
//		  String title="Hello";
//		  if (value ==0 || (setting && title =="Hello")) {
//			  return 1; }
//		  if (value == 1 & title.equals("Hello")) {
//			  return 2; }
//		  
//		return 20;
//		  
//		  }
	
	
	public int getValue(){
		 int value=0;
		 boolean setting=true;
		 
		 String title="Hello";
		 if(value==0||(setting==true && title=="Hello")){return 1;}
		 if(value==0 & title.equals("Hello")){return 2;} 
		 return 10;
		}
	public static void main(String[] args) {
		ClassA a = new ClassA();
		System.out.println(a.getValue());
	}

}
