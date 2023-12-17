import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        int id;

        String[] Cnames = {"Statistika Industri", "Desain Jaringan Komputer"};
        String[] CIDS = {"101", "102"};
        String[][] Cstudent = {{"Haris", "Metta"}, {"Windy", "Amilia"}};
        String[] Stunames = {"Jasmine"};
        int[] StuIDS = {1202218888};

        Teacher teacher = new Teacher("Yoga Raditya", 1);
        Admin admin = new Admin("Hudza", 2);

        while (true) {
            System.out.println("Enter Student name:");
            name = scanner.nextLine();
            System.out.println("Enter Student ID:");
            try {
                id = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid scanner. Please enter a valid integer for student ID.");
                continue;
            }

            boolean matchFound = false;
            for (int i = 0; i < Stunames.length; i++) {
                if (name.equalsIgnoreCase(Stunames[i]) && id == StuIDS[i]) {
                    matchFound = true;
                    break;
                }
            }

            if (matchFound) {
                System.out.println("Student validated successfully.");
                break;
            } else {
                System.out.println("No match found for the entered name and ID.");
            }
        }

        Student student = new Student(name, id);
        System.out.println("Enter courses to enroll in (Separated by commas):");
        String[] courses = scanner.nextLine().split(",");
        for (String course : courses) {
            student.enrollInCourse(course.trim());
        }

        for (int i = 0; i < Cnames.length; i++) {
            System.out.println("Course ID: " + CIDS[i] + ",");
            System.out.println("Course Name: " + Cnames[i]);
            for (String studentName : Cstudent[i]) {
                System.out.println(" - Student: " + studentName);
            }
            System.out.println();
        }

        System.out.println("Student - " + student.getUserDetail() + ",");

        teacher.teachClass("Math");
        admin.manageSystem("the university system");

        scanner.close();
    }
}