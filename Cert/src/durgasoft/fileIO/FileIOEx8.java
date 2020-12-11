package durgasoft.fileIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * 
 * video 5:
 * 
 * 
 * Write a program to perform  file extraction operation
 * 
 */
public class FileIOEx8 {

	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("/home/santhosh/output.txt");
		BufferedReader br = new BufferedReader(new FileReader("/home/santhosh/input.txt"));
		String line = br.readLine();
		while(line!=null) {
			boolean available = false;
			BufferedReader br2 = new BufferedReader(new FileReader("/home/santhosh/delete.txt"));
			String target = br2.readLine();
			while(target!=null) {
				if(line.equals(target)) {
					available = true;
					break;
				}target = br2.readLine();
			}if(available==false) {
				pw.println(line);
			}line = br.readLine();
			pw.flush();
			pw.close();
		}

	}
}
