package serialiazation;

 import java.io.*;
 class Food1 {Food1() { System.out.print("1"); } }
 class Fruit extends Food1 implements Serializable {
 Fruit() { System.out.print("2"); } }
 public class Banana extends Fruit { int size = 42;
 public static void main(String [] args) {
 Banana b = new Banana();
// b.serializeBanana2(b); // assume correct serialization
// b = b.deserializeBanana2(b); // assume correct
 System.out.println(" restored " + b.size + " "); }
 // more Banana2 methods
 }

