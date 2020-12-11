package durgasoft.fileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * Video 3:
 * 
 * We can use FileReader to read character data from the file.
 * 
 * Constructors:
 *   
 *   1. FileReader fr = new FileReader(String fileName);
 *   
 *   2. FileReader fr = new FileReader(File f);
 *   
 *   
 *  Methods:
 *   1. int read():
 *         It attempts to read the next character from the file and returns its unicode value.
 *         If the next character has not value,then thias method returns -1.
 *         As this method returns,unicode value (int value()),at the time of printing,we
 *         have to perform type casting.
 *         
 *         FileReader fr = new FileReader("abc.txt");
 *         int i = fr.read();
 *         while(i!=-1){
 *            s.o.p((char)i);
 *            i = fr.read();
 *         }
 *         
 *   2. int read(char[] ch):
 *               It attempts to read enough characters,from the file into char array and returns
 *               no of characters copied from the file.
 *               
 *               File  f = new File("abc.txt");
 *               char[] ch = new char((int)f.length());
 *               FileReader fr = new FileReader(f);
 *               fr.read(ch);
 *               for(char ch1:ch){
 *               s.o.p(ch1);
 *               
 *               }
 *               
 *               
 *               
 *               
 *               
 *    3. void close():
 *               
 *                          
 *                          
 *               
 */
public class FileIOEx3 {
	
	public static void main(String[] args) throws IOException {
		
		
		//1st approach:
		FileReader fr1 = new FileReader("/home/santhosh/Service_Flow");
		int i = fr1.read();
		while(i!=-1) {
			System.out.print((char)i);
			i = fr1.read();
		}
		System.out.println("********************");
		//2nd approach
		File f = new File("/home/santhosh/Service_Flow");
		FileReader fr = new FileReader(f);
		char[] ch = new char[(int)f.length()];
		fr.read(ch);
         for(char ch1:ch) {
        	 System.out.print(ch1);
         }
		
		
		
	}

}
/*
Disadvantage:
    
    Usage of  FileWriter and  FileReader is not recommandable,because
     1.While writing data by FileWriter,we have to insert line separator(\n) manually,which is varied
     from system to system. It is difficuilt to the programmer.
     
     2.By using FileReader, we can read data character by character which is not convinent to the
      programmer.
      
   To overcome these problems,we should go for BufferedWriter and BufferedReader.
   
      
      
      
     
     
     
     
     
     
     
     
    
    
    


*/