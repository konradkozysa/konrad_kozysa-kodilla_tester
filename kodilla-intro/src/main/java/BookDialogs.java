import java.util.Scanner;

public class BookDialogs {
    public static String getAuthor () {
        Scanner scanAuthor = new Scanner(System.in);
        System.out.println("Enter the author");
        String authorName = scanAuthor.nextLine().trim();
        return authorName;
    }

    public static String getBookName () {
        Scanner scanBookName = new Scanner(System.in);
        System.out.println("Enter the title of the book");
        String bookName = scanBookName.nextLine().trim();
        return bookName;
    }
}
