package ch2;

//https://www.itcsolutions.eu/2011/04/23/tutorial-java-scjp-16-constructors/
public class Book {
	float price;
    String title;
    String author;
 
    public void Book(){
        price = 100;
        title = "Nothing";
        author = "Anonymous";
    }
 
    public Book(String Title, String Author){
        this();
        price = 0;      //default value
        title = Title;
        author = Author;
        System.out.println(price);
    }
 
    public Book() {
    	price = 100; 	}

	public static void main(String[] args){
        Book myFirstBook = new Book("Dune","Frank Herbert");
        Book mySecondBook = new Book();
    }
 

}
