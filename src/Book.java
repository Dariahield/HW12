public class Book {
    private String bookName;
    private String nameAuthor;
    private int bookAge;

    public Book ( String bookName, String nameAuthor, int bookAge ) {
        this.bookName = bookName;
        this.nameAuthor = nameAuthor;
        this.bookAge = bookAge;
    }

    public String getBookName() {
        return this.bookName;
    }
    public String getNameAuthor () {
        return this.nameAuthor;
    }
    public int getBookAge() {
        return this.bookAge;
    }

    public void setBookAge (int bookAge) {
        this.bookAge = bookAge;
    }

    }



