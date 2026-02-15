import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    double marks;

    Student(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    void displayDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student student = null;

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. View Student");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine(); // clear buffer
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Roll No: ");
                    int roll = sc.nextInt();
                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    student = new Student(name, roll, marks);
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    if (student != null)
                        student.displayDetails();
                    else
                        System.out.println("No student record found.");
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
