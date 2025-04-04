abstract class Vehicle {
    abstract void start();
    abstract void stop();

    void displayInfo() {
        System.out.println("This is a vehicle.");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car engine started.");
    }

    @Override
    void stop() {
        System.out.println("Car engine stopped.");
    }
}

class Motorcycle extends Vehicle {
    @Override
    void start() {
        System.out.println("Motorcycle engine started.");
    }

    @Override
    void stop() {
        System.out.println("Motorcycle engine stopped.");
    }
}

public class Vehicle {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Motorcycle();

        car.displayInfo();
        car.start();
        car.stop();

        bike.displayInfo();
        bike.start();
        bike.stop();
    }
}