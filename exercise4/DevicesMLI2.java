// Base class
class Device {
    String model;

    Device(String model) {
        this.model = model;
    }

    void powerOn() {
        System.out.println(model + " is powered on.");
    }
}

// Intermediate class
class SmartPhone extends Device {
    boolean hasCamera;

    SmartPhone(String model, boolean hasCamera) {
        super(model);
        this.hasCamera = hasCamera;
    }

    void call() {
        System.out.println(model + " is making a call.");
    }
}

// Derived class
class AndroidPhone extends SmartPhone {
    String version;

    AndroidPhone(String model, boolean hasCamera, String version) {
        super(model, hasCamera);
        this.version = version;
    }

    void update() {
        System.out.println(model + " is updating to Android " + version);
    }
}

public class DevicesMLI2 {
    public static void main(String[] args) {
        AndroidPhone phone = new AndroidPhone("Galaxy", true, "12");
        phone.powerOn();
        phone.call();
        phone.update();
    }
}