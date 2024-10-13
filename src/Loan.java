import java.time.LocalDate;

public class Loan {
    private User user;
    private Book book;
    private LocalDate dateLoan;
    private LocalDate returnDate;

    public Loan(User user, Book book){
        this.user = user;
        this. book = book;
        this.dateLoan = LocalDate.now();
        this.returnDate = dateLoan.plusWeeks(2); // 2 loan weeks
    }

    @Override
    public String toString(){
        return "Loan: "+book.getTitle()+" to "+user.getName()+" - Return Date: "+returnDate;
    }
}
