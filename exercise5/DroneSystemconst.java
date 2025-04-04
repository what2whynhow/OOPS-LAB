// Base class for all drones
class Drone {
    String model;
    int batteryLife;

    // Constructor for base drone
    Drone(String model, int batteryLife) {
        this.model = model;
        this.batteryLife = batteryLife;
    }

    // Polymorphic method
    void performTask() {
        System.out.println(model + " is flying...");
    }
}

// Surveillance Drone
class SurveillanceDrone extends Drone {
    boolean nightVision;

    SurveillanceDrone(String model, int batteryLife, boolean nightVision) {
        super(model, batteryLife);
        this.nightVision = nightVision;
    }

    @Override
    void performTask() {
        System.out.println(model + " is performing surveillance. Night Vision: " + (nightVision ? "Enabled" : "Disabled"));
    }
}

// Delivery Drone
class DeliveryDrone extends Drone {
    double maxPayload;

    DeliveryDrone(String model, int batteryLife, double maxPayload) {
        super(model, batteryLife);
        this.maxPayload = maxPayload;
    }

    @Override
    void performTask() {
        System.out.println(model + " is delivering a package. Max Payload: " + maxPayload + "kg");
    }
}

// Agricultural Drone
class AgriculturalDrone extends Drone {
    int waterCapacity;

    AgriculturalDrone(String model, int batteryLife, int waterCapacity) {
        super(model, batteryLife);
        this.waterCapacity = waterCapacity;
    }

    @Override
    void performTask() {
        System.out.println(model + " is spraying fields. Water Capacity: " + waterCapacity + " liters");
    }
}

// Main class to test drones
public class DroneSystem {
    public static void main(String[] args) {
        Drone d1 = new SurveillanceDrone("EagleEye-X1", 60, true);
        Drone d2 = new DeliveryDrone("SkyDrop-3000", 45, 5.5);
        Drone d3 = new AgriculturalDrone("AgriBot-A5", 80, 20);

        d1.performTask();
        d2.performTask();
        d3.performTask();
    }
}
