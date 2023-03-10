public class ColSelApplication {
    public static void main(String[] args) {
        ColorSelection colorSelection = new ColorSelection();
        String color = colorSelection.colorSelection();
        System.out.println("Your color is: " + color);
    }
}
