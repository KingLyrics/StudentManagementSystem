import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Student Management System");
        ArrayList<Student> students = new ArrayList<>();
        while (true) {

            System.out.println("--------------------------------------");
            System.out.println("Option one: Add Student");
            System.out.println("Option two: View All Students");
            System.out.println("Option three: Delete Student");
            System.out.println("Option four: Exit Program");
            System.out.print("Selection: ");

            int option = sc.nextInt();


            if (option == 1) {
                while(true) {
                    System.out.println("Adding Student...");
                    System.out.println("Enter Student ID: ");
                    int studentID = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.println("Enter Student GPA: ");
                    double gpa = sc.nextDouble();

                    students.add(new Student(studentID, name, gpa));
                    System.out.println("Student Added Successfully!");


                    System.out.println("Continue? y/n");
                    String cont = sc.next();
                    if (Objects.equals(cont, "n") || Objects.equals(cont, "N")) {
                        break;
                    }
                }

            }else if (option == 2) {
                System.out.println("View All Students");

                for (Student student : students){
                    System.out.println(student);
                }

            }else if (option == 3) {

            }else if (option == 4) {
                System.out.println("Exiting Program...");
                break;
            }

        }

    }
}