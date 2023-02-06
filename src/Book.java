public class Book {
    private final String bookName;
    private final Author author;
    private int bookAge;


    public Book(String bookName, Author author, int bookAge) {
        this.bookName = bookName;
        this.author = author;
        this.bookAge = bookAge;
    }

    public String getBookName() {
        return bookName;
    }
    public Author getAuthor () {
        return author;
    }
    public int getBookAge () {
        return bookAge;
    }
    public void setBookAge (int bookAge) {
        this.bookAge = bookAge;
    }


}

