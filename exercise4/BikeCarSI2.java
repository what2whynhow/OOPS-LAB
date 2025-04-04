// Base class
class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    void showDetails() {
        System.out.println("Brand: " + brand);
    }
}

// Derived class
class Car extends Vehicle {
    int year;

    Car(String brand, int year) {
        super(brand); // Call parent constructor
        this.year = year;
    }

    void displayCar() {
        showDetails(); // Call parent method
        System.out.println("Year: " + year);
    }
}

public class BikeCarSI2 {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2020);
        car.displayCar();
    }
}