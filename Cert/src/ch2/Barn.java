package ch2;
class Building{ } 
public class Barn extends Building { 
	public static void main(String[] args) { 
		Building build1 = new Building(); 
		Barn barn1 = new Barn(); 
		//Barn barn2 = (Barn) build1; 
		Object obj1 = (Object) build1; 
		Object str1 = (Object) barn1; 
		Barn build2 = (Barn) barn1; 
	} 
} 

