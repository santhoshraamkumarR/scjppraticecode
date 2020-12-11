package ch2;

public class Yikes {

	public static void go(Long n) {System.out.println("Long ");}
	public static void go(short n) {System.out.println("Short ");}
	public static void go(int n) {System.out.println("int ");}
	public static void go(double n) {System.out.println("double ");}
	
	public static void main(String [] args) {
	short y = 6;
	long z = 7;
	go(y);
	go(z);

	}
}
