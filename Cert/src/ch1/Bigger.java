package ch1;

public class Bigger {
	public static void main(String[] args){
		Better.Faster f=Better.Faster.Higher;
		Better.Faster f2; f2=Better.Faster.Longer;
	}
		}
		class Better{
		enum Faster{ Higher, Longer };
		}

