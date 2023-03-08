public class Notebook {
    int weight;
    int price;
    int year;

    String brand;
    public Notebook(String brand, int weight, int price, int year) {
        this.brand = brand;
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap");
        } else if (this.price >= 600 && this.price < 1000){
            System.out.println("The price is good");
        } else {
            System.out.println("This notebook is expensive");
        }
    }

    public void checkWeight () {
        if (this.weight < 800) {
            System.out.println("This notebook is light");
        } else if (this.weight >= 800 && this.weight < 1200) {
            System.out.println("This notebook is not to heavy");
        } else {
            System.out.println("This notebook is very heavy");
        }
    }

    public void checkYear () {
        if (this.year < 2016) {
            System.out.println("This notebook is very old");
        } else if (this.year >= 2006 && this.year < 2020) {
            System.out.println("This notebook is quite old");
        } else if (this.year >= 2020 && this.year < 2023) {
            System.out.println("This notebook is quite new");
        } else {
            System.out.println("This notebook is new");
        }
    }

    public void serviceComment () {
        if (this.year < 2018 && this.price > 600 || this.year >= 2018 && this.year < 2020 && this.price > 800 || this.year >= 2020 && this.year < 2022 && this.price > 1000
                || this.year >= 2022 && this.price > 1800) {
            System.out.println("The price for this year is too high");
        } else if (this.year < 2018 && this.price <= 600 || this.year >= 2018 && this.year < 2020 && this.price <= 800 || this.year >= 2020 && this.year < 2022 && this.price <= 1000
                || this.year >= 2022 && this.price <= 1800) {
            System.out.println("The price for this year is good");
        }
    }


}
