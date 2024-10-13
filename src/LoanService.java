import java.util.ArrayList;
import java.util.List;

public class LoanService {

    private List<Loan> loans = new ArrayList<>();
    private BookRepository bookRepo;
    private UserRepository userRepo;

    public LoanService(BookRepository bookRepo, UserRepository userRepo){
        this.bookRepo = bookRepo;
        this.userRepo = userRepo;
    }

    public void makeLoan(String isbn, String userId){
        Book book = bookRepo.searchForISBN(isbn);
        User user = userRepo.searchForId(userId);

        if(book != null && user != null && book.getQuantity() > 0){
            Loan loan = new Loan(user, book);
            loans.add(loan);
            book.setQuantity(book.getQuantity() - 1);
            System.out.println("Loan Successfully: "+loan);
        } else{
            System.out.println("Book Isn't Found");
        }
    }

    public List<Loan> loanList(){
        return loans;
    }
}
