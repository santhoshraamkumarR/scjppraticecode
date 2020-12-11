package strings;

public class Tester {

	public static void main(String[] args) {
       String stmt="JavaChamp is here to help you";
       for(String token:stmt.split("//s")) {
       System.out.println(token +" ");
       }
	}

}
