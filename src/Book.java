public class Book {
    private String title;
    private String author;
    private String isbn;
    private int quantity;

    public Book(String title, String author, String isbn, int quantity){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.quantity = quantity;
    }

    //Getter to quantity
    public int getQuantity(){
        return quantity;
    }

    //Setter to quantity
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    //Getter to title
    public String getTitle(){
        return title;
    }
    //Setter to title
    public void setTitle(String title){
        this.title = title;
    }

    // Getter to ISBN
    public String getIsbn(){
        return isbn;
    }

    // Getters and Setters
    @Override
    public String toString(){
        return "Book: "+title+" - Author: "+author+" - ISBN: "+isbn+"- Quantity: "+quantity;
    }
}
