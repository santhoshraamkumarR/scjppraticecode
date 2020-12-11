package ch2;

interface TestAA { String toString(); }
 public class TestT {
 public static void main(String[] args) {
 System.out.println(new TestAA() { 
 public String toString() { return "test"; } 
 });  } 
 } 
