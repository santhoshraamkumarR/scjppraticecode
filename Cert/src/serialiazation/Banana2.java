package serialiazation;

import java.io.*; 
 class Food {Food() { System.out.print("1"); } } 
 class Fruit extends Food implements Serializable { 
 Fruit() { System.out.print("2"); } } 
 public class Banana2 extends Fruit implements Serializable { int size = 42; 
 public static void main(String [] args) { 
 Banana2 b = new Banana2(); 
 //b.Banana2(b); // assume correct serialization 
 //b = b.deserializeBanana2(b); // assume correct 
 System.out.println(" restored " + b.size + " "); } 
 }
