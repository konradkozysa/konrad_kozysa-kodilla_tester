import javax.swing.plaf.synth.SynthTextAreaUI;

public class FirstClass {
    public static void main(String[] args) {         // [2]
        String welcome = sayHello();
        System.out.println(welcome);

        if (1 > 2){
            System.out.println("Niesamowite! Jeden jest większe od dwa.");
        } else {
            System.out.println("Wszystko po staremu, jeden jest mniejsze od dwa.");
        }
    }
    private static String sayHello() {
        String text = "Hello from FirstClass!";
        return text;
    }
}
