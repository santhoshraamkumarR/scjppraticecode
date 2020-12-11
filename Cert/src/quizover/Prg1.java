package quizover;

public class Prg1 {
	public static void main(String[] args) {
		boolean stmt1 = "champ" == "champ";
		boolean stmt2 = new String("champ") == "champ";
		boolean stmt3 = new String("champ")== new String("champ");
		System.out.println(stmt1 && stmt2 || stmt3);
		
		 boolean stmt11 = "champ" == "champ";
		    boolean stmt22 = new String("champ").equals(new String("champ"));
		    boolean stmt33 = "champ".toString()=="champ";
		    
		    System.out.println(stmt11 && stmt22 && stmt33); 
		
	}

}
