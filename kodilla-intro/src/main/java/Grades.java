public class Grades {
    private float[] grades;
    private int size;

    public Grades() {
        this.grades = new float[10];
        this.size = 0;
    }

    public void add(float value) {
        if (this.size == 10) {
            return;
        }
        this.grades[size] = value;
        this.size++;
    }

    public void lastGrade() {
        System.out.println(this.grades[this.size-1]);
    }

    public void avrGrades () {
        float sum = 0;
        float count = this.size;
        for (int x = 0; x < this.size; x++) {
            sum = sum + this.grades[x];
        }
        System.out.println(sum/count);
    }

    public void showGrades () { //self work
        for (int x = 0; x < this.size; x++) {
            System.out.println(this.grades[x]);
        }
    }
}
