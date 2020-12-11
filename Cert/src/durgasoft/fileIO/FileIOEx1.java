package durgasoft.fileIO;

import java.io.File;
import java.io.IOException;

/*
 *  //video 1
 *   1. File
 *   2. FileWriter
 *   3. FileReader
 *   4. BufferedReader
 *   5. BufferedWriter
 *   6. PrintWriter
 * 
 * 
 *  File f = new File("abc.txt");
 *    
 *     The above line wont create any physical file. First it will check,is there any physical
 *     file named with abc.txt is available or not. If it is available then f simply refers that
 *     file.
 *     
 *     If it is not available then we are just creating java file object to represent the name
 *     abc.txt.
 *     
 *     We can use java file object to represent directory also.
 *     
 *     File f  = new File("Durga123");
 *     System.out.println(f.exists())(); //False
 *     f.mkdir();
 *     System.out.println(f.exists()); //True
 *     
 *     Note:
 *     In unix everything is treated as file,Java file I/O concept is implemented based on
 *     Unix operating system. Hence java file object can be used to represent both files
 *     and directories.
 *     
 *     File class constructors:
 *        
 *       1. File f = new File(String name);
 *        
 *         It creates  a java file object to represent the name of the file or directory in current
 *         working directory.
 *         
 *       2. File f = new File(String subDir,String name);
 *            Creates a java file object to represent name of the file or directory present in 
 *            specified sub directory.
 *            
 *            
 *       3. File f = new File(File subDir,String name);
 *            
 *                 
 *        
 *        Ex 1:
 *               
 *               Write a program to named with abc.txt in current working directory.
 *               
 *               File f = new File("abc.txt");
 *               f.createNewFile();
 *               First constructor has been used.
 *               
 *         Ex 2:
 *                 Write a program to create a directory named with Durga123 in current working
 *                 directory and create a file name with demo.txt in that directory.
 *                 
 *                File f = new File("Durga123");
 *                f.mkdir();
 *                File f1 = new File("Durga123","demo.txt); //2ND constructor
 *                f1.createNewFile
 *                File  f2 = new File(f,"demo.txt") //3rd constructor
 *                f2.createNewFile();
 *                
 *                
 *          Ex 3:
 *              
 *              Write a program to create a file named with abc.txt in E: xyz folder.
 *              it works only in windows and also assumes that E:\\xyz is already
 *              available in our system.
 *              
 *               File f = new File("E:\\xyz,"abc.txt");
 *               f.createNewFile();
 *               
 *               
 *        Methods in File Class:
 *        
 *                1. boolean exists();
 *                         Returns true,if we specify the file or directory available.
 *                         
 *                2. boolean createNewFile();
 *                     First it checks,whether the specified file is already available or
 *                     not. If it is already available,then this method returns false,without
 *                     creating any physical file.
 *                     If the file is not already available,then this method creates a new 
 *                     file and returns true.
 *                     
 *                3. boolean mkdir();
 *                       
 *                       Same as above
 *                       
 *                4. boolean isFile();        
 *                        Returns true,if the specified file object,pointing to physical file.
 *                        
 *                5. boolean isDir();
 *                        
 *                6. String[] list();
 *                        Returns the names of all files and subdirectories present in
 *                        specified directory.
 *                        
 *                7. long length();
 *                       Returns no of characters present in specified file
 *                       
 *                8. boolean delete();
 *                         To delete specified file or directory.               
 *                    
 * 
 */
public class FileIOEx1 {

	public static void main(String[] args) {
		File f = new File("abc.txt"); 
		System.out.println(f.exists()); //False
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(f.exists()); //True
		
		//Write a program to display the names of all files and directories present in
		// *           C: durga-classes.
	           
		File f2 = new File("/home/santhosh/");
		String[] list = f2.list();
		int count = 0;
		for(String list1:list) {
			
			System.out.println("Name of the file: "+list1);
			count++;
			
			
		}System.out.println("No of files: "+count);
		
		
		//To display only file names:
		int count1 = 0;
        for(String list1:list) {
			
			File f3 = new File(f2,list1);
			if(f3.isFile()) {
				count1++;	
				System.out.println("Name of the file: "+list1);
			}
		}System.out.println("No of files: "+count1);
		
		
		
		//To display only directory names:
		//We need to replace the method as isDirectory from isFile().
				int count2 = 0;
		        for(String list1:list) {
					
					File f3 = new File(f2,list1);
					if(f3.isDirectory()) {
						count2++;	
						System.out.println("Name of the file: "+list1);
					}
				}System.out.println("No of directories: "+count2);
				
				
		
	}
}
