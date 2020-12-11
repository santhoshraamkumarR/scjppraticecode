package ch2;

import java.io.*; 
class Animal { 
 Animal() { System.out.print("a"); } 
 } 
 class Dog extends Animal implements Serializable { 
 Dog() { System.out.print("d"); } 
 } 
 public class Beagle extends Dog { 
	 public static void main(String args[]) {
	 Beagle b = new Beagle();
	 }
 } 
