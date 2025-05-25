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

    public String updateName(String newName){
        return newName = this.name;
    }

    public double updateGpa(double newGpa){
        return newGpa = this.gpa;
    }

    @Override
    public String toString() {
        return "Student{" + "studentID=" + studentID + ", name=" + name + ", gpa=" + gpa + '}';
    }


}
