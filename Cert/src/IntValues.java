
public class IntValues {

	public static void main(String[] args) {
		long[] a=new long[10];
		a[0]=97;//(valid)
		a[1]='a';//(valid)
		byte b=10;
		a[2]=b;//(valid)
		short s=20;
		a[3]=s;//(valid)
		a[4]=10l;           
	}

}
