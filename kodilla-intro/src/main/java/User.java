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
        User konrad = new User("Konrad", 33);
        User adam = new User("Adam", 24);
        User magda = new User("Magda", 34);
        User kamil = new User("Kamil", 30);
        User radek = new User("Radek",40);
        User piotr = new User("Piotr", 54);
        User jozef = new User("Jozef", 72);
        User jakub = new User("Jakub", 2);

        User[] users = {konrad, adam, magda, kamil, radek, piotr, jozef, jakub};

        float sum = 0;
        for (User user: users) {
            sum = sum + user.getAge();
        }

        float average = (float) sum / users.length;

        System.out.println("Users whose age is below average:");
        for (User user: users) {
            if (user.getAge() < average) {
                System.out.println(user.getName());
            }
        }
    }*/
}