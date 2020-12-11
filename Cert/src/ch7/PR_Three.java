package ch7;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class PR_Three {

	public static void main(String[] args) {
		PR_Three pr3=new PR_Three();
		pr3.before();
	}
		public static void before() {
			Set set = new TreeSet();
			set.add("2");
			set.add(3);
			set.add("1");
			Iterator it = set.iterator();
			while (it.hasNext())
			System.out.print(it.next() + " ");
			}
	}

