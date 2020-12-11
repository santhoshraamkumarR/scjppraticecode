package serialiazation;

import java.io.File;
import java.io.IOException;

class MakeFile { 
 public static void main(String[] args) { 
 try { 
 File directory = new File("d"); 
 File file = new File("f");
 if(!file.exists()) {
 file.createNewFile();
 }
 } catch (IOException e) {
           e.printStackTrace(); 
 }
 }
 }
