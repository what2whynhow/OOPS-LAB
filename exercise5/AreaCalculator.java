class AreaCalculator {
    // Method 1: Calculate area of circle
    double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Method 2: Calculate area of rectangle
    double calculateArea(double length, double width) {
        return length * width;
    }

    // Method 3: Calculate area of triangle
    double calculateArea(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            return 0.5 * base * height;
        }
        return 0.0; // Default
    }
}

public class AreaCalculator {
    public static void main(String[] args) {
        AreaCalculator calc = new AreaCalculator();

        System.out.println("Circle Area: " + calc.calculateArea(5));
        System.out.println("Rectangle Area: " + calc.calculateArea(4, 6));
        System.out.println("Triangle Area: " + calc.calculateArea(3, 4, true));
    }
}