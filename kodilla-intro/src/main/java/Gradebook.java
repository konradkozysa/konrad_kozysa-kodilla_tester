public class Gradebook {
    public static void main(String[] args) {
        Grades grades = new Grades();
        grades.add(5);
        grades.add(6);
        grades.add(4);
        System.out.println("Grades");
        grades.showGrades();
        System.out.println("Last grade");
        grades.lastGrade();
        System.out.println("Grades average");
        grades.avrGrades();
    }
}
