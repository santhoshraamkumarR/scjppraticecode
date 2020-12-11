package concrete.part2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 
 *  Continuation of Video 3: BufferedWriter
 *  
 *   1. We can use BufferedWriter to write character data to the file.
 *   
 *   Constructors:
 *    
 *    1. BufferedWriter bw  = new BufferedWriter(Writer w);
 *    
 *    
 *    2. BufferedWriter bw = new BufferedWriter(Writer w, int bufferSize);
 * 
 * 
 *    Note:
 *        BufferedWriter cant communicate directly with the file,it can communicate via some
 *        Writer object.
 *        
 *     Ques:
 *      Which of the following are valid?
 *           BufferedWriter bw = new BufferedWriter("abc.txt"); //Invalid
 *           BufferedWriter bw = new BufferedWriter(new File("abc.txt")); //Invalid 
 *           BufferedWriter bw = new BufferedWriter(new FileWriter("abc.txt")); //valid
 *           
 *           Two level buffering for increasing the performance:
 *           BufferedWriter bw = new BufferedWriter(new BufferedWriter(new FileWriter("abc.txt"))); //valid
 *           
 *     Methods:
 *        As we seen in FileWriter we are having the same 5 methods and
 *          1. write(int ch):
 *                   To write a single character
 *                   
 *          2. write(char[] ch):
 *                   To write an array of characters
 *          
 *          3. write(String s):
 *                      To  write a string to the file   
 *                      
 *          4. flush():
 *                 To give the guarantee that total data including last character will be return
 *                 to the file.
 *                 
 *          5. close();
 *                   To close the writer.
 *        
 *           6. newLine() //To insert a newLine character
 *        
 *        
 *        1.When compared with FileWriter,which of the following capability available extra in method
 *        form in BufferedWriter? 
 *          A: newLine() //To insert a newLine character
 *               
 * 
 */
public class FileIOEx4 {
 public static void main(String[] args) throws IOException {
	BufferedWriter bw = new BufferedWriter(new FileWriter("/home/santhosh/abc.txt"));
	bw.write(100);
	bw.newLine();
	bw.write("Test");
	bw.newLine();
	bw.write("1234");
	bw.newLine();
	bw.flush();
	bw.close();
	
	/* Whenever we are closing BufferedWriter,automatically internal FileWriter will be closed
	 * and we are not required to close explicitly.
	 * 
	 * 
	 * 
	 */
	
	
	
	 
	 
}
}
