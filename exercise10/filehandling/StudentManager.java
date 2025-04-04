// Import required packages
import studentmanagement.Student;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    private static final String FILE_NAME = "students.dat";
    private static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        loadStudents(); // Load existing data
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Save and Exit");
            System.out.print("Enter choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    // Add a student
                    System.out.print("Enter Roll Number: ");
                    int rollNo = scanner.nextInt();
                    scanner.nextLine(); 

                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Marks: ");
                    double marks = scanner.nextDouble();

                    students.add(new Student(name, rollNo, marks));
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    // Display all students
                    if (students.isEmpty()) {
                        System.out.println("No students available.");
                    } else {
                        System.out.println("\nStudent List:");
                        for (Student s : students) {
                            s.displayStudent();
                        }
                    }
                    break;

                case 3:
                    // Save students and exit
                    saveStudents();
                    System.out.println("Data saved successfully. Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    // Load students from file
    private static void loadStudents() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            students = (ArrayList<Student>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("No previous data found. Starting fresh.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading data: " + e.getMessage());
        }
    }

    // Save students to file
    private static void saveStudents() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(students);
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }
}
