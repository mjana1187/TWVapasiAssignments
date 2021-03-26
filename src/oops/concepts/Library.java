package oops.concepts;

public class Library extends Book{
    public static void main(String[] args){
        Book langbook = new Book("python", "zbn12214", 777, "James g","Rent");
        Book storybook = new Book("Goldilocks", "mvjshf2132", 333,"Johannes","Rent");
        Book storybook2 = new Book("Goldilocks", "mvjshf2132", 333,"Johannes","Rent");
        Book langbook1 = new Book("Scala", "zbn12214", 777, "James g","Rent");
        Book PuzzleBook = new Book("Puzzle", "asj287823", 777, " Shakuntala ","Rent");

        langbook.printBook();
        storybook.printBook();
        storybook2.printBook();
        langbook1.printBook();
        PuzzleBook.printBook();

        System.out.println("Total Number of books in stock = " + intNoOfBooks );
        langbook.statusOfBook();
        }
    }

