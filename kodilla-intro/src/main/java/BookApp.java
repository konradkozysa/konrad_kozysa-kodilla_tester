public class BookApp {
    public static void main (String[] args) {
        Book book = Book.of(BookDialogs.getAuthor(), BookDialogs.getBookName());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Title: " + book.getTitle());
    }
}
