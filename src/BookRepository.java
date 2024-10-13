import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    private List<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    public List<Book>listBooks(){
        return books;
    }

    public Book searchForISBN(String isbn){
        for(Book book : books){ // for each
            if(book.getIsbn().equals(isbn)){
                return book;
            }
        }
        return null;
    }
}
