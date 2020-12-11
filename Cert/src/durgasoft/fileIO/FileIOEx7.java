package durgasoft.fileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/*
 *  video 4:
 *  Write a program to merge the file line by line alternatively
 *  
 *  
 * 
 */
public class FileIOEx7 {
	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("/home/santhosh/file.txt");
		BufferedReader br1 = new BufferedReader(new FileReader("/home/santhosh/application.properties"));
		BufferedReader br2 = new BufferedReader(new FileReader("/home/santhosh/config-client.properties"));
		String line1 = br1.readLine();
		String line2 = br2.readLine();
		while((line1!=null)|| (line2!=null)) {

			if(line1!=null) {

				pw.println(line1);
				line1 = br1.readLine();
			}

			if(line2!=null) {
				pw.println(line2);
				line2 = br2.readLine();
			}
		}

		pw.flush();
		pw.close();



	}
}
