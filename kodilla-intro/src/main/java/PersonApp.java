public class PersonApp {
    public static void main(String[] args) {
        PersonService userInfo = new PersonService("Radek",40,160);
        userInfo.userDescribe();
    }
}
