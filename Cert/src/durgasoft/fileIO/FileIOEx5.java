package durgasoft.fileIO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * Video 4: PrintWriter
 * 
 *  It is the most enhanced writer to write the character data to the file.
 *  
 *  The main advantage of PrintWriter over FileWriter and BufferedWriter is we can write
 *  any type of primitive type of data to the file.
 *  
 *  Constructor:
 *   1. PrintWriter pw = new PrintWriter(String fileName);
 *   
 *   2. PrintWriter pw = new PrintWriter(File f);
 *   
 *   3. PrintWriter pw = new PrintWriter(Writer w);
 *   
 *   Note:
 *    PrintWriter can communicate directly with the file and can communicate via some writer
 *    object also.
 *    
 *   Methods:
 *    
 *    1. write(int ch)
 *    
 *    2. write(String s)
 *    
 *    3. write(Char[] ch)
 *    
 *    4. void flush()
 *    
 *    5. void close();
 *    
 *    
 *    6. print(char ch)
 *    
 *    7. print(int i)
 *    
 *    8. print(double d)
 *    
 *    9. print(boolean b)
 *    
 *    10. print(String s)
 *    
 *    11. println(char ch)
 *    
 *    12. println(int i)
 *    
 *    13. println(boolean b)
 *    
 *    14. println(double d)
 *    
 *    15. println(String s)
 *    
 *    
 *    
 *    Ques:
 *     What is the difference between write(100) and print(100)?
 *           In the case of write(100),the corresponding character 'd' will be added to the
 *           file.
 *           
 *           But in the case of print(100),int value 100 will be added to the file directly.
 *      
 *  
 *   Note:
 *    The most enhanced writer is to write character data to the file is PrintWriter,whereas
 *    the most enhance reader to read character data from the file is BufferedReader.
 *   
 *    
 *    In general we can use readers and writers to handle character data(Text data),whereas we can
 *    use streams to handle Binary data(Images,PDF,Video/Audio files.......).
 *    
 *    We can use output stream to write binary data to the file, 
 *    Input stream to read binary data from the file.
 *    
 *    
 *    
 *    
 *    
 *    
 *    
 *    
 *    
 *    
 *    
 *    
 *    
 *    
 *    
 *    
 *    
 *    
 *    
 *    
 *    
 *    
 * 
 * 
 */
public class FileIOEx5 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("/home/santhosh/abc.txt");
		PrintWriter pw = new PrintWriter(fw);
		pw.write(100);
		pw.println("100");
		pw.println("Durga");
		pw.println(20.0);
		pw.flush();
		pw.close();
		
		
		
		 
		
		
		
	}
}
