package ch2;

interface FooSprite{int bar();

 
}
public class Sprite {
public int fubar(FooSprite foo) {return foo.bar();}

public void testFoo() {
	fubar(new FooSprite () {public int bar() {return 1;}

	});

	}

public static void main(String args[]) {
	Sprite spr = new Sprite();
	spr.testFoo();
}
}
