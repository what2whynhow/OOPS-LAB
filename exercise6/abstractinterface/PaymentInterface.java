interface Payment {
    void processPayment(double amount);
    String getPaymentMethod();
}

class CreditCardPayment implements Payment {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing $" + amount + " via Credit Card ending in " + cardNumber.substring(cardNumber.length() - 4));
    }

    @Override
    public String getPaymentMethod() {
        return "Credit Card";
    }
}

class PayPalPayment implements Payment {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing $" + amount + " via PayPal for " + email);
    }

    @Override
    public String getPaymentMethod() {
        return "PayPal";
    }
}

public class PaymentInterface {
    public static void main(String[] args) {
        Payment credit = new CreditCardPayment("1234567890123456");
        Payment paypal = new PayPalPayment("user@example.com");

        credit.processPayment(100.0);
        System.out.println("Method: " + credit.getPaymentMethod());

        paypal.processPayment(50.0);
        System.out.println("Method: " + paypal.getPaymentMethod());
    }
}