import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileExceptionHandling {
    public static void main(String[] args) {
        File file = new File("non_existing_file.txt"); // File does not exist

        try {
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNextLine()) {
                System.out.println(fileReader.nextLine());
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        }
    }
}
