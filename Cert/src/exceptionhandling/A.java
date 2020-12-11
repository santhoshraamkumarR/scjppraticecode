package exceptionhandling;

import java.io.IOException;

class A { 
	public void process() throws Exception { System.out.print("A,"); } 
	class B extends A { 
		public void process() throws Exception { 
			super.process();  System.out.print("B,"); 
			throw new IOException(); 
		}  
		
	}
	public static void main(String[] args) throws Exception  { 
		try { new A().new B().process(); } 
		catch (IOException e) { System.out.println("Exception"); }} 
	
}
