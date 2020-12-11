package ch1;

import static ch1.BitUtils.process;
public class SomeApp1 {

	public static void main(String[] args) {
		byte [] bytes = new byte[256];
		//BitUtils bit =new BitUtils();
		 process(bytes);
		 Example ex = Example.ONE;
//		 if(ex.equals("ONE")) {
//			 System.out.println("Hello");
//		 }else {
//			 System.out.println(ex);
//		 }
		 if(Example.ONE==Example.ONE) {
			 System.out.println("Hello");
		 }else {
			 System.out.println("Hi");
		 }
		
		
	}

}
enum Example{ONE,TWO,THREE};