package durgasoft.fileIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 *  Video 3: BufferedReader
 *  
 *   We can use BufferedReader to read character data from the file. The main advantage of
 *   BufferedReader when compared with FileReader is,we can read data line by line.
 *   In addition to Character by Character.
 *   
 *   
 *   
 *   Constructors:
 *   
 *      1. BufferedReader br = new BufferedReader(Reader r);
 *      
 *      2. BufferedReader br = new BufferedReader(Reader r,int bufferSize); 
 *      
 *    Note:     
 *        
 *        BufferedReader cant communicate directly with the file and it can communicate via
 *        Reader object.
 *        
 *        
 *        
 *     Methods:
 *     
 *         1.int read():
 *         
 *         2.int read(char[] ch):
 *         
 *         3.void close()
 *         
 *         4.String readLine();
 *               It attempts to read next line from the file and returns it. If the next line
 *               not available,this method returns null.
 *               
 *               
 *          
 * 
 */
public class FileIOEx4 {
	
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("/home/santhosh/abc.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		while(line!=null) {
			System.out.println(line);
			line=br.readLine();
		}
		br.close();
	}
	
	/*
	 * Note:
	 *     Whenever we are closing BufferedReader automatically underlying FileReader will 
	 *     be closed,and we are not required to close Explicitly.
	 * 
	 *     
	 *     The most enhanced reader to character data from the file is BufferedReader
	 *     
	 */

}
