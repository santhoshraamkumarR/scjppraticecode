package ch9;

public class Test2 {

	public enum Dogs {collie, harrier, shepherd}; 
	 public static void main(String [] args) { 
	 Dogs myDog = Dogs.shepherd; 
	 switch (myDog) { 
	 case shepherd: 
		 System.out.print("harrier "); 
	 case collie: 
	 System.out.print("collie "); 
	   default: 
	 System.out.print("retriever "); 
	 
  } 
} 

}
