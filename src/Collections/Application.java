package Collections;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args){
    //store the book objects in list and retrieve them
        ArrayList <Books>  books = new ArrayList<>();

        Books book1 = new Books("Language","ABCD123");
        books.add(book1);

        Books book2 = new Books("Science","CDEF456");
        books.add(book1);

        Books book3 = new Books("Science","GHIJ789");
        books.add(book3);

        Books book4 = new Books("Science","QWERT567");
        books.add(book4);

        for (Books book:books){
            System.out.println(book.stringIsbn + " " + book.stringName );
        }


    }
}
