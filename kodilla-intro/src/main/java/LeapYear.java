public class LeapYear {
    public static void main (String[] agrs) {
        int year = 300;

        System.out.println(year);
        System.out.println(year%4);
        if (year%400 == 0 || year%100 != 0 && year%4 == 0) {
            System.out.println("Rok przestępny.");}
        else {
            System.out.println("Rok nie przestępny.");}
        }
    }

