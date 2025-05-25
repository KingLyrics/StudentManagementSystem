import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to Student Management System");
            System.out.println("--------------------------------------");
            System.out.println("Option one: Add Student");
            System.out.println("Option two: View All Students");
            System.out.println("Option three: Delete Student");
            System.out.println("Option four: Exit Program");
            System.out.print("Selection: ");

            int option = sc.nextInt();

            if (option == 1) {
                System.out.println("Adding Student...");

            }else if (option == 2) {

            }else if (option == 3) {

            }else if (option == 4) {
                System.out.println("Exiting Program...");
                break;
            }

        }

    }
}