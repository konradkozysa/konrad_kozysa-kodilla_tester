import javax.swing.plaf.synth.SynthTextAreaUI;

public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook1 = new Notebook("HP", 1000, 900, 2019);
        Notebook notebook2 = new Notebook("Lenovo", 1500, 1000, 2020);
        Notebook notebook3 = new Notebook("Asus", 800, 400, 2021);
        Notebook notebook4 = new Notebook("Dell", 1300, 600, 2010);
        Notebook notebook5 = new Notebook("Acer", 1000, 750, 2017);
        Notebook notebook6 = new Notebook("Apple", 500, 2000, 2023);
        Notebook notebook7 = new Notebook("Microsoft", 900, 1000, 2015);

        System.out.println(notebook1.brand + " - price: " + notebook1.price + "$; year of production: " + notebook1.year + " ; weight (in grams): " + notebook1.weight);
        System.out.println("Comment:");
        notebook1.checkPrice();
        notebook1.checkYear();
        notebook1.checkWeight();
        notebook1.serviceComment();
        System.out.println();

        System.out.println(notebook2.brand + " - price: " + notebook2.price + "$; year of production: " + notebook2.year + " ; weight (in grams): " + notebook2.weight);
        System.out.println("Comment:");
        notebook2.checkPrice();
        notebook2.checkYear();
        notebook2.checkWeight();
        notebook2.serviceComment();
        System.out.println();

        System.out.println(notebook3.brand + " - price: " + notebook3.price + "$; year of production: " + notebook3.year + " ; weight (in grams): " + notebook3.weight);
        System.out.println("Comment:");
        notebook3.checkPrice();
        notebook3.checkYear();
        notebook3.checkWeight();
        notebook3.serviceComment();
        System.out.println();

        System.out.println(notebook4.brand + " - price: " + notebook4.price + "$; year of production: " + notebook4.year + " ; weight (in grams): " + notebook4.weight);
        System.out.println("Comment:");
        notebook4.checkPrice();
        notebook4.checkYear();
        notebook4.checkWeight();
        notebook4.serviceComment();
        System.out.println();

        System.out.println(notebook5.brand + " - price: " + notebook5.price + "$; year of production: " + notebook5.year + " ; weight (in grams): " + notebook5.weight);
        System.out.println("Comment:");
        notebook5.checkPrice();
        notebook5.checkYear();
        notebook5.checkWeight();
        notebook5.serviceComment();
        System.out.println();

        System.out.println(notebook6.brand + " - price: " + notebook6.price + "$; year of production: " + notebook6.year + " ; weight (in grams): " + notebook6.weight);
        System.out.println("Comment:");
        notebook6.checkPrice();
        notebook6.checkYear();
        notebook6.checkWeight();
        notebook6.serviceComment();
        System.out.println();

        System.out.println(notebook7.brand + " - price: " + notebook7.price + "$; year of production: " + notebook7.year + " ; weight (in grams): " + notebook7.weight);
        System.out.println("Comment:");
        notebook7.checkPrice();
        notebook7.checkYear();
        notebook7.checkWeight();
        notebook7.serviceComment();
        System.out.println();
    }
}
