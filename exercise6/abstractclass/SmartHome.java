// Abstract class SmartDevice
abstract class SmartDevice {
    protected String name;

    public SmartDevice(String name) {
        this.name = name;
    }

    // Abstract method to turn on the device
    abstract void turnOn();
}

// Concrete class SmartLight
class SmartLight extends SmartDevice {
    public SmartLight(String name) {
        super(name);
    }

    @Override
    void turnOn() {
        System.out.println(name + " is now ON with warm white light.");
    }
}

// Concrete class SmartFan
class SmartFan extends SmartDevice {
    public SmartFan(String name) {
        super(name);
    }

    @Override
    void turnOn() {
        System.out.println(name + " is now ON at medium speed.");
    }
}

public class SmartHome {
    public static void main(String[] args) {
        SmartDevice light = new SmartLight("Living Room Light");
        SmartDevice fan = new SmartFan("Ceiling Fan");

        light.turnOn();
        fan.turnOn();
    }
}
