import java.util.Scanner;

// Encapsulated Class for Student
class Student {
    private String name;
    private int rollNumber;
    private int marks;

    // Constructor
    public Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        setMarks(marks); // Using setter to ensure validation
    }

    // Getters
    public String getName() { return name; }
    public int getRollNumber() { return rollNumber; }
    public int getMarks() { return marks; }

    // Setter with validation
    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks! Marks must be between 0 and 100.");
            this.marks = 0; // Default value
        }
    }

    // Display student details
    public void displayInfo() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
}

public class StudentMarksApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for student details
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNumber = scanner.nextInt();

        System.out.print("Enter Marks (0-100): ");
        int marks = scanner.nextInt();

        // Creating student object
        Student student = new Student(name, rollNumber, marks);

        // Displaying student details
        student.displayInfo();

        scanner.close();
    }
}
