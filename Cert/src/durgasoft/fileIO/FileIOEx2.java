package durgasoft.fileIO;

import java.io.FileWriter;
import java.io.IOException;

/*
 *  Video 2:
 *  
 *        FileWriter:
 *              We can use FileWriter to write character data to the file
 * 
 *        Constructors:
 *            1. FileWriter fw = new FileWriter(String fileName);
 *            2. FileWriter fw = new FileWriter(File f);
 *            
 *            The above FileWriter is for overriding of existing data,instead of overriding,if we
 *            want append operation,then we have to create FileWriter by using the below constructors.
 *            
 *            3. FileWriter fw = new FileWriter(String fileName,boolean append);
 *            4. FileWriter fw = new FileWriter(File f,boolean b);
 *            
 *         Note:
 *          If the specified file is not already available,then all the above constructors will
 *          create that file.
 *          
 *          Methods:
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
 *                          
 */
public class FileIOEx2 {
	public static void main(String[] args)  {
		FileWriter fw = null;
		try {
		  fw = new FileWriter("abc.txt");
		fw.write(100);
		fw.write("Durga\nSoftware solution");
		fw.write('\n');
		char ch[]= {'a','b','c'};
		fw.write(ch);
		fw.write('\n');
		
        System.out.println("Write it!");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fw.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

 

/*
 * In the above program FileWriter can perform overriding of exisiting data. Instead of overriding
 * if we want to append operation,then we have to create file writer object as follows.
 * 
 *   FileWriter fw = new FileWriter("abc.txt",true);
 * 
 * 
 * 
 * Note: Disadvantage of FileWriter:
 *       The main problem with FileWriter is,we have to insert line Separator('\n') manually,which is
 *       varied from system to system.
 *       It is difficult to the programmer.
 *       We can solve this problem by using BufferedWriter and PrintWriter classes.
 *       
 *       
 * 
/

*/