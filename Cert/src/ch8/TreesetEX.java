package ch8;

import java.util.Comparator;
import java.util.TreeSet;

public class TreesetEX implements Comparator<StringBuffer>{

	public static void main(String[] args) {
		TreeSet<StringBuffer> t = new TreeSet<>(new TreesetEX());
		t.add(new StringBuffer("100"));
		t.add(new StringBuffer("200"));
		System.out.println(t);
		
		ComparatorEx comp = new ComparatorEx();
		comp.compareVal();
	}




	@Override
	public int compare(StringBuffer o1, StringBuffer o2) {
		// TODO Auto-generated method stub
		return o1.toString().compareTo(o2.toString());
	}
}





class ComparatorEx implements Comparator{

	public void compareVal() {
		TreeSet<Integer> tset = new TreeSet<Integer>(new ComparatorEx());
		tset.add(1);
		tset.add(250);
		tset.add(3);
		tset.add(100);
		tset.add(50);
		System.out.println(tset);

	}

	public int compare(Object o1,Object o2) {
		Integer i1 = (Integer)01;
		Integer i2 = (Integer)o2;
		if(i1<i2)
			return +1;
		else if(i1 > i2)
			return -100;
		else return 0;
	}
}