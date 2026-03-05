package student_management;
import java.util.ArrayList;
import java.util.Scanner;

class Student {

    private int id;
    private String name;
    private int age;
    private String course;

    public Student(int id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void displayStudent() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("---------------------------");
    }
}

class StudentManager {

    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student Added Successfully.");
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student s : students) {
                s.displayStudent();
            }
        }
    }

    public void searchStudent(int id) {
        boolean found = false;

        for (Student s : students) {
            if (s.getId() == id) {
                s.displayStudent();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }
    }

    public void deleteStudent(int id) {
        Student removeStudent = null;

        for (Student s : students) {
            if (s.getId() == id) {
                removeStudent = s;
            }
        }

        if (removeStudent != null) {
            students.remove(removeStudent);
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }
}

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        int choice;

        do {

            System.out.println("\n---- Student Management System ----");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    Student s = new Student(id, name, age, course);
                    manager.addStudent(s);

                    break;

                case 2:
                    manager.viewStudents();
                    break;

                case 3:
                    System.out.print("Enter Student ID to search: ");
                    int searchId = sc.nextInt();
                    manager.searchStudent(searchId);
                    break;

                case 4:
                    System.out.print("Enter Student ID to delete: ");
                    int deleteId = sc.nextInt();
                    manager.deleteStudent(deleteId);
                    break;

                case 5:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}
