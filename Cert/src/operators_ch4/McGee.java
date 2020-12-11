package operators_ch4;

enum Days{
	M,T,W,TH,FR,SA,SU;
}
public class McGee {

	public static void main(String[] args) {
		Days d1=Days.TH;
		Days d2=Days.M;
		for(Days d:Days.values()) {
			if(d.equals(Days.M))break;
			System.out.print(" d is ---> "+d);
			d2=d1;
			//System.out.println(d1.values());
		}System.out.println((d1==d2)?"Same Old":"New Age");
	}

}
