package ch2;

public class ItemTest { 
 private  final int id; 
 public ItemTest(int id) { this.id = id; } 
 //public void updateId(int newId) { id = newId; } 
 public static void main(String[] args) { 
 ItemTest fa = new ItemTest(42); 
 //fa.updateId(69); 
 System.out.println(fa.id); 
 
 Beta1 x = new Beta1();
 Alpha1 a = x;
 Foo1 f = (Alpha1)x;
 Beta1 b =(Beta1)(Alpha1)x;
 Foo1 f1 = (Beta1)x;
 } 
 } 



interface Foo1{
	
}

class Alpha1 implements Foo1{}
class Beta1 extends Alpha1{}
class Delta extends Beta1{}




/*
class SuperClasss {
 public As getA() {
 return new As();
 }
 }
 class SubClasss extends SuperClasss { 
 public Bs getA(){ 
 return new Bs(); 
 } 
 } */
 
 
 
  class AClass { 
	  public void doit() { 
	  } 
	  public String doit(String x) { 
	  return "a"; 
	  } 
	  public double doit(int x) { 
	  return 1.0; 
	 } 
	 } 
