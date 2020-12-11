package operators_ch4;

public class Prg6 {

	public static void main(String[] args) {
     short s=15;
     boolean b;
     for(int i=0; i<9; ++i){
         Object input = null;
          showPremitive(input);//check for every input
     //} 
     if(input instanceof Short ) {
    	 
     }
     }
     
	}
	
	
	public static void showPremitive(Object input){
	    try{
	            if (input instanceof Short)
	                System.out.println("Primitive : short");
	            else if(input instanceof Integer)
	                System.out.println("Primitive : int");
	            else if(input instanceof Long)
	                System.out.println("Primitive : long");
	            else if(input instanceof Float)
	                System.out.println("Primitive : float");
	            else if(input instanceof Double)
	                System.out.println("Primitive : double");        
	            else if(input instanceof Boolean)
	                System.out.println("Primitive : bool");
	            else if(input instanceof Character)
	                System.out.println("Primitive : char");
	            else if(input instanceof Byte)
	                System.out.println("Primitive : byte");
	            else  
	                System.out.println("Reference : string");
	         }  
	    catch (Exception e){
	        System.out.println("Exception occur = "+e);
	    }
	}
}
	
	
	
