import java.util.ArrayList;

public class ApplicationRunner {
    public static void main(String[] args) {
        Library library = new Library();
        library.books = new ArrayList<Book>();
        System.out.println("Welcome to Biblioteca!");
        while(true) {
            System.out.println("1. List Books");
            System.out.println("2. Add Book");
            System.out.println("9. Quit");
            System.out.println("Enter your choice:");
            int choice = Integer.parseInt(System.console().readLine());
            if(choice == 1) {
                for(int i = 0; i < library.books.size(); i++) {
                    System.out.println(library.books.get(i).title + " by " + library.books.get(i).author);
                }
            }else if(choice == 2) {
                Book newBook = new Book();
                System.out.println("Enter the book title: ");
                String title = System.console().readLine();
                System.out.println("Enter the book author: ");
                String author = System.console().readLine();
                newBook.title = title;
                newBook.author = author;
                library.books.add(newBook);
                System.out.println("Book added succesfully.");
            } else if(choice == 9) {
                break;
            }
        }
    }
}
