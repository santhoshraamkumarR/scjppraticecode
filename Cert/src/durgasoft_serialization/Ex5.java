package durgasoft_serialization;
/*
 * Video 5:
 *          Object Graph:
 *                Whenever we serialize an object,the set of all objects which are reachable from the
 *                Object is called is called Object Graph. 
 *                
 *                In object graph,every object should be serializable,otherwise we will get
 *                iNotSerializableException.
 *          
 * 
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog1 implements Serializable{
	Rat1 r1 = new Rat1();
}

class Rat1 implements Serializable{
	Cat1 c1 = new Cat1();
}

class Cat1 implements Serializable{
	int i = 15;
}

public class Ex5 {
	public static void main(String args[]) throws IOException, ClassNotFoundException {
		Dog1 d1 = new Dog1();
		//Serializable
		FileOutputStream fos = new FileOutputStream("obj.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
	
		//De Serializable:
		FileInputStream fis = new FileInputStream("obj.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog1 d2 = (Dog1)ois.readObject();
		System.out.println(d2.r1.c1.i);
		
		
		
		
		
	}

}
