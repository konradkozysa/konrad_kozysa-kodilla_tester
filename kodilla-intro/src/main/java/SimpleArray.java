public class SimpleArray {
    public static void main(String[] args) {
        String[] carBrands = new String[5];
        carBrands[0] = "VW";
        carBrands[1] = "Volvo";
        carBrands[2] = "Skoda";
        carBrands[3] = "Audi";
        carBrands[4] = "BMW";

        String carBrand = carBrands[3];
        System.out.println(carBrand);

        int numberOfElements = carBrands.length;
        System.out.println("Moja tablica zawiera "+numberOfElements+" elementów");
    }
}
