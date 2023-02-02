public class Main {

    public static void start() {


    }

    public static void main(String[] args) {
        Book book = new Book(" Преступление и наказание", " Федор Достоевский ",1866);

        System.out.println("book.bookName = " + book.getBookName());
        System.out.println("author.nameAuthor = " + book.getNameAuthor());
        System.out.println("book.bookAge = " + book.getBookAge());
        book.setBookAge(1865);
        System.out.println("book.setBookAge = " + book.getBookAge());


        Book book1 = new Book( " Война и мир", " Лев Толстой", 1867);


        System.out.println("book1.bookName = " + book1.getBookName());
        System.out.println("author1.nameAuthor = " + book1.getNameAuthor());
        System.out.println("book1.bookAge = " + book1.getBookAge());




    }
}