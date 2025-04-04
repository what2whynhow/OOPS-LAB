import java.io.*;
import java.util.zip.*;
import java.nio.file.*;

public class FileCompressor {
    // Function to compress a file
    public static void compressFile(String filePath, String zipFilePath) {
        try (FileInputStream fis = new FileInputStream(filePath);
             FileOutputStream fos = new FileOutputStream(zipFilePath);
             ZipOutputStream zos = new ZipOutputStream(fos)) {
            
            // Create a zip entry
            ZipEntry zipEntry = new ZipEntry(new File(filePath).getName());
            zos.putNextEntry(zipEntry);

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                zos.write(buffer, 0, bytesRead);
            }

            zos.closeEntry();
            System.out.println("File compressed successfully: " + zipFilePath);
        } catch (IOException e) {
            System.out.println("Error during compression: " + e.getMessage());
        }
    }

    // Function to decompress a file
    public static void decompressFile(String zipFilePath, String outputFilePath) {
        try (FileInputStream fis = new FileInputStream(zipFilePath);
             ZipInputStream zis = new ZipInputStream(fis);
             FileOutputStream fos = new FileOutputStream(outputFilePath)) {
            
            ZipEntry entry = zis.getNextEntry();
            if (entry == null) {
                System.out.println("Invalid ZIP file.");
                return;
            }

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = zis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("File decompressed successfully: " + outputFilePath);
        } catch (IOException e) {
            System.out.println("Error during decompression: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String inputFile = "example.txt";  // File to be compressed
        String zipFile = "example.zip";   // Compressed file
        String outputFile = "decompressed_example.txt"; // Decompressed file
        
        // Create a sample file
        try {
            Files.writeString(Path.of(inputFile), "Hello, this is a test file for compression!");
        } catch (IOException e) {
            System.out.println("Error creating sample file: " + e.getMessage());
        }

        // Compress and decompress the file
        compressFile(inputFile, zipFile);
        decompressFile(zipFile, outputFile);
    }
}
