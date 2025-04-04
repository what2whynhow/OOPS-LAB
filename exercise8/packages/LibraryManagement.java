// Import the package
import library.Book;
import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagement {
    public static void main(String[] args) {
        // Create an ArrayList to store books
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    // Add a new book
                    System.out.print("Enter Book ID: ");
                    int bookID = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter Author Name: ");
                    String author = scanner.nextLine();

                    books.add(new Book(title, author, bookID));
                    System.out.println("Book added successfully!");
                    break;
                
                case 2:
                    // Display all books
                    if (books.isEmpty()) {
                        System.out.println("No books available.");
                    } else {
                        System.out.println("\nBook List:");
                        for (Book book : books) {
                            book.displayBookInfo();
                        }
                    }
                    break;
                
                case 3:
                    // Exit
                    System.out.println("Exiting the Library Management System...");
                    scanner.close();
                    return;
                
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
