package ch2;

enum Element {
	EARTH,WIND,

	Fire { public String info() {
		return "HOT";}
	};

	public String info() {return "element";}
	public static void main(String[] args) {
		String e=Element.Fire.info();
		System.out.println(e);
	}
}




