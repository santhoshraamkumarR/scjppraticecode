package ch2;

class Thingy { Component m = new Component(); 
void go() { System.out.print("G"); }        } 
class Component { void go() { System.out.print("c"); } } 
class Meter extends Component { void go() { System.out.print("m"); } } 

class DeluxeThingy extends Thingy { 
	public static void main(String[] args) { 
		DeluxeThingy dt = new DeluxeThingy(); 
		dt.go(); 
		Thingy t = new DeluxeThingy();
		t.m.go(); 
	} 
} 
