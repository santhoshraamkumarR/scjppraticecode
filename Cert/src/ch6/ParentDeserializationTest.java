//https://stackoverflow.com/questions/8141440/how-are-constructors-called-during-serialization-and-deserialization
package ch6;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ParentDeserializationTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		System.out.println("Creating:::");
		Child c=new Child(1);
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		ObjectOutputStream oos=new ObjectOutputStream(baos);
		c.field=10;
		System.out.println("Serializing");
		oos.writeObject(c);
		oos.flush();
		baos.flush();
		baos.close();
		ByteArrayInputStream bais=new ByteArrayInputStream(baos.toByteArray());
		ObjectInputStream ois=new ObjectInputStream(bais);
		System.out.println("Deserializing");
		Child c1=(Child)ois.readObject();
		System.out.println(c1.getI());
		System.out.println(c1.getField());

	}

}

class Parent {
	protected  int field;

	protected Parent() {
		field=5;
		System.out.println("Parent::Constructor");
	}

	public int getField() {
		return field;
	}

}


class Child extends Parent implements Serializable{

	protected int i;

	protected Child(int i) {
		i=1;
		System.out.println("Child::Constructor");
	}

	public int getI() {
		return i;
	}
}