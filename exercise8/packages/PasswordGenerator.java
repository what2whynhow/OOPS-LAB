import java.util.Random;    // For random password generation
import java.util.Scanner;   // For user input
import java.time.Instant;   // To measure execution time
import java.time.Duration;  // Calculate time taken

public class PasswordGenerator {
    // Function to generate a random password
    public static String generatePassword(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$%&*!";
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(chars.length());
            password.append(chars.charAt(index));
        }

        return password.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter password length: ");
        int length = scanner.nextInt();

        // Start timing execution
        Instant start = Instant.now();

        // Generate password
        String password = generatePassword(length);
        
        // End timing execution
        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);

        System.out.println("Generated Password: " + password);
        System.out.println("Time taken: " + timeElapsed.toMillis() + " milliseconds");

        scanner.close();
    }
}
