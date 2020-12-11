package operators_ch4;

public class Twisty {
	{index=1;}
	int index;
	public static void main(String[] args) {
     new Twisty().go();
		
		
	}
	
	void go() {
		int[][] dd= {{9,8,7}, {6,5,4}, {3,2,1,0},{9,8,7}, {6,5,4}, {3,2,1,0,5,6,7,8,9,10,11}};
		System.out.println(dd[index++][index++]);
		System.out.println(index);
	}

}
