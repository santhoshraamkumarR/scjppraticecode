package ch1;
class Money{
	String country="Canada";
	public String getC(){return country;}
}
class Yen extends Money{
	public String getC(){return super.country;}
}
public class Euro extends Money{
	public String getC(int x){return super.getC();}
	public static void main(String[] args){
		System.out.println(new Yen().getC()+" "+new Euro().getC());
	}
}


enum A { A }
class E2{
	enum B { B }
	void C(){
		// enum D { D }
	} }

