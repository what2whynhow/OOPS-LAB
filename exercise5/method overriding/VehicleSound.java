// Base class
class Vehicle {
    void makeSound() {
        System.out.println("Generic vehicle sound");
    }
}

// Derived class
class Car extends Vehicle {
    @Override
    void makeSound() {
        System.out.println("Vroom vroom! (Car sound)");
    }
}

// Derived class
class Motorcycle extends Vehicle {
    @Override
    void makeSound() {
        System.out.println("Brum brum! (Motorcycle sound)");
    }
}

public class VehicleSound {
    public static void main(String[] args) {
        Vehicle generic = new Vehicle();
        Car car = new Car();
        Motorcycle bike = new Motorcycle();

        generic.makeSound();
        car.makeSound();
        bike.makeSound();
    }
}