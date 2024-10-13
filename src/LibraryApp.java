import java.util.Scanner;

public class LibraryApp {
    public static void main(String [] args){

        BookRepository bookRepo = new BookRepository();
        UserRepository userRepo = new UserRepository();
        LoanService loanService = new LoanService(bookRepo, userRepo);

        Scanner scanner = new Scanner(System.in);

        // Add data to test
        bookRepo.addBook(new Book("The Lord Of The Rings", "J. R. R. Tolkien", "001", 1));
        userRepo.addUser(new User("Anny", "01", "any@gmail.com"));

        bookRepo.addBook(new Book("Crime And Punishment", "Fyodor Dostoevsky", "002", 2));
        userRepo.addUser(new User("Someone", "02", "someone@gmail.com"));


        System.out.println("Enter the ISBN to Loan: ");
        String isbn = scanner.nextLine();

        System.out.println("Enter to user ID: ");
        String userID = scanner.nextLine();

        loanService.makeLoan(isbn, userID);

        scanner.close();

    }
}
