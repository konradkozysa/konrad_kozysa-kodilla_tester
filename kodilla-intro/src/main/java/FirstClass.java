import javax.swing.plaf.synth.SynthTextAreaUI;

public class FirstClass {
    public static void main(String[] args) {         // [2]
        String welcome = sayHello();
        System.out.println(welcome);
    }
    private static String sayHello() {
        String text = "Hello from FirstClass!";
        return text;
    }
}
