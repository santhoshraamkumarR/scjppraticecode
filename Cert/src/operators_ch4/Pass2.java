package operators_ch4;

public class Pass2 {

	public  static  void main(String[] args) {
		 int x=6;
		 Pass2 p=new Pass2();
		 p.doStuff(x);
		 System.out.println("main x="+x);
		 
		 Pass2 a=new Pass2();
		 System.out.println(a.getValue()); 

		 }

		 void doStuff(int x) {
		 System.out.println("doStuff x="+ x++);
		 }

		 public int getValue(){
			 int value=0;
			 boolean setting=true;
			 String title="Hello";
			 if(setting && title=="Hello"){return 1;}
			 if(value==0 & title.equals("Hello")){return 2;}
			return value; 
			}


}
