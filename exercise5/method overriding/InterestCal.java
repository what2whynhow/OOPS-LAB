// Base class
class BankAccount {
    double calculateInterest(double amount) {
        return amount * 0.02; // 2% interest
    }

    void displayInterest(double amount) {
        System.out.println("Interest: $" + calculateInterest(amount));
    }
}

// Derived class
class SavingsAccount extends BankAccount {
    @Override
    double calculateInterest(double amount) {
        return amount * 0.05; // 5% interest for savings
    }
}

public class InterestCal {
    public static void main(String[] args) {
        BankAccount regular = new BankAccount();
        SavingsAccount savings = new SavingsAccount();

        System.out.println("Regular Account:");
        regular.displayInterest(1000);

        System.out.println("Savings Account:");
        savings.displayInterest(1000);
    }
}