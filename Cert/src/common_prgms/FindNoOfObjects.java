//https://www.geeksforgeeks.org/count-number-of-a-class-objects-created-in-java/
package common_prgms;

public class FindNoOfObjects {

	static int objCnt = 0;
	
	{
		objCnt+=1;
	}
	
	public static void main(String[] args) {
		FindNoOfObjects f1 = new FindNoOfObjects();
		FindNoOfObjects f2 = new FindNoOfObjects();
		
		  System.out.println(FindNoOfObjects.objCnt);
	}

}
