// Base class
class Transport {
    String mode;

    Transport(String mode) {
        this.mode = mode;
    }

    void move() {
        System.out.println(mode + " is moving.");
    }
}

// Derived class 1
class LandTransport extends Transport {
    int wheels;

    LandTransport(String mode, int wheels) {
        super(mode);
        this.wheels = wheels;
    }

    void drive() {
        System.out.println(mode + " is driven on " + wheels + " wheels.");
    }
}

// Derived class 2
class AirTransport extends Transport {
    boolean hasWings;

    AirTransport(String mode, boolean hasWings) {
        super(mode);
        this.hasWings = hasWings;
    }

    void fly() {
        System.out.println(mode + " is flying.");
    }
}

// Derived class (hybrid: inherits from AirTransport)
class Helicopter extends AirTransport {
    int rotors;

    Helicopter(String mode, boolean hasWings, int rotors) {
        super(mode, hasWings);
        this.rotors = rotors;
    }

    void hover() {
        System.out.println(mode + " is hovering with " + rotors + " rotors.");
    }
}

public class TransportHYI2 {
    public static void main(String[] args) {
        Helicopter heli = new Helicopter("Helicopter", false, 2);
        heli.move();
        heli.fly();
        heli.hover();
    }
}