import java.util.Scanner;

// Interface SecurityDevice
interface SecurityDevice {
    void activate();
    void deactivate();
}

// CCTV Camera class implementing SecurityDevice
class CCTV implements SecurityDevice {
    @Override
    public void activate() {
        System.out.println("CCTV Camera is now recording.");
    }

    @Override
    public void deactivate() {
        System.out.println("CCTV Camera is turned off.");
    }
}

// Smart Lock class implementing SecurityDevice
class SmartLock implements SecurityDevice {
    @Override
    public void activate() {
        System.out.println("Smart Lock is now locked.");
    }

    @Override
    public void deactivate() {
        System.out.println("Smart Lock is unlocked.");
    }
}

// Alarm System class implementing SecurityDevice
class AlarmSystem implements SecurityDevice {
    @Override
    public void activate() {
        System.out.println("Alarm System is activated. Intruders will be detected!");
    }

    @Override
    public void deactivate() {
        System.out.println("Alarm System is deactivated.");
    }
}

public class HomeSecuritySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SecurityDevice[] devices = { new CCTV(), new SmartLock(), new AlarmSystem() };

        System.out.println("Choose an action: \n1. Activate Security \n2. Deactivate Security");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                for (SecurityDevice device : devices) {
                    device.activate();
                }
                break;
            case 2:
                for (SecurityDevice device : devices) {
                    device.deactivate();
                }
                break;
            default:
                System.out.println("Invalid option.");
        }

        scanner.close();
    }
}
