public class Main {

    public static void main(String[] args) {
        Author author = new Author("Федор", "Достоевский");
        Book book = new Book(" Преступление и наказание", author,1866);


        System.out.printf("%s автор %s %s, %d%n" ,
                 book.getBookName(),
                 book.getAuthor().getFirstName(),
                 book.getAuthor().getLastName(),
                 book.getBookAge());
      book.setBookAge(1865);

        System.out.printf("%s автор %s %s, %d%n" ,
                book.getBookName(),
                book.getAuthor().getFirstName(),
                book.getAuthor().getLastName(),
                book.getBookAge());

        Author author1 = new Author( "Лев", " Толстой");
        Book book1 = new Book(" Война и мир", author1,1867);


        System.out.printf("%s автор %s %s, %d%n" ,
                book1.getBookName(),
                book1.getAuthor().getFirstName(),
                book1.getAuthor().getLastName(),
                book1.getBookAge());



    }

}