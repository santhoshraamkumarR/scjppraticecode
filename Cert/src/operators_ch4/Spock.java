package operators_ch4;

public class Spock {

	public static void main(String[] args){
		 Long tail=2000L;
		 Long distance=1999L;
		 Long story=1000L;
		if((tail>distance)^((story*2)==tail))
		 System.out.println("O/p is 1");
		if(((distance+1!=tail)^((story*2)==distance)))
		System.out.println("o/p is 2");
		System.out.println(4^5);
		
		int x=10 , y=15 ;
    	if(++x > 10  ||  ++y > 15) {    //instead of || using  &,&&, | operators
    	// x++;
    	}
    	else {
    		y++;
    	}
    	
    	System.out.println(x+"----"+y);
    	 Integer i=42;
    	 String s=(i<42)?"life":(i>50)?"universe":"everything";
    	 System.out.println(s);
    	 Short  s1=15;
    	 Boolean b;
    	 b= (s1 instanceof Short);
    	 b = (s1 instanceof Object );
    	// System.out.println(b);
    	 
    	 float f1=2.3f;
    	 float[][] f2={{42.0f},{1.7f,2.3f},{2.6f,2.7f}};
    	 float[] f3={2.7f};
    	 Long x1=42L;
    	 if(f3==f2[2])





 {
    		 System.out.println(true);
    		 
    	 }
    		 
    	 
    	 if(args.length==1 ||args[1].equals("test")){
    		  System.out.println("test case");
    		 }
    		 else{
    		  System.out.println("production :"+args[0]);
    		 }
    	 Integer x11=0;
    	 Integer y11=0;
    	 for(Short z=0;z<5;z++)
    	 if((++x11>2)||(++y11>2))
    	 x11++;
    	 System.out.println(x11+" "+y11);
    		 
    		 
    	 
		}
	
	
	
	

		}
