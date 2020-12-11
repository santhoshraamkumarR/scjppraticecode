package regExp;
import java.util.regex.*;
public class RegularExpressionDemo {

	public static void main(String[] args) {
		int count = 0;
		Pattern p =  Pattern.compile("b");
		Matcher m = p.matcher("aabbccab");
		while(m.find()) {
			count++;
			//System.out.println(m.start()+" --- "+m.end()+" --- "+m.group());
		}//System.out.println("Count is  "+count);


		Pattern p1 = Pattern.compile("aaa");
		Matcher m1 =p1.matcher("a*");
		while(m1.find()) {
			count++;
			System.out.println(m1.start()+"---"+m1.end()+""+m1.group());
		}


		Pattern p2 = Pattern.compile("\\.");
		String[] split =p2.split("Software.solution");
		for(String output:split) {
			System.out.println(output);
		}


		Pattern p3 = Pattern.compile("[Kk]");
		Matcher m3 = p3.matcher("aaKk");
		while(m3.find()) {
			count++;
			if(m3.find()) {
				System.out.println(m3.start()+"---"+m3.group());
			}
			else {
				System.out.println("End");
			}


			Pattern p4 = Pattern.compile("[a-zA-Z$][a-zA-Z0-9$]+");
			Matcher m4 = p4.matcher(args[0]);
			if(m4.find()) {
				System.out.println("Equals");
			}else {System.out.println("Not Equals");}
		}

		//Mobile no validation
		Pattern  p5 = Pattern.compile("[7-9][0-9]{9}");
		Matcher m5 = p5.matcher(args[0]);
		if(m5.find()&&m5.group().equals(args[0]))
		{
			System.out.println("valid number");
		}
		else
		{
			System.out.println("invalid number");
		}

	}

}
