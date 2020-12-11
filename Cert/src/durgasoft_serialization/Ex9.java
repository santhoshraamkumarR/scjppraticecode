package durgasoft_serialization;
/*
 * Video 9:
 *         
 *      We can customize multiple values,but we have to follow the same order.
 * 
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account1 implements Serializable{
	String username = "Username";
	transient String password = "Test123";
	transient int pinNum = 1234;
	
	private void writeObject(ObjectOutputStream os) throws Exception{
		os.defaultWriteObject(); //Default serialization
		String encPwd = "123"+password;
		int ePinNum =1234+pinNum;
		os.writeObject(encPwd);
		os.writeInt(ePinNum);
	}
	
	private void readObject(ObjectInputStream is) throws Exception{
		is.defaultReadObject(); //Default De-Serialization
		String encPwd = (String)is.readObject();
		int ePin = (Integer)is.readInt();
		password = encPwd.substring(3);
		pinNum =  ePin-1234;
	}
}
public class Ex9 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		 Account1 acc = new Account1();
		  FileOutputStream fos = new FileOutputStream("acc1.txt");
		  ObjectOutputStream oos = new ObjectOutputStream(fos);
		  oos.writeObject(acc);
		  
		  FileInputStream fis = new FileInputStream("acc1.txt");
		  ObjectInputStream ois = new ObjectInputStream(fis);
		  Account1 a1 = (Account1)ois.readObject();
	      System.out.println(a1.username +"..."+a1.password+"..."+a1.pinNum);

	}

}
