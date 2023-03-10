public class ColorSelection {
    public String colorSelection() {
        String colorLetter = ColSelDialogs.getUserLetter();
        String colorSelected = null;
        switch (colorLetter) {
            case "R":
                colorSelected = "Red";
                break;
            case "O":
                colorSelected = "Orange";
                break;
            case "Y":
                colorSelected = "Yellow";
                break;
            case "G":
                colorSelected = "Green or Gray";
                break;
            case "B":
                colorSelected = "Blue or Black or Brown";
                break;
            case "P":
                colorSelected = "Pink or Purple";
                break;
            case "W":
                colorSelected = "White";
                break;
        }
        return colorSelected;
    }
}
