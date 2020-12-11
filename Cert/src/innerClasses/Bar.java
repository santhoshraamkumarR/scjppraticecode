//https://www.indiabix.com/java-programming/inner-classes/
package innerClasses;

class Boo 
{
    Boo(String s) { }
    Boo() { }
}
class Bar extends Boo 
{
    Bar() { }
    Bar(String s) {super(s);}
    void zoo() 
    {
    Boo b = new Bar("test");
    
    }
}
