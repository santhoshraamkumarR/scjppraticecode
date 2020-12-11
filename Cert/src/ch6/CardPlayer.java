package ch6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Player{
	Player(){System.out.println("P");}
}
public class CardPlayer extends Player  {
	CardPlayer() {System.out.println("C");}


	public static void main(String[] args) {
		CardPlayer c1=new CardPlayer();
		try {
			FileOutputStream fos=new FileOutputStream("play.txt");
			ObjectOutputStream os=new ObjectOutputStream(fos);
			os.writeObject(c1);os.close();
			FileInputStream fis=new FileInputStream("Play.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			CardPlayer c2=(CardPlayer) ois.readObject();
			ois.close();

		}catch(Exception e) {

		}
	}

}
