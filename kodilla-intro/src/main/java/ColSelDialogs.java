import java.util.Scanner;

public class ColSelDialogs {
    public static String getUserLetter () {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Select the first letter of the color");
            String letter = scanner.nextLine().trim().toUpperCase();
            switch (letter) {
                case "R": return "R";
                case "O": return "O";
                case "Y": return "Y";
                case "G": return "G";
                case "B": return "B";
                case "P": return "P";
                case "W": return "W";
                default:
                    System.out.println("You need to choose a different color ;)");
            }
        }

    }
}
