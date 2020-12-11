package common_prgms;

class Class {

	 int[] cls = {1,2,3,4,5,6,7,8,9,10};
	 
	 static int cnt= 0;
		{
			cnt+=1;
		}
	 
	}
	public class College {
		static int cnt= 0;
		{
			cnt+=1;
		}
	         public static void main(String[] args) {
	                College [] c = new College[3];
	                c[0] = new College();
	                College co = new College();
	                c[1] = co;
	                co = null;
	                c[1] = null;
	                System.out.println(co.cnt);
	                System.out.println(Class.cnt);
	       }
	} 
