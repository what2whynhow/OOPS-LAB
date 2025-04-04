import java.util.Scanner;

// Abstract class Payment
abstract class Payment {
    protected double amount;

    // Constructor
    public Payment(double amount) {
        this.amount = amount;
    }

    // Abstract method to process payment
    abstract void processPayment();
}

// Concrete class for Credit Card Payment
class CreditCard extends Payment {
    private String cardNumber;

    public CreditCard(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    void processPayment() {
        System.out.println("Processing Credit Card payment of ₹" + amount);
        System.out.println("Payment Successful using Card: " + cardNumber);
    }
}

// Concrete class for UPI Payment
class UPI extends Payment {
    private String upiID;

    public UPI(double amount, String upiID) {
        super(amount);
        this.upiID = upiID;
    }

    @Override
    void processPayment() {
        System.out.println("Processing UPI payment of ₹" + amount);
        System.out.println("Payment Successful using UPI ID: " + upiID);
    }
}

public class OnlinePayment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter payment amount: ");
        double amount = scanner.nextDouble();
        
        Payment payment = new CreditCard(amount, "1234-5678-9876-5432");
        payment.processPayment();

        payment = new UPI(amount, "user@upi");
        payment.processPayment();

        scanner.close();
    }
}
