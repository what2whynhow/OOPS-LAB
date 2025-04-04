import java.io.FileWriter;
import java.io.IOException;

public class logwriter {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("application.log", true);
            String logMessage = "User logged in at " + java.time.LocalDateTime.now() + "\n";
            writer.write(logMessage);
            writer.close();
            System.out.println("Log written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}