class StringManipulator {
    // Method 1: Concatenate two strings
    String combineStrings(String str1, String str2) {
        return str1 + " " + str2;
    }

    // Method 2: Concatenate three strings
    String combineStrings(String str1, String str2, String str3) {
        return str1 + " " + str2 + " " + str3;
    }

    // Method 3: Repeat string
    String repeatString(String str, int times) {
        String result = "";
        for (int i = 0; i < times; i++) {
            result += str;
        }
        return result;
    }
}

public class StringManipulator {
    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();

        System.out.println("Two strings: " + manipulator.combineStrings("Hello", "World"));
        System.out.println("Three strings: " + manipulator.combineStrings("Hi", "there", "friend"));
        System.out.println("Repeated: " + manipulator.repeatString("Test ", 3));
    }
}