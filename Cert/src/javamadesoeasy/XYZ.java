
//https://www.javamadesoeasy.com/2018/07/scjp-ocjp-dumps-2.html
package javamadesoeasy;

public class XYZ {

	public static void main(String... args) {
		for(int i=0;i<2;i++) {
			for(int j=2;j>=0;j--) {
				if(i==j)break;
					System.out.println(" i == "+i+"  j == "+j);
			}
		}
	}

}
