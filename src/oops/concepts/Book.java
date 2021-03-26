package oops.concepts;

public class Book extends Assets {

    private String name;
    private String isbn;
    private int pages;
    private String author;
    private String status;

    public static int intNoOfBooks = 0 ;

    public Book(){
                }
    public Book(String name, String isbn, int pages,String author,String status ){

        this.name = name;
        this.isbn = isbn;
        this.pages =pages;
        this.author=author;
        this.status = status;
        //Add numberOfBooks static property to Book class.
        intNoOfBooks = intNoOfBooks +1;
    }

    public void printBook(){
        System.out.println("Book name is " + this.name + ", ISBN is " + this.isbn + ", No. of Pages " + this.pages +
                " and the Author is " + this.author);

    }

    public void statusOfBook(){
        int iNoOfBooksRented=0;
        System.out.println(this.name);
    }

}
