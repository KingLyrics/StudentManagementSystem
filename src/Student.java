public class Student {
    private final int studentID;
    private final String name;
    private double gpa;

    Student(int studentID, String name, double gpa) {
        this.studentID = studentID;
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" + "studentID=" + studentID + ", name=" + name + ", gpa=" + gpa + '}';
    }


}
