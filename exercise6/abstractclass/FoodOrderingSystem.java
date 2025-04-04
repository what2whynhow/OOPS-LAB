import java.util.Scanner;

// Abstract class FoodItem
abstract class FoodItem {
    protected String name;
    protected double basePrice;

    public FoodItem(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    // Abstract method to calculate final price
    abstract double calculatePrice(int quantity);

    public void displayInfo() {
        System.out.println(name + " - ₹" + basePrice);
    }
}

// Concrete class Pizza
class Pizza extends FoodItem {
    private String size;

    public Pizza(String size) {
        super("Pizza", size.equals("Large") ? 500 : 300);
        this.size = size;
    }

    @Override
    double calculatePrice(int quantity) {
        return basePrice * quantity;
    }
}

// Concrete class Burger
class Burger extends FoodItem {
    private boolean isCheeseAdded;

    public Burger(boolean isCheeseAdded) {
        super("Burger", isCheeseAdded ? 200 : 150);
        this.isCheeseAdded = isCheeseAdded;
    }

    @Override
    double calculatePrice(int quantity) {
        return basePrice * quantity;
    }
}

public class FoodOrderingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ordering Pizza
        System.out.print("Choose Pizza Size (Small/Large): ");
        String size = scanner.next();
        System.out.print("Enter quantity: ");
        int pizzaQty = scanner.nextInt();
        FoodItem pizza = new Pizza(size);
        System.out.println("Total Pizza Price: ₹" + pizza.calculatePrice(pizzaQty));

        // Ordering Burger
        System.out.print("Do you want extra cheese in Burger? (yes/no): ");
        boolean cheese = scanner.next().equalsIgnoreCase("yes");
        System.out.print("Enter quantity: ");
        int burgerQty = scanner.nextInt();
        FoodItem burger = new Burger(cheese);
        System.out.println("Total Burger Price: ₹" + burger.calculatePrice(burgerQty));

        scanner.close();
    }
}
