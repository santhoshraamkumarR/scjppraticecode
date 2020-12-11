package durgasoft_serialization;
/*
 * Video 6,7 & 8:
 *        Customized Serialization:
 *           In default serialization,there may be chance of loss of data due to transient keyword.
 *           To overcome from the problem,then we can go with the Customized exception.
 *           
 *           We can use the below two methods in the particular class to avoid loss of data:
 *               private void writeObject(ObjectOutputStream) throws Exception - > @ Serialization
 *               
 *               private void readObject(ObjectInputStream) throws Exception @ DeSerialization
 *               
 *               
 * 
 *      These methods are callback methods,because these methods will be executed by JVM
 *     
 *      Note:
 *           If JVM finds the above two methods,it will call these methods and it won't perform
 *           default serialization.
 *      
 *      
 *      
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable{
	String username = "Username";
	transient String password = "Test123";
	
	private void writeObject(ObjectOutputStream os) throws Exception{
		os.defaultWriteObject(); //Default serialization
		String encPwd = "123"+password;
		os.writeObject(encPwd);
	}
	
	private void readObject(ObjectInputStream is) throws Exception{
		is.defaultReadObject(); //Default De-Serialization
		String encPwd = (String)is.readObject();
		password = encPwd.substring(3);
	}
}
public class Ex6 {
  public static void main(String[] args) throws IOException, ClassNotFoundException {
	  Account a = new Account();
	  //Serializable
	  FileOutputStream fos = new FileOutputStream("acc.txt");
	  ObjectOutputStream oos = new ObjectOutputStream(fos);
	  oos.writeObject(a);
	  
	  FileInputStream fis = new FileInputStream("acc.txt");
	  ObjectInputStream ois = new ObjectInputStream(fis);
	  Account a1 = (Account)ois.readObject();
      System.out.println(a1.username +"..."+a1.password);
}
}
