package durgasoft.fileIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * 
 * Write  a program to merge data from two files into a third file
 * 
 * 
 * 
 */
public class FileIOEx6 {
public static void main(String[] args) throws IOException {
	PrintWriter pw = new PrintWriter("/home/santhosh/file.txt");
	BufferedReader br = new BufferedReader(new FileReader("/home/santhosh/application.properties"));
	String line = br.readLine();
	while(line!=null) {
		pw.println(line);
        line = br.readLine();		
	}
	
     br = new BufferedReader(new FileReader("/home/santhosh/config-client.properties"));
     line = br.readLine();
     while(line!=null) {
    	 pw.println(line);
    	 line = br.readLine();
     }
     
     pw.flush();
     pw.close();
     
     
}
}
