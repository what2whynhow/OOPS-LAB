public class ArrayExceptionHandling {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        try {
            System.out.println("Accessing element at index 10: " + numbers[10]); // Invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds! " + e.getMessage());
        } finally {
            System.out.println("Array operation completed.");
        }
    }
}
