package durgasoft_serialization;
/*
 * Video 10:
 *       Serialization with Inheritance:
 * 
 * case 1:
 *          Parent implements serializable
 *          child not implements serializable
 *          
 * Case 2:  
 *           Parent not implements serializable
 *           child  implements serializable
 *          
 *     If parent is serializable,then by default every child is Serializable. ie by nature serializable 
 *     is inheriting from Parent to Child.
 *     
 *     Hence eventhough child class does not implement serializable,if parent class implements serializable
 *     then we can serialize the child class object.
 *     
 *     
 *     1. Object class does not  implements Serializable .
 *     2. Generic Servlet implements Serializable.
 *              So all servlet class in java,so all the servlet child class in java are serializable
 *                  
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animal implements Serializable{
	int i=10;
}



class Dog extends Animal{
	int j=100;
}
public class Ex10 {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		Animal a = new Animal();
		Dog d = new Dog();
		 FileOutputStream fos = new FileOutputStream("animal.txt");
		  ObjectOutputStream oos = new ObjectOutputStream(fos);
		  oos.writeObject(d);
		  
		  FileInputStream fis = new FileInputStream("animal.txt");
		  ObjectInputStream ois = new ObjectInputStream(fis);
		  Dog d2 = (Dog)ois.readObject();
		  System.out.println(d2.i+" "+d2.j);
	}

}
