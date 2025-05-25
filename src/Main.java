import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Student Management System");
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(123456, "Mark Henry", 2.89));
        students.add(new Student(192344, "Mary Doe", 3.11));
        students.add(new Student(112910, "Liam Jackson", 2.4));
        students.add(new Student(345611, "Frank Ocean", 4.0));

        while (true) {

            System.out.println("--------------------------------------");
            System.out.println("Option one: Add Student");
            System.out.println("Option two: View All Students");
            System.out.println("Option three: Delete Student");
            System.out.println("Option four: Search for a Student");
            System.out.println("Option five: Update student records");
            System.out.println("Option seven: Exit Program");
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
                    if (cont.equalsIgnoreCase("N")) {
                        break;
                    }
                }

            }else if (option == 2) {
                System.out.println("View All Students");

                for (Student student : students){
                    System.out.println(student);
                }

            }else if (option == 3) {

                System.out.println("Delete Student");

                System.out.print("Enter the ID of the student you want to delete: ");
                int studentID = sc.nextInt();
                sc.nextLine();

                System.out.println("Are you sure you want to permanently delete this students record? y/n");
                String cont = sc.next();


                if (cont.equalsIgnoreCase("Y")) {
                    iterateListAndDelete(students, studentID);

                } else if (cont.equalsIgnoreCase("N")) {
                    System.out.println("Exiting to menu");
                    break;
                }

            } else if (option == 4) {
                System.out.println("Search for a student");
                System.out.print("Search by ID or by name?(ID/name): ");
                while(true) {

                    String searchValue = sc.nextLine();


                    if (searchValue.equalsIgnoreCase("ID")) {
                        System.out.print("Enter the student ID:");
                        int studentID = sc.nextInt();
                        sc.nextLine();

                        for (Student student : students) {
                            if (student.getStudentID() == studentID) {
                                System.out.println("Student Found");
                                System.out.println(student);
                                break;
                            }
                        }
                        System.out.println("Continue? y/n");
                        String cont = sc.next();
                        if (Objects.equals(cont, "n") || Objects.equals(cont, "N")) {
                            break;
                        }
                    }else if (searchValue.equalsIgnoreCase("name")){
                        System.out.println("*Case sensitive*");
                        System.out.print("Enter the students name: ");
                        String studentName = sc.nextLine();

                        for (Student student : students){
                           if(student.getName().equals(studentName)){
                               System.out.println("Student record found.");
                               System.out.println(student);
                               break;
                           }
                        }

                        System.out.println("Continue? y/n");
                        String cont = sc.next();
                        if (cont.equalsIgnoreCase("n")) {
                            break;

                        }
                    }


                }

            } else if (option == 5) {
                System.out.println("Update Student Records");
                System.out.print("Please enter the students ID:");

                int studentID = sc.nextInt();
                sc.nextLine();
                System.out.print("Update name or Gpa?(name/gpa) : ");
                String selection = sc.nextLine();
               iterateAndUpdate(students, studentID,selection);




            } else if (option == 7) {
                System.out.println("Exiting Program...");
                break;
            }

        }

    }

    private static void iterateListAndDelete(ArrayList<Student> students, int studentID) {
        Iterator<Student> iterator = students.iterator();

        while(iterator.hasNext()){
            Student student = iterator.next();
            if (student.getStudentID() == studentID){
                iterator.remove();
                System.out.println("Student data deleted.");
                break;
            }

        }
    }

    private static void iterateAndUpdate(ArrayList<Student> students, int studentID, String selection) {
        Iterator<Student> iterator = students.iterator();
        Scanner sc = new Scanner(System.in);

        if (selection.equalsIgnoreCase("name")){
            System.out.print("Enter the new name:");
            String newName = sc.nextLine();

            while(iterator.hasNext()){
                Student student = iterator.next();
                if (student.getStudentID() == studentID){
                    student.updateName(newName);
                    System.out.println("Student name updated.");
                    System.out.println("Modified student field: " + student);
                    break;
                }

            }
        } else if (selection.equalsIgnoreCase("gpa")) {
            System.out.print("Enter the new GPA:");
            double newGpa = sc.nextDouble();

            while(iterator.hasNext()){
                Student student = iterator.next();
                if (student.getStudentID() == studentID){
                    student.updateGpa(newGpa);
                    System.out.println("Student GPA updated.");
                    System.out.println("Modified student field: " + student);
                    break;
                }

            }
        }


    }
}