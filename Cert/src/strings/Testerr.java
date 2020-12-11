package strings;

import java.util.Scanner;

public class Testerr {
	public static void main(String[] args) {
		Scanner sc=new Scanner("JavaChamp 2009,true 239");
		while(sc.hasNext()) {
			//if(sc.hasNextBoolean()) {
				//System.out.print("Boolean");
				if(sc.hasNextInt()) {
					System.out.print("int");
					sc.next();
				}
			//}
		}
	}
}
