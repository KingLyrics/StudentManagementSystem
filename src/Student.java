public class Student {
    private final int studentID;
    private  String name;
    private  double gpa;

    Student(int studentID, String name, double gpa) {
        this.studentID = studentID;
        this.name = name;
        this.gpa = gpa;
    }

    public int getStudentID(){
        return this.studentID;
    }

    public String getName() {
        return this.name;
    }

    public void updateName(String newName){
        this.name = newName;
    }

    public void updateGpa(double newGpa){
        this.gpa = newGpa;
    }

    @Override
    public String toString() {
        return "Student{" + "studentID=" + studentID + ", name=" + name + ", gpa=" + gpa + '}';
    }


}
