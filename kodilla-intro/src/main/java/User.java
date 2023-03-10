public class User {
    String name;
    int age;

    public User (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public float getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

    /*public static void main(String[] args) {
        userDescription konrad = new userDescription("Konrad", 33);
        userDescription adam = new userDescription("Adam", 24);
        userDescription magda = new userDescription("Magda", 34);
        userDescription kamil = new userDescription("Kamil", 30);
        userDescription radek = new userDescription("Radek",40);
        userDescription piotr = new userDescription("Piotr", 54);
        userDescription jozef = new userDescription("Jozef", 72);
        userDescription jakub = new userDescription("Jakub", 2);

        userDescription[] users = {konrad, adam, magda, kamil, radek, piotr, jozef, jakub};

        float sum = 0;
        for (userDescription user: users) {
            sum = sum + user.getAge();
        }

        float average = (float) sum / users.length;

        System.out.println("Users whose age is below average:");
        for (userDescription user: users) {
            if (user.getAge() < average) {
                System.out.println(user.getName());
            }
        }
    }*/
}