package oops.concepts;

public class Application extends Book{
    public static void main(String[] args) {
        Book langbook = new Book("python", "zbn12214", 777, "James g","Rented");
        Book storybook = new Book("Goldilocks", "mvjshf2132", 333,"Johannes","Rented");
        Book storybook2 = new Book("Goldilocks", "mvjshf2132", 333,"Johannes","Rented");
        Book langbook1 = new Book("python", "zbn12214", 777, "James g","Rent");

        langbook.printBook();
        storybook.printBook();
        storybook2.printBook();

        System.out.println("Total Number of books " + intNoOfBooks );
    }

}
