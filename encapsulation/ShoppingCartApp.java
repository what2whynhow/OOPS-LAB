import java.util.ArrayList;
import java.util.List;

// Encapsulated Class for Product
class Product {
    private String name;
    private double price;
    private int quantity;

    // Constructor
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters (Encapsulation)
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    // Setter to update quantity
    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            System.out.println("Quantity must be positive!");
        }
    }
}

// Encapsulated ShoppingCart Class
class ShoppingCart {
    private List<Product> cart = new ArrayList<>();

    // Add product to cart
    public void addProduct(Product product) {
        cart.add(product);
    }

    // Display cart details
    public void displayCart() {
        double total = 0;
        System.out.println("\nYour Shopping Cart:");
        for (Product p : cart) {
            System.out.println(p.getName() + " - ₹" + p.getPrice() + " x " + p.getQuantity());
            total += p.getPrice() * p.getQuantity();
        }
        System.out.println("Total Price: ₹" + total);
    }
}

public class ShoppingCartApp {
    public static void main(String[] args) {
        // Creating products
        Product p1 = new Product("Laptop", 55000, 1);
        Product p2 = new Product("Headphones", 2000, 2);

        // Creating cart and adding products
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(p1);
        cart.addProduct(p2);

        // Display cart details
        cart.displayCart();
    }
}
