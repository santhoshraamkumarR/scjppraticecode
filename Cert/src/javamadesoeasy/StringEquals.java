package javamadesoeasy;

public class StringEquals {

	public static void main(String[] args) {
		 String s1 = new String("abc");
		    String s2 =  new String("abc");
		    if(s1 == s2)
		        System.out.println(1);
		    else
		        System.out.println(2);
		    if(s1.equals(s2))
		        System.out.println(3);
		    else
		        System.out.println(4);
		   // o/p: 2,3
		    
		    
		    //What gets printed when the following code is compiled and run. Select the one correct answer.
		    int i = 1;
		    do {
		        i--;
		    } while (i > 2);
		    System.out.println(i);
		    //o/p: 0
		    
		    
		    
	}

}
