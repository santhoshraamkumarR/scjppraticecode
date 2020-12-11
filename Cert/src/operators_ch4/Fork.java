package operators_ch4;

public class Fork {

	public static void main(String[] args) {
       if(args.length==1 || args[1].equals("test")) {
    	   System.out.println("test case");
       }else {
    	   System.out.println("Production "+args[0]);
       }
       
       if(getFalse() && getFalse()) { }        
	    System.out.println("=============================");        
	    if(getFalse() & getFalse()) { }
       

	}
	
	public static boolean getFalse() {
	    System.out.println("Method 1");
	    return false;
	}

	 


}
